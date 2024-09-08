package arrayProgram;

public class ReverseArray {
	public static void main(String args[])
	{
		int a[]= {1,3,4,5,9};
		
		int l=a.length;
		//System.out.println(l);
		
		for(int i=l-1;i>=0;i--)
		{
			System.out.print(" "+a[i]);
		}
	}
}