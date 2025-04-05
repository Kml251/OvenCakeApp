package ovencakeapp;

/**
 *
 * @author kamil
 */
/**
 * OvenInterface defines the structure for any oven-like data structure.
 * It represents a collection that supports typical Queue operations:
 * adding, removing, checking the first item, etc.
 * This interface allows different implementations (like MyOven or MyOvenStack)
 * while keeping the core methods consistent across them. 
 * In this project, MyOven implements this interface using FIFO(First In First Out) logic.
 */

public interface OvenInterface {
    //To check if the oven (queue) is empty.
    boolean isEmpty();
    
    //To return the number of cakes currently in the oven.
    int size();
    
    //To retrieve (without removing) the first cake in the oven.
    Object frontElement();
    
    //To add a new cake to the oven.
    void enqueue (Object element);
    
    //To remove the first (oldest) cake from the oven.
    Object dequeue();
    
}
