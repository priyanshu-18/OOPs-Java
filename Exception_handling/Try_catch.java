package Exception_handling;
import java.util.*;

public class Try_catch {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int numerator = sc.nextInt();
        int denominator = sc.nextInt();
        try{
            int result = numerator/denominator;
            System.out.println(result);
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
            System.out.println("can,t the denominator is zero ");
        }
    }
    
}
