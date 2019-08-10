package com.theworldsmp.creative.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class PtimeCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

		if(sender instanceof Player) {
			final Player p = (Player) sender;

			if (args.length == 0) {
				p.sendMessage(ChatColor.RED + "Usage: /ptime <day|midday|sunset|night|reset>");
				return false;
			}

			if(args[0].equalsIgnoreCase("day")) {
				p.setPlayerTime(1000, true);
				p.sendMessage(ChatColor.AQUA + "Set player time to " + args[0]);
			}

			else if(args[0].equalsIgnoreCase("midday")) {
				p.setPlayerTime(1, true);
				p.sendMessage(ChatColor.AQUA + "Set player time to " + args[0]);
			}

			else if(args[0].equalsIgnoreCase("sunset")) {
				p.setPlayerTime(7000, true);
				p.sendMessage(ChatColor.AQUA + "Set player time to " + args[0]);
			}

			else if(args[0].equalsIgnoreCase("night")) {
				p.setPlayerTime(13000, true);
				p.sendMessage(ChatColor.AQUA + "Set player time to " + args[0]);
			}

			else if(args[0].equalsIgnoreCase("reset")) {
				p.resetPlayerTime();
				p.sendMessage(ChatColor.AQUA + "Reset player time.");
			}

			else {
				p.sendMessage(ChatColor.RED + "Usage: /ptime <day|midday|sunset|night|reset>");
				return false;
			}

		} else {
			sender.sendMessage(ChatColor.RED + "You must be a player to execute this.");
			return false;
		}

		return false;
	}

}
