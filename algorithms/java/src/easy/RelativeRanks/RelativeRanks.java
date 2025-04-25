package easy;

public class RelativeRanks {
    /*
     * LC - 506. Relative Ranks
     */
    public String[] findRelativeRanks(int[] score) {
        int max = -1;
        for (int num : score) max = Math.max(max, num);
        final int[] tmp = new int[max+1];
        Arrays.fill(tmp, -1);
        final int n = score.length;
        for (int i = 0; i < n; i++) tmp[score[i]] = i;
        final String[] answer = new String[n];
        int pos = 1;
        while (pos <= n && max >= 0) {
            if (tmp[max] != -1) {
                answer[tmp[max]] = switch (pos) {
                    case 1 -> "Gold Medal";
                    case 2 -> "Silver Medal";
                    case 3 -> "Bronze Medal";
                    default -> Integer.toString(pos);
                };
                pos++;
            }
            max--;
        }
        return answer;
    }
}
