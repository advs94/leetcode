package easy;

public class FizzBuzz {
    /*
     * LC - 412. Fizz Buzz
     */
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>(n);
        for (int i = 1; i <= n; i++) {
            int fizz = i%3;
            int buzz = i%5;
            if (fizz == 0) {
                if (buzz == 0) {
                    list.add("FizzBuzz");
                } else {
                    list.add("Fizz");
                }
            } else if (buzz == 0) {
                list.add("Buzz");
            } else {
                list.add(String.valueOf(i));
            }
        }
        return list;
    }
}
