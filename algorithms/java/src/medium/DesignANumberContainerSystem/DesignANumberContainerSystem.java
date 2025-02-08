package medium;

public class DesignANumberContainerSystem {
    /*
     * LC - 2349. Design a Number Container System
     */
    class NumberContainers {
        Map<Integer,Integer> container;
        Map<Integer,PriorityQueue<Integer>> smallest;
        public NumberContainers() {
            container = new HashMap<>();
            smallest = new HashMap<>();
        }
        public void change(int index, int number) {
            container.put(index, number);
            smallest.computeIfAbsent(number, k -> new PriorityQueue<>()).add(index);
        }
        public int find(int number) {
            if (!smallest.containsKey(number)) return -1;
            PriorityQueue<Integer> pq = smallest.get(number);
            while (!pq.isEmpty()) {
                int size = pq.size();
                while (size-- > 0) {
                    int index = pq.peek();
                    if (container.get(index) == number) {
                        return index;
                    }
                    pq.poll();
                }
            }
            return -1;
        }
    }
}
