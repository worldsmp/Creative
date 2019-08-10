package com.theworldsmp.creative.commands;

import java.util.ArrayList;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class NightvisionCommand implements CommandExecutor {

	final ArrayList<Player> toggled = new ArrayList<>();

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

		if(sender instanceof Player) {
			final Player p = (Player) sender;

			if (toggled.contains(p)) {
				p.sendMessage(ChatColor.AQUA + "Disabled Night Vision.");
				p.removePotionEffect(PotionEffectType.NIGHT_VISION);
				toggled.remove(p);
			}

			else {
				p.sendMessage(ChatColor.AQUA + "Enabled Night Vision.");
				p.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, Integer.MAX_VALUE, 0), true);
				toggled.add(p);
			}

		} else {
			sender.sendMessage(ChatColor.RED + "You must be a player to execute this.");
			return false;
		}

		return false;
	}

}
