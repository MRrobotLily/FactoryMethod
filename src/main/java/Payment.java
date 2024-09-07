
import java.util.Scanner;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author niza
 */
public class Payment {

    public static void main(String[] args) {
      
        int option = 0;
                
      do{
          
        Pay pays = null;     
        Scanner scanners = new Scanner (System.in);
        System.out.println("Please choose an option");
        System.out.println("1. Apple Pay");
        System.out.println("2. Credit Card");
        System.out.println("3. Debit Card");        
        System.out.println("4. Transfer");
        System.out.println("5. Cash");
        System.out.println("6. Paypal");
        System.out.println("-------------------------");
        option = scanners.nextInt();
           
        switch (option){
            case 1:
              pays = new Apple_pay();
              break;
            
            case 2:
              pays = new Credit_card();
              break;
              
            case 3:
              pays = new Debit_card();
              break;
              
            case 4:
              pays = new Transfer();
              break;
              
            case 5:
              pays = new Cash();
              break;
              
            case 6:
              pays = new Paypal();
              break;
            
            default: 
                System.out.println("Incorrect option, please select a valid option");
                
        }
        if (option <= 6 && option >= 1){
            pays.Createpayments();
        }
      
        } while (option > 6 || option < 1);
            System.out.println("Goodbye");
   }
       
}
    
