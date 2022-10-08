
package errorHandling;

public class Demo1 {
  
     public static void main(String[] args) {
        
        try {
            //  int x = 10;
           //   int y = 0;
            //  int z = x / y;

           double x = 10.0;
            double y = 0.0;
            double z = x / y;
            
            System.out.println(z);
       /*} catch (ArithmeticException err) {
            System.out.println("Division by zero is not allowed");*/
        } catch (Exception err) {
            System.out.println(err.getMessage());
       
        }
        
    }
    
}
