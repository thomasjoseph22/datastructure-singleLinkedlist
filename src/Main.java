import java.util.HashMap;

public class Main{
    public static void main(String[] args){
        LinkedList kd = new LinkedList(9);
        System.out.println("adding new element");
        kd.append(34);
        kd.printfd();
        System.out.println("after removing the last element");
        kd.removelast();
        kd.printfd();
        System.out.println("After the prepand operation : ");
        kd.prepand(23);
        kd.printfd();
        System.out.println("after deleting the first element");
        kd.removefirst();
        kd.printfd();
        kd.append(3);
        kd.append(54);
        System.out.println("before the set method : ");
        kd.printfd();
        kd.set(2,550);
        System.out.println("after the set method : ");
        kd.printfd();


    }
}