/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hashmap;
import java.util.HashMap;
/**
 *
 * @author Hammad Ali
 */
public class Hashmap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          HashMap<String, Integer> map = new HashMap<>();
 
        // Adding elements to the Map
        // using standard add() method
        map.put("vishal", 10);
        map.put("sachin", 30);
        map.put("vaibhav", 20);
 
        // Print size and content of the Map
        System.out.println("Size of map is:- "
                           + map.size());
 
        // Printing elements in object of Map
        System.out.println(map);
 
        // Checking if a key is present and if
        // present, print value by passing
        // random element
        if (map.containsKey("vishal")) {
 
            // Mapping
            Integer a = map.get("vishal");
 
            // Printing value fr the corresponding key
            System.out.println("value for key"
                               + " \"vishal\" is:- " + a);
        }
    }
    
}
