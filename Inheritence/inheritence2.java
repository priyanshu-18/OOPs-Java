package Inheritence;

class vehicle{
    String company;
    String Type;
    
    void display(){
        System.out.println(Type);
        System.out.println(company);
    }
}

class car extends vehicle{
    String name;
    int milege;
    boolean sunroof;

    void car_show(){
        System.out.println(name);
        System.out.println(milege);
        System.out.println(sunroof);
    }
}

public class inheritence2 {
    
    public static void main(String[] args) {
        
        car vec1 = new car();
        vec1.name = "BMW";
        vec1.company = "BMW";
        vec1.milege = 18;
        vec1.car_show();


    }

}
