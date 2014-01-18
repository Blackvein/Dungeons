package com.dungeons.exceptions;

/**
 * <p>Thrown when two sections of a Dungeon Room intersect one another.</p>
 * 
 * @author Blackvein
 */
public class SectionIntersectException extends Exception {
    
    public SectionIntersectException() {}
    
    public SectionIntersectException(String message){
        super(message);
    }
    
}
