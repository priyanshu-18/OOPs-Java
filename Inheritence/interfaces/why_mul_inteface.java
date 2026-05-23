package Inheritence.interfaces;


 interface animal {
   public void eat() ;    
}

class Tiger implements animal{
    public void eat(){
        System.out.println("Tiger is eating");
    }
}

class Lion implements animal{
    public void eat(){
        System.out.println("Lion is eating");
    }
}
public class why_mul_inteface {

    public static void main(String[] args) {
        animal a = new Tiger();
        a.eat();
        animal b = new Lion();
        b.eat();
    }
    
}
