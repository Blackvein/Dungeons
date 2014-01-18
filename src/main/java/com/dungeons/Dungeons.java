package com.dungeons;

import java.io.IOException;
import java.util.logging.Logger;
import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * <p>Represents the main Dungeons plugin file.</p>
 *
 */
public class Dungeons extends JavaPlugin {

    public static final Logger LOG = Logger.getLogger("Minecraft");
    
    //Enables/Disables error logging during most startup/loading procedures
    public static boolean debug = true;
    
    @Override
    public void onEnable() {
        
        loadConfig();
        this.getServer().getPluginManager().registerEvents(new PlayerListener(this), this);
        LOG.info("[Dungeons] Version " + this.getDescription().getVersion() + " Enabled.");
        
    }
    
    @Override
    public void onDisable() {
        
        LOG.info("[Dungeons] Version " + this.getDescription().getVersion() + " Disabled.");
        
    }
    
    /**
     * <p>Loads the configuration from file.</p>
     * 
     */
    private void loadConfig(){
        
        FileConfiguration config = new YamlConfiguration();
        
        try{
            
            config.load(this.getResource("config.yml"));
            
            /**
             * debug is initialized to true in case there is a problem reading the
             * config itself, so that the error will print out.
             * 
             * When reading however, it's defaulted to false if no value is specified.
             */
            debug = config.getBoolean("debug", false);
            
        }catch (IOException | InvalidConfigurationException ex){
            
            LOG.severe("[Dungeons] An error occurred reading the config file.");
            if(debug)
                ex.printStackTrace();
            
        }
        
    }
    
}
