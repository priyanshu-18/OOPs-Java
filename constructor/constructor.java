package constructor;

class Students{
    int id;
    int age;

    Students(int id,int age){
        this.id=id;
        this.age = age;
        System.out.println("done ");
    } 
}
public class constructor {
    

        public static void main(String[] args) {
            
            Students obj = new Students(11, 19);



        }


}
