import java.util.Scanner;

public class week16labRunner
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      
      while (digit < 10000)
      {
         System.out.println("Please enter again your 5 digit: ");
         int digit = in.nextInt();
      }
      
      System.out.print("Enter your 5 digit: ");
      int digit = in.nextInt();
           week16lab lab1 = new week16lab(barcode);

      System.out.println(lab1.getBarcode);     
   }
}