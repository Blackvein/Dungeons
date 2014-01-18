package com.dungeons.dungeon;

import com.dungeons.exceptions.SectionIntersectException;
import java.util.HashMap;
import org.bukkit.Location;

/**
 * <p>Represents a 'room' or segment of a Dungeon.</p>
 * 
 * @author Blackvein
 */
public class Room {
    
    private RoomType type;
    
    private final HashMap<Location, Location> sections = new HashMap<>();
    
    public void addSection(Location locOne, Location locTwo) throws SectionIntersectException {
        
    }
    
    public class Section {
        
        
        
    }
    
}

enum RoomType {
    
    BATTLE, PUZZLE, NONE;
    
}
