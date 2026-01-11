import java.util.*;
public class DiscountedPrice {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Original selling price");
        double OSP= input.nextDouble();//Original selling Price
        System.out.println("Enter Percentage discount");
        double PD = input.nextDouble();//Percentage discount
        double DSP= (OSP*(100-PD))/100;
        System.out.println("Discounted Selling price is"+DSP);
    }
}
