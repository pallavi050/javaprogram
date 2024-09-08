package String;

public class TotalNoCharInString {
	public static void main(String args[])
	{
		
		String str="Harry potter";
		
		int l=str.length();
		
		System.out.println("Total no of char in str="+l);
	

	
	int counter =0 ;
	for(int i=0;i<l;i++)
	{
		if(!(str.charAt(i)==' '));
	
	{
		counter++;
	}
	}
	System.out.println("Total no of char in str="+counter);
	
}
}