package de.gost0r.pickupbot.pickup;

public class Config {
	public static final String CMD_ADD					= "!add";
	public static final String CMD_TS					= "!ts";
	public static final String CMD_CTF					= "!ctf";
	public static final String CMD_REMOVE				= "!remove";
	public static final String CMD_MAPS					= "!maps";
	public static final String CMD_MAP					= "!map";
	public static final String CMD_STATUS				= "!status";
	public static final String CMD_HELP					= "!help";
	public static final String CMD_SURRENDER			= "!surrender";
	public static final String CMD_LIVE					= "!live";
	
	public static final String CMD_LOCK					= "!lock";
	public static final String CMD_UNLOCK				= "!unlock";
	public static final String CMD_RESET				= "!reset";
	public static final String CMD_GETDATA				= "!getdata";
	public static final String CMD_ENABLEMAP			= "!enablemap";
	public static final String CMD_DISABLEMAP			= "!disablemap";
	public static final String CMD_RCON					= "!rcon";

	public static final String CMD_ENABLEGAMETYPE		= "!enablegametype";
	public static final String CMD_DISABLEGAMETYPE		= "!disablegametype";

	//public static final String CMD_ADDGAMECONFIG		= "!addgameconfig";
	//public static final String CMD_REMOVEGAMECONFIG		= "!delgameconfig";
	public static final String CMD_LISTGAMECONFIG		= "!showgameconfig";
	
	public static final String CMD_REGISTER				= "!register";
	public static final String CMD_COUNTRY	    	    = "!country";
	public static final String CMD_GETELO				= "!elo";
	public static final String CMD_TOP_PLAYERS	    	= "!top10";
	public static final String CMD_TOP_COUNTRIES			= "!topcountries";
	
	public static final String CMD_MATCH				= "!match";
	
	//public static final String CMD_REPORT				= "!report";
	//public static final String CMD_EXCUSE				= "!excuse";
	//public static final String CMD_REPORTLIST			= "!reportlist";
	
	public static final String CMD_ADDBAN				= "!ban";
	public static final String CMD_REMOVEBAN			= "!unban";
	
	public static final String CMD_BANINFO				= "!baninfo";

	public static final String CMD_SHOWSERVERS			= "!showservers";
	public static final String CMD_ADDSERVER			= "!addserver";
	public static final String CMD_ENABLESERVER			= "!enableserver";
	public static final String CMD_DISABLESERVER		= "!disableserver";
	public static final String CMD_UPDATESERVER			= "!updateserver";

	public static final String CMD_SHOWMATCHES			= "!showmatches";
	
	public static final String CMD_UNREGISTER			= "!unregister";

	public static final String CMD_ADDCHANNEL			= "!addchannel";
	public static final String CMD_REMOVECHANNEL		= "!removechannel";

	public static final String CMD_ADDROLE				= "!addrole";
	public static final String CMD_REMOVEROLE			= "!removerole";

	public static final String PUB_LIST = "" + CMD_ADD + " " + CMD_REMOVE + " " + CMD_MAPS + " " + CMD_LIVE + " " + CMD_MATCH + " "
	+ CMD_MAP + " " + CMD_STATUS + " " + CMD_HELP + " " + CMD_REGISTER + " " + CMD_GETELO + " " + CMD_TOP_PLAYERS + " " + CMD_TOP_COUNTRIES
	+ " " + CMD_BANINFO + " " + CMD_COUNTRY + " " + CMD_SURRENDER;
	
	public static final String ADMIN_LIST = "" + CMD_LOCK + " " + CMD_UNLOCK + " " + CMD_RESET + " " + CMD_GETDATA + " "
	+ CMD_ENABLEMAP + " " + CMD_DISABLEMAP + " " + CMD_RCON + " " + CMD_SHOWSERVERS + " " + CMD_ENABLEGAMETYPE + " " + CMD_DISABLEGAMETYPE
	+ " " + CMD_ADDSERVER + " " + CMD_ENABLESERVER + " " + CMD_DISABLESERVER + " " + CMD_UPDATESERVER + " " + CMD_ADDBAN + " " + CMD_SHOWMATCHES
	+ " " + CMD_UNREGISTER  + " " + CMD_LISTGAMECONFIG + " " + CMD_UPDATESERVER + " " + CMD_ADDROLE + " " + CMD_REMOVEROLE + " " + CMD_ADDCHANNEL;
		
//------------------------------------------------------------------------------------//
	

