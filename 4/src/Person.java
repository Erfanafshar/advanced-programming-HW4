// Add the Random class from java.util package
import java.util.Random;

/**
 * The person class with the name of the person
 * And can generate random number
 * *
 * @author Erfan
 * @version 1
 */
public class Person {

    // field //

    // The name of the person
    public String name;

    // Time that person wait for entering to the queue
    public int time;

    // constructor //

    /**
     * generate a person with given name and time
     * @param nme The name of the person
     * @param tme Time that person wait for entering to the queue
     */
    public Person(String nme, int tme) {
        name = nme;
        time = tme;
    }

    // method //

    /**
     * This method generate positive random number from 0 to 9 and return it
     * *
     * @return A random number from 0 to 9
     */
    public int generateRandNumber() {
        int posRand;
        Random rand = new Random();
        posRand = rand.nextInt();
        if ((posRand % 10) > 0) {
            return (posRand % 10);
        } else {
            return generateRandNumber();
        }
    }

    /**
     * This method calculate the time that each people waiting
     * *
     * @param p An object from Person class
     * @param number The number of the person position in queue
     * @return Waiting time
     */
    public int waitingTime(Person p, int number) {
        return (p.time + (number + 1) * 2);
    }
}
