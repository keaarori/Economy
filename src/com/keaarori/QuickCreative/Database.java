
package com.keaarori.QuickCreative;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.bukkit.command.CommandSender;

public class Database {
    public static void connect(CommandSender sender)
    {
        try {
            String host = "host";
            String uName = "username";
            String uPass = "password";
            Connection con = DriverManager.getConnection(host, uName, uPass);
            con.close();
                    
        }
        catch (SQLException err) {
            System.out.println(err.getMessage());
        }
        
    }
}