	public static final String USE_CMD_ADD				= "!add <gametype>";
	public static final String USE_CMD_REMOVE			= "!remove <gametype>";
	public static final String USE_CMD_MAPS				= "!maps displays the map list for each gametype";
	public static final String USE_CMD_MAP				= "!map <gametype> <mapname>";
	public static final String USE_CMD_STATUS			= "Type !status to get information on the queues";
	public static final String USE_CMD_HELP				= "!help <command>";
	public static final String USE_CMD_SURRENDER		= "Type !surrender to abandon your match.";
	public static final String USE_CMD_LIVE				= "!live sends info on the live matches";
	
	public static final String USE_CMD_LOCK				= "!lock to prevent commands from PUBLIC channel";
	public static final String USE_CMD_UNLOCK			= "!unlock";
	public static final String USE_CMD_RESET			= "!reset <all/cur/type/id>";
	public static final String USE_CMD_GETDATA			= "!getdata <id>";
	public static final String USE_CMD_ENABLEMAP		= "!enablemap <ut4_map> <gametype>";
	public static final String USE_CMD_DISABLEMAP		= "!disablemap <ut4_map> <gametype>";
	public static final String USE_CMD_RCON				= "!rcon <serverid> <rconstring>";

	public static final String USE_CMD_ENABLEGAMETYPE	= "!enablegametype <name> <teamsize>";
	public static final String USE_CMD_DISABLEGAMETYPE	= "!disablegametype <name>";
	
	//public static final String USE_CMD_ADDGAMECONFIG	= "!addgameconfig <gametype> <string>";
	//public static final String USE_CMD_REMOVEGAMECONFIG	= "!delgameconfig <gametype> <string>";
	public static final String USE_CMD_LISTGAMECONFIG	= "!showgameconfig <gametype>";
	
	public static final String USE_CMD_REGISTER			= "!register <urtauth>";
	public static final String USE_CMD_COUNTRY		    = "!country <COUNTRY CODE> See:` <https://datahub.io/core/country-list/r/0.html>";
	public static final String USE_CMD_CHANGE_COUNTRY	= "!country <DiscordUser> <COUNTRY CODE> See:` <https://datahub.io/core/country-list/r/0.html>";
	public static final String USE_CMD_GETELO			= "!elo </@DiscordUser|urtauth/>";
	public static final String USE_CMD_TOP10			= "!top10";
	public static final String USE_CMD_TOP_COUNTRIES			= "!topcountries";
	public static final String USE_CMD_MATCH			= "!match <id>";
	
	//public static final String USE_CMD_REPORT			= "!report <qauth> <reason>";
	//public static final String USE_CMD_EXCUSE			= "!excuse <excuse>";
	//public static final String USE_CMD_REPORTLIST		= "!reportlist";
	
	public static final String USE_CMD_ADDBAN			= "!ban <urtauth> <reason> <duration> (duration=1y1M1w1d1h1m1s)";
	public static final String USE_CMD_REMOVEBAN		= "!unban <urtauth>";
	public static final String USE_CMD_BANINFO			= "!baninfo </@DiscordUser|urtauth/>";

	public static final String USE_CMD_SHOWSERVERS		= "!showservers";
	public static final String USE_CMD_ADDSERVER		= "!addserver <ip:port> <rcon>";
	public static final String USE_CMD_ENABLESERVER		= "!enableserver <id>";
	public static final String USE_CMD_DISABLESERVER	= "!disableserver <id>";
	public static final String USE_CMD_UPDATESERVER		= "!updateserver <id> <rcon>";
		
	public static final String USE_CMD_SHOWMATCHES		= "!showmatches";
	
	public static final String USE_CMD_UNREGISTER		= "!unregister <urtauth>";
	public static final String USE_CMD_ADDCHANNEL			= "!addchannel <#name> <public/admin>";
	public static final String USE_CMD_REMOVECHANNEL		= "!removechannel <#name> <public/admin>";

	public static final String USE_CMD_ADDROLE				= "!addrole <@role> <admin/superadmin>";
	public static final String USE_CMD_REMOVEROLE			= "!removerole <@role> <admin/superadmin>";
	

	//------------------------------------------------------------------------------------//

