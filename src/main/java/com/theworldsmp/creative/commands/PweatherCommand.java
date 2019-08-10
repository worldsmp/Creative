package com.theworldsmp.creative.commands;

import org.bukkit.ChatColor;
import org.bukkit.WeatherType;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class PweatherCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

		if(sender instanceof Player) {
			final Player p = (Player) sender;

			if (args.length == 0) {
				p.sendMessage(ChatColor.RED + "Usage: /pweather <rain|clear|reset>");
				return false;
			}

			if(args[0].equalsIgnoreCase("rain")) {
				p.setPlayerWeather(WeatherType.DOWNFALL);
				p.sendMessage(ChatColor.AQUA + "Set player weather to " + args[0]);
			}

			else if(args[0].equalsIgnoreCase("clear")) {
				p.setPlayerWeather(WeatherType.CLEAR);
				p.sendMessage(ChatColor.AQUA + "Set player weather to " + args[0]);
			}

			else if(args[0].equalsIgnoreCase("reset")) {
				p.resetPlayerWeather();
				p.sendMessage(ChatColor.AQUA + "Reset player weather.");
			}

			else {
				p.sendMessage(ChatColor.RED + "Usage: /pweather <rain|clear|reset>");
				return false;
			}

		} else {
			sender.sendMessage(ChatColor.RED + "You must be a player to execute this.");
			return false;
		}

		return false;
	}

}
