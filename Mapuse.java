package Assisted_Practice1;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

//Writing a program in Java to verify implementations of maps
public class MapUse {
    public static void main(String[] args) {
        // Hash Map
        System.out.println("-------HashMap------------");
        String s = "pargati";
        HashMap hp =  new HashMap<>(); // creating a HasMp
        for(int i =0; i<s.length(); i++){
            char c = s.charAt(i);  
            if(hp.containsKey(c)){  // check key contains or not
                int n= 1;
                int o = n+1;
                hp.put(c, o);  // if the key is already in hasmap

            }else{
                hp.put(c, 1); // puted new key
            }
        }


        System.out.println(hp);

              //TreeMap
	    System.out.println("--------TreeMap------------");
	    TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	    map.put(101,"Simran");    
	    map.put(102,"Diksha");    
	    map.put(103,"Nain");       
	    map.put(104,"Gill");       
	    map.put(105,"Ritu");       
	      
	    System.out.println("\nTotal elements of TreeMap  ");  
	    for(Map.Entry l: map.entrySet()){    
	       System.out.println(l.getKey()+" : "+l.getValue());    
	    }         

    }
}