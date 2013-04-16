/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.keaarori.QuickCreative;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Commands {
    public static void getcommands(CommandSender sender, Command command,String label,String[] args)
{
        if (sender instanceof Player)
    {
        String Commands[] = {"btc", "mode", "refill","deposit","withdraw X.XX","referrals","mute player_name","send player_name amount"};
        String Descriptions[] = {"checks Balance", "changes between real bitcoins and play money", "refills your play money","deposit bitcoins","withdraw a specific amount","earn free bitcoins with referrals","mutes a player, (§a/unmute §fto reverse)", "send btc to another player"};
        String Sendmessages[] = {"§aBitShard Help:", ""};
        if (Commands.length > 0)
                {
                 sender.sendMessage(Sendmessages[0]);
                 for (int i=0; i<Commands.length; i++)
                 {             
                  Sendmessages[1] =  ("§a/" + Commands[i].toString() + "§f " + Descriptions[i].toString());
                  sender.sendMessage(Sendmessages[1]);
                 }
                } 
    }
    else
    {
        sender.sendMessage("This game can only be executed in game.");
    }
}
}
