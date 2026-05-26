package HashMap;
import java.util.*;


public class hashmap {

    public static void main(String[] args) {
        
        // country --> key , population --> value

        HashMap<String,Integer> map = new HashMap();

        //Insertion 
        // For insetion we used put method 

        map.put("INDIA",120);
        map.put("US",30);
        map.put("CHINA",90);


        // System.out.println(map);
        
        // if we cahnge the value of INDIA to 130 if INDIA Exist in the hashMap it updatae the value but if it,s not it made the key , value pair in the HASHMAP
        
        // map.put("INDIA",130);

        // System.out.println(map);

        //serach
       // |
       // |
       // |
       // -----> 1> .containsKey (if key present return )
       // -----> 2> .get

        


    }

}
