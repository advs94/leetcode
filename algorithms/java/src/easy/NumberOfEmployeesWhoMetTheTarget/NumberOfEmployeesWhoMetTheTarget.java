package easy;

public class NumberOfEmployeesWhoMetTheTarget {
    /*
     * LC - 2798. Number of Employees Who Met the Target
     */
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = 0;
        for (int empHours : hours) if (empHours >= target) count++;
        return count;
    }
}
