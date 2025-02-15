package medium;

public class FindThePunishmentNumberOfAnInteger {
    /*
     * LC - 2698. Find the Punishment Number of an Integer
     */
    public int punishmentNumber(int n) {
        int punishmentNum = 0;
        for(int i = 1; i <= n ; i++){
            int square = i*i;
            if(canPartition(square, i)) punishmentNum += square;
        }
        return punishmentNum;
    }
    
	public boolean canPartition(int num, int target){
        if(num < target || target < 0) return false;
        if(num == target) return true;
        return (canPartition(num/10,target-(num%10)) || canPartition(num/100,target-(num%100)) || canPartition(num/1000,target-(num%1000)));
    }
}
