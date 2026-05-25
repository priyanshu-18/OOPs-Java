package Inheritence;

class BANK {
    void RateOfInterest(){
        System.out.println("Rate of Interest of bank is 7%");
    }
}
class SBI extends BANK{
    void RateOfInterest(){
        System.out.println("Rate of Interest of SBI is 10%");
    }
}
class PNB extends BANK{
    void RateOfInterest(){
        System.out.println("Rate of Interest of PNB is 7%");
    }
}

public class method_overriding {
    
    public static void main(String[] args) {

        BANK obj = new BANK();
        SBI obj1 = new SBI();
        PNB obj2 = new PNB();

        obj.RateOfInterest();
        obj1.RateOfInterest();
        obj2.RateOfInterest();


    }

}
