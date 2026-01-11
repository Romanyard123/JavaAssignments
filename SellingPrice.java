import java.util.*;
public class SellingPrice {
    public static void main(String[] args)
    {
        Scanner Huzaifa =new Scanner(System.in);
        System.out.println("Enter Discounted selling price");
        double DSP= Huzaifa.nextDouble();//Discounted selling Price
        System.out.println("Enter Percentage discount");
        double PD = Huzaifa.nextDouble();//Percentage discount
        double OSP= (DSP/(100-PD))*100;
        System.out.println("Discounted Selling price is"+OSP);
    }
}
