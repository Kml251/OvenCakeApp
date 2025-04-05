package ovencakeapp;

import java.util.*;
/**
 *
 * @author kamil
 */
public class MyOven implements OvenInterface {
    private ArrayList<Cakes> theQueue;
    private final int MAX_CAPACITY = 5;
    
    
    public MyOven(){
        theQueue = new ArrayList<>();        
    }
    public boolean isEmpty(){
        return theQueue.isEmpty();
    }
    public int size(){
        return theQueue.size();
    }
    public Object frontElement(){
        if(!theQueue.isEmpty())
            return theQueue.getClass(0);
        else
            return null;
    }
    public void enqueue(Object element){
        if (theQueue.size() < MAX_CAPACITY){
            theQueue.add((Cakes) Element);
        }
    }
    public Object dequeue(){
        if (!theQueue.isEmpty())
            return theQueue.remove(0);
        else
            return null;
    }
}
