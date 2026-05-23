package Inheritence.superr;


 interface A {
    public void show();
     public void eat();
     public void speak();
}

class B implements A{
    public void eat(){System.out.println("eating");}
    public void speak(){System.out.println("speaking");}
    public void show(){ System.out.println("showing");}
     public void display(){
        show();
    }
}

public class super2 {
    public static void main(String[] args) {
        A obj = new B();
        

    }


}
