import java.util.ArrayList;

public class Classroom {
    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        // check if heap is empty
        public boolean isEmpty() {
            return arr.size() == 0;
        }

        // peek the element from the heap
        public int peek() {
            if (isEmpty()) {
                throw new IllegalStateException("Heap is empty");
            }
            return arr.get(0);
        }

        // add element inside heap
        public void add(int data) {
            arr.add(data);
            int x = arr.size() - 1;
            int par = (x - 1) / 2;

            while (x > 0 && arr.get(x) < arr.get(par)) {
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

                x = par;
                par = (x - 1) / 2;
            }
        }

        private void heapify(int i) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int minIdx = i;

            if (left < arr.size() && arr.get(left) < arr.get(minIdx)) {
                minIdx = left;
            }
            if (right < arr.size() && arr.get(right) < arr.get(minIdx)) {
                minIdx = right;
            }
            if (minIdx != i) {
                // swap
                int temp = arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx, temp);

                heapify(minIdx);
            }
        }

        // remove element from heap
        public int remove() {
            if (isEmpty()) {
                throw new IllegalStateException("Heap is empty");
            }

            int data = arr.get(0);

            // swap first and last
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size() - 1));
            arr.set(arr.size() - 1, temp);

            // delete the last
            arr.remove(arr.size() - 1);

            // heapify root if heap is non-empty
            if (!arr.isEmpty()) {
                heapify(0);
            }

            return data;
        }
    }

    public static void main(String[] args) {
        Heap h = new Heap();
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);

        while (!h.isEmpty()) {
            System.out.println(h.peek());
            h.remove();
        }
    }
}