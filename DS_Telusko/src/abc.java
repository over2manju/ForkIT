import java.util.HashSet;
import java.util.Set;

public class abc 
{	
	
	public static void main(String args[])
	{
		int a[] = {6 , 12, 3, 9 , 3, 5 , 1};
		System.out.println(numberOfPairs(a , 12));
		
	}
	
    static int numberOfPairs(int[] a, long k)
    {
        int output = 0;
        Set<Integer> list = new HashSet<Integer>();
        for(int i = 0; i < a.length; i++)
        {
            list.add(a[i]);
        }
        
        for(int i = 0; i < a.length; i++)
        {
            int val1 = a[i];
            int val2 = (int) (k - val1);
            if(val2 != (k/2) && list.contains(val2) && list.contains(val1) )
            {
                output++;
                list.remove(val1);
                list.remove(val2);
                System.out.println(val1 + " " + val2);
            }
        }
        return output;
    }


}
