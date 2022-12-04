import java.util.ArrayList;

public class Ex1 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for (int index = 0; index < 10; index++) {
            nums.add((int) (Math.random() * 11));
        }
        nums.sort(null);
        for (int num : nums) {
            System.out.println(num);
        }
    }

}