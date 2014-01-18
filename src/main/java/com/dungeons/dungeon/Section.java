package com.dungeons.dungeon;

import java.util.Objects;
import org.bukkit.Location;

/**
 * <p>Represents a particular box-shaped area within a Dungeon Room.</p>
 * 
 * @author Blackvein
 */
public class Section {
    
    /**
     * coordOne is always the low point for the Section, and coordTwo is the
     * high point.
     */
    
    private final Location coordOne;
    private final Location coordTwo;
    
    public Section(Location coordOne, Location coordTwo) {
        
        this.coordOne = coordOne;
        this.coordTwo = coordTwo;
        
    }
    
    /**
     * 
     * <p>Checks if the given location is within this Section or not.</p>
     * 
     * @param loc Location to check against
     * @return true (location is inside Section) or false
     */
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
    
    @Override
    public boolean equals(Object o){
        
        if(o instanceof Section){
            
            Section other = (Section) o;
            if(other.coordOne.equals(coordOne) && other.coordTwo.equals(coordTwo))
                return true;
            
        }
        
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.coordOne);
        hash = 67 * hash + Objects.hashCode(this.coordTwo);
        return hash;
    }
    
}
