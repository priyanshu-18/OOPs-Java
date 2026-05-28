package Exception_handling;

public class nested_try_catch {
    public static void main(String[] args) {
        int arr[] = new int[6];
        try{
            System.out.println("Hi i am try and catch");
            try{
                arr[6]=9;
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
