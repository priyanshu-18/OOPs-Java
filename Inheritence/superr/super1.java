package Inheritence.superr;

 interface A {
    String color = "white" ;
         public void show();

}

class B implements A{
    String color = "blue";
     public void show(){
    System.out.println(color);
    System.out.println(A.color);
    }
}

public class super1 {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();
    }


}
