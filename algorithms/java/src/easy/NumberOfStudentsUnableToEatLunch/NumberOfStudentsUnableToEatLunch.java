package easy;

public class NumberOfStudentsUnableToEatLunch {
    /*
     * LC - 1700. Number of Students Unable to Eat Lunch
     */
    public int countStudents(int[] students, int[] sandwiches) {
        int zeroPreferredStudent = 0;
        int onePreferredStudent = 0;
        for (int student : students) {
            if (student == 0) zeroPreferredStudent++;
            else onePreferredStudent++;
        }
        for (int i = 0; i < sandwiches.length; i++) {
            if (sandwiches[i] == 0) zeroPreferredStudent--;
            else onePreferredStudent--;
            if (zeroPreferredStudent < 0 || onePreferredStudent < 0) return sandwiches.length - i;
        }
        return 0;
    }
}
