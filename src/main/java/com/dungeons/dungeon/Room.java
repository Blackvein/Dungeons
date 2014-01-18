package com.dungeons.dungeon;

import java.util.HashSet;
import org.bukkit.Location;

/**
 * <p>
 * Represents a 'room' or segment of a Dungeon.</p>
 *
 * @author Blackvein
 */
public class Room {

    private RoomType type = RoomType.DEFAULT;

    private final HashSet<Section> sections = new HashSet<>();

    public void addSection(Section section) {
        sections.add(section);
    }

    public void addSection(Location locOne, Location locTwo) {
        sections.add(new Section(locOne, locTwo));
    }

    public void removeSection(Section section) {
        sections.remove(section);
    }

    /**
     * Removes a section from the Room if it can find one that matches
     * the given location points.
     * 
     */
    public void removeSection(Location locOne, Location locTwo) {
        
        final Section temp = new Section(locOne, locTwo);
        Section remove = null;
        
        for (Section s : sections) {
            if (s.equals(temp)) {
                remove = s;
                break;
            }
        }
        
        if(remove != null)
            sections.remove(remove);
        
    }

    public HashSet<Section> getSections() {
        return sections;
    }

}

enum RoomType {

    DEFAULT, BATTLE, PUZZLE;

}
