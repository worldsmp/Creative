package com.theworldsmp.creative;

import org.bukkit.plugin.java.JavaPlugin;

import com.theworldsmp.creative.commands.HeadCommand;
import com.theworldsmp.creative.commands.NightvisionCommand;
import com.theworldsmp.creative.commands.PtimeCommand;
import com.theworldsmp.creative.commands.PweatherCommand;

public class Creative extends JavaPlugin {

	public static Creative instance;

	@Override
	public void onEnable() {
		instance = this;
		getCommand("head").setExecutor(new HeadCommand());
		getCommand("ptime").setExecutor(new PtimeCommand());
		getCommand("pweather").setExecutor(new PweatherCommand());
		getCommand("nv").setExecutor(new NightvisionCommand());
	}

	@Override
	public void onDisable() {
		instance = null;
	}

}
