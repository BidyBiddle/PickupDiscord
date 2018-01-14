package de.gost0r.pickupbot.pickup.server;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;

import de.gost0r.pickupbot.pickup.Match;

public class Server {

	public int id;
	
	public String IP;
	public int port;
	public String rconpassword;
	public String password;
	public boolean active;
		
	private boolean taken = false;
	
	private DatagramSocket socket;
	
	private ServerMonitor monitor;
	private Thread monitorThread;

	public Server(int id, String ip, int port, String rconpassword, String password, boolean active) {
		this.id = id;
		this.IP = ip;
		this.port = port;
		this.rconpassword = rconpassword;
		this.password = password;
		this.active = active;
	}

	public void connect() {
		try {
			this.socket = new DatagramSocket();
			this.socket.setSoTimeout(1000);
			monitor = null;
		} catch (SocketException e) {
			e.printStackTrace();
		}
	}


	public String sendRcon(String rconString) {
		try {
			String rcon = "xxxxrcon " + rconpassword + " " + rconString;
			
			byte[] recvBuffer = new byte[2048];
			byte[] sendBuffer = rcon.getBytes();
			
			sendBuffer[0] = (byte) 0xff;
			sendBuffer[1] = (byte) 0xff;
			sendBuffer[2] = (byte) 0xff;
			sendBuffer[3] = (byte) 0xff;

//			System.out.println(rcon);

			DatagramPacket sendPacket = new DatagramPacket(sendBuffer, sendBuffer.length, getInetIP(), port);
			DatagramPacket recvPacket = new DatagramPacket(recvBuffer, recvBuffer.length);
			this.socket.send(sendPacket);
			
			String string = "";
	        while (true) {
	        	try {
	        		this.socket.receive(recvPacket);
	        		string += new String(recvPacket.getData());
	        		recvPacket = new DatagramPacket(recvBuffer, recvBuffer.length);
	        	} catch (SocketTimeoutException e) {
	        		break;
	        	}		        
	        }
	        string = string.replace("����print\n", "");
	        string = string.replace("" + (char) 0, "");
	        return string;
		} catch (IOException e1) {
			e1.printStackTrace();
		}
        return null;
	}
	
	public void startObservation(Match match) {
		this.monitor = new ServerMonitor(this, match);
		monitorThread = new Thread(this.monitor);
		monitorThread.start();
	}
	
	public void stopObservation() {
		if (monitor != null) {
			this.monitor.stop();
		}
	}

	public void take() {
		taken = true;
	}
	
	public void free() {
		taken = false;
		stopObservation();
	}

	public InetAddress getInetIP() {
		try {
			return InetAddress.getByName(IP);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		return null;
	}

	public boolean isTaken() {
		return taken;
	}
	
	@Override
	public String toString() {
		return "#" + id + " " + IP + ":" + port + " - active: " + active;
	}

}
