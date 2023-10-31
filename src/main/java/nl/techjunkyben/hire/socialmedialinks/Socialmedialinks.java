package nl.techjunkyben.hire.socialmedialinks;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.List;

public final class Socialmedialinks extends JavaPlugin implements CommandExecutor {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getConfig().options().copyDefaults();
        saveDefaultConfig();
        getCommand("links").setExecutor(this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        saveConfig();
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        //string color interpreter
        //store
        String Store = getConfig().getString("Lang.Store");
        String coloredStore = ChatColor.translateAlternateColorCodes('&', Store);
        // yt
        String Youtube = getConfig().getString("Lang.Youtube");
        String coloredYoutube = ChatColor.translateAlternateColorCodes('&', Youtube);
        // twit
        String Twitter = getConfig().getString("Lang.Twitter");
        String coloredTwitter = ChatColor.translateAlternateColorCodes('&', Twitter);
        // insta
        String Instagram = getConfig().getString("Lang.Instagram");
        String coloredInstagram = ChatColor.translateAlternateColorCodes('&', Instagram);
        // discord
        String Discord = getConfig().getString("Lang.Discord");
        String coloredDiscord = ChatColor.translateAlternateColorCodes('&', Discord);
        // discord
        String Twitch = getConfig().getString("Lang.Twitch");
        String coloredTwitch = ChatColor.translateAlternateColorCodes('&', Twitch);

        List<String> Message = new ArrayList<String>();

        if(getConfig().getBoolean("socialmedia.Store")){
            Message.add(coloredStore);
        }
        if(getConfig().getBoolean("socialmedia.Yoututbe")){
            Message.add(coloredYoutube);
        }
        if(getConfig().getBoolean("socialmedia.Twitter")){
            Message.add(coloredTwitter);
        }
        if(getConfig().getBoolean("socialmedia.Instagram")){
            Message.add(coloredInstagram);
        }
        if(getConfig().getBoolean("socialmedia.Discord")){
            Message.add(coloredDiscord);
        }
        if(getConfig().getBoolean("socialmedia.Twitch")){
            Message.add(coloredTwitch);
        }







        if (command.getName().equalsIgnoreCase("links")) {

            sender.sendMessage(String.valueOf(Message));

        }


        return false;
    }
}
