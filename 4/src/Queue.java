// Add the ArrayList class from java.util package
import java.util.ArrayList;

/**
 * The Queue class for generate a Queue With persons
 * *
 * @author Erfan
 * @version 1
 */
public class Queue {

    // field //

    // An array with person elements
    public ArrayList<Person> people;

    // constructor //

    /**
     * Create a queue
     */
    public Queue() {
        people = new ArrayList<Person>();
    }

    // method //

    /**
     * This method can enter persons in queue
     * *
     * @param p An object from Person class
     */
    public void enqueue(Person p) {
        people.add(p);
    }

    /**
     * This method can exit persons from queue
     * *
     * @param p An object from Person class
     */
    public void dequeue(Person p) {
        people.remove(p);
    }

    /**
     * This method find the number of position of person in the queue and return it
     * @param p An object from Person class
     * @return The number of position of the person in the queue
     */
    public int findNumber(Person p) {
        return people.indexOf(p);
    }

}
