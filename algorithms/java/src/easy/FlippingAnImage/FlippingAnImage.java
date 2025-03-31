package easy;

public class FlippingAnImage {
    /*
     * LC - 832. Flipping an Image
     */
    public int[][] flipAndInvertImage(int[][] image) {
        final int n = image.length;
        for (int[] img : image) {
            for (int i = 0; i < n/2; i++) {
                int aux = img[i];
                img[i] = img[n-1-i] ^ 1;
                img[n-1-i] = aux ^ 1;
            }
            if ((n & 1) == 1) {
                img[n/2] ^= 1;
            }
        }
        return image;
    }
}
