package de.gost0r.pickupbot.discord;

public class DiscordMessage {
	
	public String id;
	public DiscordUser user;
	public DiscordChannel channel;
	public String content;
	
	public DiscordMessage(String id, DiscordUser user, DiscordChannel channel, String content) {
		this.id = id;
		this.user = user;
		this.channel = channel;
		this.content = content;
	}
}
