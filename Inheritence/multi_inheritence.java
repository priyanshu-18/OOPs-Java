package Inheritence;

class A{
    void methodA(){
        System.out.println("Method of A");
    }
}

class B extends A{
    void methodB(){
        System.out.println("Method of B");
    }
}

class C extends B{
    void methodC(){
        System.out.println("Method of C");
    }
}

public class multi_inheritence {
    public static void main(String[] args) {
        
        C obj = new C();
        obj.methodA();
        obj.methodB();
        obj.methodC();


    }
    
}
