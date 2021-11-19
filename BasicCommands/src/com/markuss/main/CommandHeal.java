package com.markuss.main;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;


public class CommandHeal implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if (sender instanceof Player) {
			Player player = (Player) sender;
			
			player.setHealth(20.0);
			player.sendMessage(ChatColor.of("#6C29FB") + player.getName() + ", your health has been restored!");
			
		} else {
			System.out.println("You cannot use this command in console!");
		}
		
		return false;
	}

}
