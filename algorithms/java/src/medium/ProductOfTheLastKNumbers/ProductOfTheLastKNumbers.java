package medium;

public class ProductOfTheLastKNumbers {
    /*
     * LC - 1352. Product of the Last K Numbers
     */
    class ProductOfNumbers {
        ArrayList<Integer> list;
        int prod;

        public ProductOfNumbers() {
            list = new ArrayList<>();
            prod = 1;
        }

        public void add(int num) {
            if(num == 0){
                list = new ArrayList<>();
                prod = 1;
                return;
            }
            prod *= num; 
            list.add(prod);       
        }

        public int getProduct(int k) {
            if(list.size() < k) return 0;
            int ans = list.get(list.size()-1);
            if(list.size() == k) return ans;
            return ans/list.get(list.size()-1-k);
        }
    }
}
