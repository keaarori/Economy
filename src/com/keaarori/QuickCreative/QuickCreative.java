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
    if (sender instanceof Player)
    {
        String Commands[] = {"Game Mode", "Operating Mode"};
        String Sendmessages[] = {"§cHack Shard Gaming - Economy \n Commands: §f"};
        if (Commands.length > 0)
                {
                 for (int i=0; i<Commands.length; i++)
                 {
                  if (i > 0)
                  {
                      Sendmessages[0] = Sendmessages[0] + "§c , §f";
                  }
                  
                  Sendmessages[0] = (Sendmessages[0].toString() + Commands[i].toString());
                     
                 }
                 sender.sendMessage(Sendmessages[0]);
                } 
          

    }
    else
    {
        sender.sendMessage("This game can only be executed in game.");
    }
    return true;
    
    }
    

    }

