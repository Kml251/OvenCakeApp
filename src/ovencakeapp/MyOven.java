package ovencakeapp;

import java.util.*;
/**
 *
 * @author kamil
 */
/**
 * MyOven is a class that implements a FIFO (First-In, First-Out) queue structure
 * to manage cake objects in a virtual oven.
 * 
 * It uses an ArrayList to simulate a queue with a maximum capacity of 5 cakes.
 * 
 * This class implements the OvenInterface interface.
 */
public class MyOven implements OvenInterface {
    
    // Internal list used to simulate the queue of cakes
    private ArrayList<Cakes> theQueue;
    
    // Maximum number of cakes allowed in the oven at once
    private final int MAX_CAPACITY = 5;
    
    // To constructor initializes the internal queue list.
    public MyOven(){
        theQueue = new ArrayList<>();        
    }
    
    // To check if the oven is currently empty.
    public boolean isEmpty(){
        return theQueue.isEmpty();
    }
        
    // To return the number of cakes currently in the oven.
    public int size(){
        return theQueue.size();
    }
    
    // To peek at the first cake in the oven (the one that will be removed next), without removing it.
    public Object frontElement(){
        if(!theQueue.isEmpty())
            return theQueue.get(0);
        else
            return null;
    }
    
    // To add a cake to the oven queue if there is space.
    public void enqueue(Object element){
        if (theQueue.size() < MAX_CAPACITY){
            theQueue.add((Cakes) element);
        }
    }
    
    // To remove and returns the first cake from the oven queue (FIFO behavior).
    public Object dequeue(){
        if (!theQueue.isEmpty())
            return theQueue.remove(0);
        else
            return null;
    }
}
