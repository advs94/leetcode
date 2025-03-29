package easy;

public class DesignAnOrderedStream {
    /*
     * LC - 1656. Design an Ordered Stream
     */
    class OrderedStream {
        String[] stream;
        int ptr;

        public OrderedStream(int n) {
            stream = new String[n];
            ptr = 0;
        }

        public List<String> insert(int idKey, String value) {
            List<String> list = new ArrayList<>();
            stream[idKey-1] = value;
            while (ptr < stream.length && stream[ptr] != null) list.add(stream[ptr++]);
            return list;
        }
    }
}
