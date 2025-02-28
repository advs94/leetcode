package medium;

public class ReverseInteger {
    /*
     * LC - 7. Reverse Integer
     */
    public int reverse(int x) {
        long rev = 0;
        while (x != 0) {
            rev = rev * 10 + x % 10;
            x /= 10;
        }
        if (rev < Integer.MIN_VALUE || rev > Integer.MAX_VALUE) return 0;
        if (x < 0) return (int)(-1*rev);
        return (int)rev;
    }
}
