public class week16lab
{
   String zipcode;
   private int digit;
   
   public week16lab(int zipcode)
   {
      int digit = zipcode;
   }   
   public String getBarcode() 
      {     
         String barcode;     
         if (digit == 0) 
         {
            System.out.print("||:::");
         } 
         else if (digit == 1) 
         {
            System.out.print(":::||");
         } 
         else if (digit == 2) 
         {
            System.out.print("::|:|");
         } 
         else if (digit == 3) 
         {
            System.out.print("::|:|");
         } 
         else if (digit == 4) 
         {
            System.out.print(":|::|");
         } 
         else if (digit == 5) 
         {
            System.out.print(":|:|:");
         } 
         else if (digit == 6) 
         {
            System.out.print(":||::");
         } 
         else if (digit == 7) 
         {
            System.out.print("|:::|");
         } 
         else if (digit == 8) 
         {
            System.out.print("|::|:");
         } 
         else  if(digit == 9)
         {
            System.out.print("|:|::");
         }
         return barcode;
      }
}     