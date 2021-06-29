package Uas;
public class StackApp {
    public static void main(String[] args) {
        // TODO code application logic here
     Stack tumpukan=new Stack(10);
        tumpukan.push(1);
        tumpukan.baca();
        System.out.println(" ");
        tumpukan.push(2);
        tumpukan.baca();
        System.out.println(" ");
        tumpukan.push(3);
        tumpukan.baca();
        System.out.println(" ");
        long nilai2=tumpukan.pop();
        long nilai3=tumpukan.peek();
        System.out.println("nilai top  = " +nilai2);
        System.out.println("Muhammad affan tamami 20090151");
        
        System.out.println(" ");
        tumpukan.baca();
        System.out.println(" ");
        tumpukan.push(4);
        tumpukan.baca();
        System.out.println(" ");
    }
}