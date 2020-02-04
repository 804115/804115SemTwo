
/**
 * Write a description of class Shuffle here.
 *
 * @author (Jade)
 * @version (204)
 */
public class Shuffle
{
    public Shuffle(int[] s1)
    {
        for(int i = 0; i < s1.length; i++){
            int x = (int)(Math.random()* 52) + 1;
            int y = s1[x];
            s1[i] = y;
            y = s1[i];
        }
    }

    public static void main(){
        int[] nums = new int[52];
        for (int i = 0; i < nums.length; i++){
            nums[i] = i+1;
        }
        
        Shuffle s = new Shuffle(nums);
    }
}
