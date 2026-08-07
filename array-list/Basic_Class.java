import java.util.ArrayList;
import java.util.Collections;
public class Basic_Class {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<String> sl=new ArrayList<>();
        ArrayList<Boolean> bl=new ArrayList<>();
        ArrayList<Character> cl=new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        System.out.println(list);

        System.out.println("After sorting list ,lookin like: ");
        Collections.sort(list);
        System.out.println(list);
        System.out.println("reverse order of the list: ");
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);

        Collections.reverse(list);

        list.add(1, 100);
        System.out.println("After adding element 100 at index 1: ");
        System.out.println(list);

        System.out.println(list.get(3));

        System.out.println("After updating element of index 0 , 10 to 1 :");
        list.set(0,1);
        System.out.println(list);

        System.out.println("removing element from specific index  1 : ");
        list.remove(1);
        System.out.println(list);
        
        System.out.println("removing object 50:");
        list.remove(Integer.valueOf(50));
        System.out.println(list);

        System.out.println("size of list : "+ list.size());

        System.out.println("list is empty : "+list.isEmpty());
        System.out.println("checking if element (20) is exist : "+list.contains(20));

        System.out.println("finding the index of element(40) :"+list.lastIndexOf(40));
        System.out.println("copy element into another variable named copy form list");
        ArrayList<Integer> copy=new ArrayList<>(list);
        System.out.println(copy);

        




    }
}
