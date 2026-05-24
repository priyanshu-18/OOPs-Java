
package Inheritence;


class method_overloading {
    
    static int sum(int a,int b){
        return a+b;
    }
    static int sum(int a,int b,int c){
        return a+b;
    }
    static String sum(String a,String b){
        return a+b;
    }

    public static void main(String[] args) {
        
     System.out.println(sum(3,4));
     System.out.println(sum(3,4,3));
     System.out.println(sum("hello","world"));

    }



}
