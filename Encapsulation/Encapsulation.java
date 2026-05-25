package Encapsulation;

class Students{

    private String name;
  
    private int roll_no;

    private int age;

    //get

    public String getName(){
        return name;
    }

    public int getRoll_no(){
        return roll_no;
    }

    public int getAge(){
        return age;
    }

    //set

    public void setName(String name){
        this.name = name;
    }

    public void setRoll_no(int roll_no){
        this.roll_no=roll_no;
    }

    public void setAge(int age){
        this.age=age;
    }


}


public class Encapsulation {
    
    public static void main(String[] args) {
        Students obj = new Students();
        obj.setName("Priyanshu");
        obj.setAge(19);
        obj.setRoll_no(18);
        obj.getName();
    }
}
