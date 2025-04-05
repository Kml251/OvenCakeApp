package ovencakeapp;

/**
 *
 * @author kamil
 */
public interface OvenInterface {
    boolean isEmpty();
    int size();
    Object frontElement();
    void enqueue (Object element);
    Object dequeue();
    
}
