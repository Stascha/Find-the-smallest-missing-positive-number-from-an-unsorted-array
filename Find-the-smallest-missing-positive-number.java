import java.util.*;

class Solution 
{
     public static int[] DeleteNegativeAndZeroAndDuplicates(int[] a) 
     {
        int j = 0;

        for (int i : a)
            if (i > 0)
               a[j++] = i;
 
        a = Arrays.copyOf(a, j);  
 
        j = 1;
        
        for (int i : a)
            if (i != a[j - 1])
                a[j++] = i;
    
        a = Arrays.copyOf(a, j);

        return a;
    }

    public int findSmallestMissing(int[] A) 
    {
        Arrays.sort(A);
        int[] a = DeleteNegativeAndZeroAndDuplicates(A);
        int n = a.length;
 
    	for (int i = 0; i < n; i++)
    		if (a[i] != i+1)
    			return i+1;
   
    	return n+1;
    }
    
     public static void main(String []args)
     {
        int[] nums = { 1, 4, 2, -1, 6, 5 };
 
        System.out.println("The smallest missing positive number from the array is "
                + findSmallestMissing(nums));
     }
    
}
