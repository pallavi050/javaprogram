package arrayProgram;

public class MaxArray {
	
	public static void main(String args[])
	{
		int a[]= {1,2,8,4,5};
		
		int l=a.length;
		
		int max=a[0];		
		
		for(int i=0;i<l;i++)     //
		{
			if(a[i]>max)
			
				max=a[i];
			
		}

		System.out.println("max from array= "+max);
		
	}

}
