package String;

public class RevString {
	public static void main(String args[])
	{
		
		String str="Harry poter";
		
		String rev=" ";
		
		int l=str.length();
		
		for(int i=l-1;i>=0;i--)
		{
			char a=str.charAt(i);
			rev=rev+a;
		}
		System.out.println("revers styring="+rev);
		
		}
	}

