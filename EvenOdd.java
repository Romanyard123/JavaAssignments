import java.util.*;
public class EvenOdd {
    public static void main(String[] args)
    {
        Scanner Number = new Scanner(System.in);
        System.out.println("Enter a integer number");
        double num = Number.nextDouble();
        if (num % 2 == 0){
            System.out.println("EVEN");
        }
        if (num % 2 != 0){
            System.out.println("ODD");
        }
    }
}
