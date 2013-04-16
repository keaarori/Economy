package com.keaarori.QuickCreative;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class QuickCreative extends JavaPlugin
{
    @Override
    public void onEnable()
    {
    
    }
    @Override
    public void onDisable()
    {
    
    }
    
    @Override
    public boolean onCommand(CommandSender sender, Command command,String label,String[] args)
    {
        
        
        switch (args.length)
        {
           case 0 :
           {
           Commands.getcommands(sender, command, label, args); 
           }
           default :
           {
               sender.sendMessage("You entered" + args.length + "Arguments");
           }
        }
        
    return true;
    }
    
}

