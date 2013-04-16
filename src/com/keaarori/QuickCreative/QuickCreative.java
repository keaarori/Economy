package com.keaarori.QuickCreative;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
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
           break;
           }
         default :
           {
             if (String.valueOf(args[0]).equalsIgnoreCase("GM"))
             {
               sender.sendMessage("Sir We have liftoff");
             }
           }
    }
               return true;
    }
}