	public static final String pkup_lock				= "Pickup games are now locked";
	public static final String pkup_map					= "You voted for .map..";
	public static final String pkup_map_list			= "**.gametype.**: .maplist.";
//	public static final String pkup_signup				= "You can sign up again!";
	public static final String pkup_pw					= "[ /connect .server. ; password .password. ]";
	public static final String pkup_status_noone		= "**.gametype.**: Nobody has signed up. Type `" + USE_CMD_ADD + "` to play.";
	public static final String pkup_status_signup		= "**.gametype.**: Sign up: [.playernumber./.maxplayer.] .playerlist.";
	public static final String pkup_status_server		= "**.gametype.**: Awaiting available server.";
//	public static final String pkup_status_players		= "**.gametype.**: Players [.playernumber./10]: .playerlist.";
//	public static final String pkup_started				= "**.gametype.**: Game has already started. .status. - .time. minutes in.";

	public static final String pkup_reset_all 			= "*All matches and queues have been reset.*";
	public static final String pkup_reset_cur 			= "*All queues have been reset.*";
	public static final String pkup_reset_type 			= "*.gametype. queue has been reset.*";
	public static final String pkup_reset_id 			= "*Match #.id. has been reset.*";
	
	public static final String pkup_match_print_live	= "**[** Pickup Game #.gamenumber. **][** Live **][** .gametype. **][** .map. **][** ELO red: .elored. ELO blue: .eloblue. **][** Players: .playerlist. **]**";
	public static final String pkup_match_print_signup	= "**[** Pickup Game #--- **][** Signup **][** Gametype: .gametype. **][** .playernumber./.maxplayer. **][** Players: .playerlist. **]**";
	public static final String pkup_match_print_server	= "**[** Pickup Game #--- **][** AwaitingServer **][** Gametype: .gametype. **][** Players: .playerlist. **]**";
	public static final String pkup_match_print_done	= "**[** Pickup Game #.gamenumber. **][** Done **][** Score: .score. **][** Gametype: .gametype. **][** .map. **][** ELO red: .elored. ELO blue: .eloblue. **][** Players: .playerlist. **]**";
	public static final String pkup_match_print_abort	= "**[** Pickup Game #.gamenumber. **][** Abort **][** .gametype. **][** .map. **][** ELO red: .elored. ELO blue: .eloblue. **][** Players: .playerlist. **]**";
	public static final String pkup_match_print_abandon	= "**[** Pickup Game #.gamenumber. **][** Abandon **][** .gametype. **][** .map. **][** ELO red: .elored. ELO blue: .eloblue. **][** Players: .playerlist. **]**";
	public static final String pkup_match_print_sur		= "**[** Pickup Game #.gamenumber. **][** Surrender **][** Score: .score. **][** .gametype. **][** .map. **][** ELO red: .elored. ELO blue: .eloblue. **][** Players: .playerlist. **]**";

	public static final String pkup_match_print_info	= "**.gametype. #.gamenumber.**: **[**.map.**] [**.ingame.**] [**.redteam.**]** VS **[**.blueteam.**]**";
	
	public static final String pkup_go_admin			= "[ Pickup Game #.gamenumber. ][ Password: .password. ][ .map. ][ ELO red: .elored. ELO blue: .eloblue. ]";
	public static final String pkup_go_player			= "Pickup starts now! Connect, choose positions and ready up! **[ /connect .server. ; password .password. ]**";
	public static final String pkup_go_pub_head			= "**.gametype.**: Game #.gamenumber. (avg ELO: .elo.) is about to start!";
	public static final String pkup_go_pub_team			= ".team. team: .playerlist.";
	public static final String pkup_go_pub_map			= "Map: .map.";
	public static final String pkup_go_pub_calm			= "You will receive the connection info by DM.";
	public static final String pkup_go_pub_sent			= "**.gametype.**: All messages have been sent. Enjoy the match!";

	public static final String pkup_aftermath_head		= "**.gametype.**: Aftermath #.gamenumber. (.map.):";
	public static final String pkup_aftermath_result	= ".team. .result. (.score.) -";
	public static final String pkup_aftermath_player	= ".player. (.elochange.)";
	public static final String pkup_aftermath_rank		= ".player. was ranked .updown. to **.rank.**";
	public static final String pkup_aftermath_abandon_1	= "Match was abandoned due to **.reason.**.";
	public static final String pkup_aftermath_abandon_2	= ".players. .be. punished accordingly.";

