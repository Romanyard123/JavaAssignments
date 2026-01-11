import java.util.*;
public class Power {
    public static void main(String[] args)
    {
    Scanner Huzaifa= new Scanner(System.in);
    System.out.println("enter the amperes");
    double Ampere= Huzaifa.nextDouble();
    System.out.println("enter the Volts");
    double Volts = Huzaifa.nextDouble();
    double Pow = Volts*Ampere;
    System.out.println("The power consuption is "+Pow);
    }
}
