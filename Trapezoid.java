import java.util.*;
public class Trapezoid {
    public static void main(String[] args)
    {
        Scanner Trapezium = new Scanner(System.in);
        System.out.println("Enter the length a ");
        double a = Trapezium.nextDouble();
        System.out.println("Enter the length b ");
        double b = Trapezium.nextDouble();
        System.out.println("Enter the length h ");
        double h = Trapezium.nextDouble();
        double K = (h*(a+b))/2;
        System.out.println("The Area of the trapezium is :"+K);
    }
}