	public static final String pkup_config_list 		= "Gameconfig for .gametype.\n.configlist.";
	
	public static final String pkup_getelo				= "#.position.\t **.rank.**\t .country.   **.urtauth.**\t .elo.\t .wdl.%";
	public static final String pkup_getelo_country		= "#.position.\t .country.\t .elo.";
	public static final String pkup_top10_header		= "**Top players:**";
	public static final String pkup_top5_header		    = "**Top countries:**";
	
	public static final String pkup_surrender_cast		= "You voted to surrender. **.num.** more teammate.s. needed.";
	public static final String pkup_surrender_time		= "You cannot surrender this early. Please wait .time..";
			 
	public static final String is_banned				= ".user. (.urtauth.) is suspended .time. for .reason.";
	public static final String is_unbanned				= ".user. (.urtauth.) is unbanned and can add for a match";
	public static final String is_notbanned				= ".urtauth. is not banned";
	public static final String not_banned				= "No active bans found for .urtauth.";
	public static final String map_not_found			= "Map not found.";
	public static final String map_not_unique			= "Mapstring not unique.";
	public static final String map_cannot_vote			= "You cannot vote right now.";
	public static final String map_specify_gametype		= "You need to specify a **gametype**.";

	public static final String player_not_found			= "Player not found.";
	public static final String user_not_registered		= "You're not registered. Please use `" + USE_CMD_REGISTER + "`";
	public static final String country_added	    	= "Your country has been set";

	public static final String auth_taken_urtauth		= "This **urtauth** is already registered.";
	public static final String auth_taken_user			= "You have already registered an account.";
	public static final String auth_invalid				= "Your **urtauth** seems to be invalid.";
	public static final String auth_success				= "Your **urtauth** has been linked to your account.";
	public static final String auth_sent_key			= "You have to register your auth name and not your auth key!!!";

	public static final String player_already_added		= "You are already added to a pickup game.";
	public static final String player_already_removed	= "You are not added to any pickup game.";
	public static final String player_cannot_add		= "You cannot add right now.";
	public static final String player_cannot_remove		= "You cannot remove.";
	public static final String player_not_in_match		= "You are currently not in a match.";
	public static final String player_already_match		= "You are already in a match.";

	public static final String player_already_surrender	= "You have already surrendered.";
	
	public static final String afk_reminder				= "[*AFK CHECK*] .user. will be removed in 5 minutes.";

//	public static final String report_wrong_arg			= "Your report reason is invalid, check !reportlist to check the possible reasons.";
//	public static final String report_invalid_urtauth	= "No player could be found with this urtauth.";
//	public static final String report_not_played		= "The reported player hasn't played the past match.";
//	public static final String report_didnt_play		= "You haven't played the last match, you aren't able to report someone.";
//	public static final String report_already_reported	= "This player has already been reported by you.";
//	public static final String report_successful		= "Your report was successfully submited.";
//	public static final String report_raise_issue		= ".urtauth. has been auto-banned. [strength: .strength.] Type !review .urtauth. to review the ban.";

	public static final String wrong_argument_amount	= "Wrong amount of arguments: `.cmd.`";
	public static final String help_prefix				= "How to use the command: `.cmd.`";
	public static final String help_cmd_avi				= "Here is the command list (use `" + USE_CMD_HELP + "` for more info):\n`.cmds.`";
	
	public static final String help_unknown				= "I do not know that command.";

	public static final String lock_enable				= "*Game is LOCKED.*";
	public static final String lock_disable				= "*Game is now unlocked.*";

	public static final String pkup_match_unavi 		= "Match is not available right now.";
	public static final String pkup_match_invalid_gt	= "No match for that gametype is available right now.";
	public static final String no_gt_found				= "Unable to find a matching gametype. Try `!add ctf`";
	
	public static final String banreason_not_found		= "Ban reason not found in .banreasons.";	
	public static final String banduration_invalid		= "Invalid ban duration.";
	
	public static final String admin_cmd_successful		= "Successful: ";
	public static final String admin_cmd_unsuccessful	= "Unsuccessful: ";
	public static final String wait_testing_server      = "Testing server list. This can take a while...";
}
