import java.util.*;
public class Basicclass{

    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("china", 150);
        hm.put("india", 100);
        hm.put("nepal", 50);
        hm.put("bhutan", 20);
        hm.put("uk", 90);

        //System.out.println(hm);

        //gettin element
        System.out.println(hm.get("india"));

        //containsKey
        System.out.println(hm.containsKey("bhutan"));

        //iteration on hashmap
        Set<String> keys = hm.keySet();
        for(String key : keys){
            System.out.println(key +"="+ hm.get(key));
        } 

        //remove key
        System.out.println(hm.remove("us"));

        //size() of hashmap
        System.out.println(hm.size());


    }
}