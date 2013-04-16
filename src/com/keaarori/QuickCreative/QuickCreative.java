package com.keaarori.QuickCreative;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class QuickCreative extends JavaPlugin
{
    @Override
    public void onEnable()
    {
        System.out.println("Connecting to Database");
    
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
           break;
           }
         default :
           {
               switch (String.valueOf(args[0]))
               {
                   case "btc" :
                   {
                       btc.btc(sender, command, label, args);
                       // for testing purposes
                               Database.connect(sender);
                       break;
                   }
                   case "mode" :
                   {
                       mode.mode(sender, command, label, args);
                       break;
                   }
                   case "refill" :
                   {
                       refill.refill(sender, command, label, args);
                       break;
                   }
                   case "referrals" :
                   {
                       referrals.referrals(sender, command, label, args);
                       break;
                   }
               }
            }

         }
                       return true;
    }
}

