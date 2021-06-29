package Uas;
public class QueueApp {
        public static void main(String[] args){
        queue antrian = new queue(10);
        antrian.enqueue(8);
        antrian.display();
        antrian.enqueue(8);
        antrian.display();
        System.out.println("yang diambil dari antrian = " + antrian.dequeue());
        System.out.println("mohamad akbar fauzi 20090088");
        antrian.display();
        antrian.enqueue(7);
        antrian.display();
        antrian.enqueue(6);
        antrian.display();
        System.out.println("nilai yang paling depan = " + antrian.peek());
}       