import java.util.*;
public class Circle {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the radius of a circle");
        double Rad= input.nextDouble();
        double Area = (22.0/7)*Math.pow(Rad,2);
        double Circum= 2*(22.0/7)*Rad;
        System.out.println("Area of circle is "+ Area);
        System.out.println("Circumference of circle is "+ Circum); 
    }
}
