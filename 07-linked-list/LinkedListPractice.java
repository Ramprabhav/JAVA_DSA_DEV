import java.util.*;

public class LinkedListPractice {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        // 1. add()
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("List: " + list);

        // 2. addFirst()
        list.addFirst(5);
        System.out.println("addFirst: " + list);

        // 3. addLast()
        list.addLast(40);
        System.out.println("addLast: " + list);

        // 4. add(index, value)
        list.add(2, 15);
        System.out.println("add at index 2: " + list);

        // 5. get()
        System.out.println("get(2): " + list.get(2));

        // 6. getFirst()
        System.out.println("First: " + list.getFirst());

        // 7. getLast()
        System.out.println("Last: " + list.getLast());

        // 8. set()
        list.set(2, 100);
        System.out.println("After set: " + list);

        // 9. contains()
        System.out.println("Contains 30: " + list.contains(30));

        // 10. indexOf()
        System.out.println("Index of 30: " + list.indexOf(30));

        // 11. lastIndexOf()
        list.add(30);
        System.out.println("Last index of 30: " + list.lastIndexOf(30));

        // 12. size()
        System.out.println("Size: " + list.size());

        // 13. remove(index)
        list.remove(2);
        System.out.println("After remove index 2: " + list);

        // 14. remove(value)
        list.remove(Integer.valueOf(30));
        System.out.println("After remove value 30: " + list);

        // 15. peek()
        System.out.println("Peek: " + list.peek());

        // 16. poll()
        System.out.println("Poll: " + list.poll());
        System.out.println("After poll: " + list);

        // 17. offer()
        list.offer(50);
        System.out.println("After offer: " + list);

        // 18. Reverse
        Collections.reverse(list);
        System.out.println("Reverse: " + list);

        // 19. Sort
        list.sort(null);
        System.out.println("Sort: " + list);

        // 20. Maximum
        System.out.println("Maximum: " + Collections.max(list));

        // 21. Minimum
        System.out.println("Minimum: " + Collections.min(list));

        // 22. Shuffle
        Collections.shuffle(list);
        System.out.println("Shuffle: " + list);

        // 23. Frequency
        System.out.println("Frequency of 10: "
                + Collections.frequency(list, 10));

        // 24. Enhanced for loop
        System.out.println("Using for-each:");

        for (Integer value : list) {
            System.out.println(value);
        }

        // 25. isEmpty()
        System.out.println("Is empty: " + list.isEmpty());

        // 26. clear()
        list.clear();

        System.out.println("After clear: " + list);
        System.out.println("Is empty: " + list.isEmpty());
    }
}