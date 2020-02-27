/**
 * The main class for making objects and continue the program
 * *
 * @author Erfan
 */
public class Main {

    // field //

    // An static variable for sum the waiting times
    private static int sum = 0;

    // constructor //

    // This class dosesnt have any constructor

    // method //

    /**
     * The main method for making objects and continue the program
     * *
     * @param args The input strings of main method
     */
    public static void main(String[] args) {

        // Create a queue for adding peoples in it
        Queue que = new Queue();

        // Create persons to add them into the queue
        Person p1 = new Person("Erfan", 0);
        Person p2 = new Person("Hamid", p1.time + p1.generateRandNumber());
        Person p3 = new Person("Iran", p2.time + p2.generateRandNumber());
        Person p4 = new Person("Viros", p3.time + p3.generateRandNumber());
        Person p5 = new Person("James", p4.time + p4.generateRandNumber());
        Person p6 = new Person("James", p5.time + p5.generateRandNumber());
        Person p7 = new Person("James", p6.time + p6.generateRandNumber());
        Person p8 = new Person("James", p7.time + p7.generateRandNumber());
        Person p9 = new Person("James", p8.time + p8.generateRandNumber());
        Person p10 = new Person("James", p9.time + p9.generateRandNumber());
        Person p11 = new Person("James", p10.time + p10.generateRandNumber());
        Person p12 = new Person("James", p11.time + p11.generateRandNumber());
        Person p13 = new Person("James", p12.time + p12.generateRandNumber());
        Person p14 = new Person("James", p13.time + p13.generateRandNumber());
        Person p15 = new Person("James", p14.time + p14.generateRandNumber());
        Person p16 = new Person("James", p15.time + p15.generateRandNumber());
        Person p17 = new Person("James", p16.time + p16.generateRandNumber());
        Person p18 = new Person("James", p17.time + p17.generateRandNumber());
        Person p19 = new Person("James", p18.time + p18.generateRandNumber());
        Person p20 = new Person("James", p19.time + p19.generateRandNumber());
        Person p21 = new Person("James", p20.time + p20.generateRandNumber());
        Person p22 = new Person("James", p21.time + p21.generateRandNumber());
        Person p23 = new Person("James", p22.time + p22.generateRandNumber());
        Person p24 = new Person("James", p23.time + p23.generateRandNumber());
        Person p25 = new Person("James", p24.time + p24.generateRandNumber());
        Person p26 = new Person("James", p25.time + p25.generateRandNumber());
        Person p27 = new Person("James", p26.time + p26.generateRandNumber());
        Person p28 = new Person("James", p27.time + p27.generateRandNumber());
        Person p29 = new Person("James", p28.time + p28.generateRandNumber());
        Person p30 = new Person("James", p29.time + p29.generateRandNumber());

        // Enter persons in queue
        que.enqueue(p1);
        que.enqueue(p2);
        que.enqueue(p3);
        que.enqueue(p4);
        que.enqueue(p5);
        que.enqueue(p6);
        que.enqueue(p7);
        que.enqueue(p8);
        que.enqueue(p9);
        que.enqueue(p10);
        que.enqueue(p11);
        que.enqueue(p12);
        que.enqueue(p13);
        que.enqueue(p14);
        que.enqueue(p15);
        que.enqueue(p16);
        que.enqueue(p17);
        que.enqueue(p18);
        que.enqueue(p19);
        que.enqueue(p20);
        que.enqueue(p21);
        que.enqueue(p22);
        que.enqueue(p23);
        que.enqueue(p24);
        que.enqueue(p25);
        que.enqueue(p26);
        que.enqueue(p27);
        que.enqueue(p28);
        que.enqueue(p29);
        que.enqueue(p30);

        // Print enter and exit time of all of the peoples are in queue
        for (int i = 0; i < que.people.size(); i++) {
            System.out.println("Enter time : " + que.people.get(i).time);
            System.out.println("Exit time : " + que.people.get(i).waitingTime(que.people.get(i), que.findNumber(que.people.get(i))));
            System.out.println();
        }

        // Calculate the average waiting time of the people are in queue
        for (int i = 0; i < que.people.size(); i++) {
            sum += que.people.get(i).waitingTime(que.people.get(i), que.findNumber(que.people.get(i)));
        }

        // print average of waiting time
        System.out.println("Average waiting time : " + sum / que.people.size());

        //exit persons from queue
        que.dequeue(p1);
        que.dequeue(p2);
        que.dequeue(p3);
        que.dequeue(p4);
        que.dequeue(p5);
        que.dequeue(p6);
        que.dequeue(p7);
        que.dequeue(p8);
        que.dequeue(p9);
        que.dequeue(p10);
        que.dequeue(p11);
        que.dequeue(p12);
        que.dequeue(p13);
        que.dequeue(p14);
        que.dequeue(p15);
        que.dequeue(p16);
        que.dequeue(p17);
        que.dequeue(p18);
        que.dequeue(p19);
        que.dequeue(p20);
        que.dequeue(p21);
        que.dequeue(p22);
        que.dequeue(p23);
        que.dequeue(p24);
        que.dequeue(p25);
        que.dequeue(p26);
        que.dequeue(p27);
        que.dequeue(p28);
        que.dequeue(p29);
        que.dequeue(p30);
    }

}
