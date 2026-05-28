package Exception_handling;

public class Doublie_try_catch {
    public static void main(String[] args) {
        
        int arr[]=new int[5];
        
        // try{
            
        //     arr[6] = 10/0;
        // }catch(ArithmeticException e){
        //     System.out.println(e.getMessage());
        // }catch(ArrayIndexOutOfBoundsException e){
        //     System.out.println(e.getMessage());
        // }
        try{
            
            arr[6] = 10/0;
        }catch(ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }


    }    
}
