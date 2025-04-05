package ovencakeapp;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author kamil
 */
public class Cakes {
    private final String name;
    private final int weight;
    private final LocalDate bestBeforeDate;
    private final LocalDateTime timePlaced;
    
    public Cakes (String name, int weight, LocalDate bestBeforeDate){
        this.name = name;
        this.weight = weight;
        this.bestBeforeDate = bestBeforeDate;
        this.timePlaced = LocalDateTime.now();
    }
    public String getName(){
        return name;
    }
    public int getWeight(){
        return weight;
    }
    public LocalDate getBestBeforeDate(){
        return bestBeforeDate;
    }
    public LocalDateTime getTimePlaced() {
        return timePlaced;
    }
    
}
