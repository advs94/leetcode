package easy;

public class ShortestDistanceToACharacter {
    /*
     * LC - 821. Shortest Distance to a Character
     */
    public int[] shortestToChar(String s, char c) {
        final int[] answer = new int[s.length()];
        int j = 0, prev = 10001;
        for (int i = 0; i < answer.length; i++) {
            if (s.charAt(i) == c) {
                for (; j < i; j++) {
                    int a = Math.abs(prev-j);
                    int b = Math.abs(i-j);
                    if (a > b) {
                        answer[j] = b;
                    } else {
                        answer[j] = a;
                    }
                }
                prev = i;
                j = i+1;
            }
        }
        for (; j < answer.length; j++) answer[j] = j-prev;
        return answer;
    }
}
