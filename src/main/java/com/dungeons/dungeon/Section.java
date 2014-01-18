package com.dungeons.dungeon;

import org.bukkit.Location;

/**
 * <p>Represents a particular box-shaped area within a Dungeon Room.</p>
 * 
 * @author Blackvein
 */
public class Section {
    
    private final Location coordOne;
    private final Location coordTwo;
    
    public Section(Location coordOne, Location coordTwo) {
        
        this.coordOne = coordOne;
        this.coordTwo = coordTwo;
        
    }
    
    public boolean contains(Location loc){
        
        double x = loc.getX();
        double y = loc.getY();
        double z = loc.getZ();
        
        if(x >= coordOne.getX() && x <= coordTwo.getX()) {
            
            if(y >= coordOne.getY() && x <= coordTwo.getY()) {
                
                if(z >= coordOne.getZ() && x <= coordTwo.getZ()) {
                
                    return true;
                
                }
                
            }
            
        }
        
        return false;
        
    }
    
}
