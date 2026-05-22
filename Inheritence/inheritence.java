package Inheritence;

class parentClass{
    void show(){
        System.out.println("parent class");
    }
}


class childClass extends parentClass {
    void display(){
        System.out.println("child class");
    }
}

public class inheritence {
    
    public static void main(String[] args) {
        
        childClass child1 = new childClass();
        child1.display();
        System.out.println();
        child1.show();
    }
}
