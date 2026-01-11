import java.util.*;
public class Percentage 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the obtained marks");
        double om = sc.nextDouble();
        System.out.println("enter the maximum marks");
        double mm = sc.nextDouble();
        double p=(om/mm)*100;
        System.out.println("Your percentage is "+ p +"%");
    }
}
