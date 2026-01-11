import java.util.Scanner;
public class TringleArea {
    public static void main(String[] args)
    {
        Scanner Tri = new Scanner(System.in);
        System.out.println("Enter the side 1");
        double L1= Tri.nextDouble();
        System.out.println("Enter the side 2");
        double L2= Tri.nextDouble();
        System.out.println("Enter the side 3");
        double L3= Tri.nextDouble();
        double S = (L1+L2+L3)/2;
        double Area= Math.sqrt(S*(S-L1)*(S-L2)*(S-L3));
        System.out.println("The area of triangle : "+Area);
    }
}
