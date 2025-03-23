package easy;

public class MinimumNumberOfMovesToSeatEveryone {
    /*
     * LC - 2037. Minimum Number of Moves to Seat Everyone
     */
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        final int n = seats.length;
        int min = 0;
        for (int i = 0; i < n; i++) min += Math.abs(seats[i]-students[i]);
        return min;
    }
}
