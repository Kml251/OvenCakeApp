package ovencakeapp;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author kamil
 */
/**
 * The Cakes class represents a single cake item with its basic properties.
 * Each cake has a name, weight (in grams), best-before date, and a timestamp
 * indicating when it was placed into the oven.
 * 
 * This class is immutable — all fields are final and set only via constructor.
 */
public class Cakes {
    
    // Name of the cake
    private final String name;

    // Weight of the cake in grams
    private final int weight;

    // Best-before date (should be within 2 weeks)
    private final LocalDate bestBeforeDate;

    // The exact date and time the cake was placed into the oven
    private final LocalDateTime timePlaced;
    
    //Constructor that initializes a new Cake object with given properties.
    //The timePlaced is automatically set to the current date and time.
    public Cakes (String name, int weight, LocalDate bestBeforeDate){
        this.name = name;
        this.weight = weight;
        this.bestBeforeDate = bestBeforeDate;
        this.timePlaced = LocalDateTime.now();
    }
    
    //@return the name of the cake
    public String getName(){
        return name;
    }
    
    //@return the weight of the cake in grams
    public int getWeight(){
        return weight;
    }
    
    //@return the best-before date of the cake
    public LocalDate getBestBeforeDate(){
        return bestBeforeDate;
    }
    
    //@return the date and time when the cake was placed into the oven
    public LocalDateTime getTimePlaced() {
        return timePlaced;
    }   
    
}