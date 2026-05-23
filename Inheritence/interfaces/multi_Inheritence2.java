package Inheritence.interfaces;

interface animal{
    void show();
}

class Tiger implements animal{
   public  void show(){
        System.out.println("Tiger");
    }
}

class Lion implements animal{
    public void show(){
        System.out.println("Lion ");
    }
}


public class multi_Inheritence2 {
    
    public static void main(String[] args) {
        
        animal obj = new Tiger();
        animal obj1 = new Lion();

        obj.show();
        obj1.show();


    }
}
