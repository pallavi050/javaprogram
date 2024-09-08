package String;

public class StringVowelCon {

	public static void main(String args[])
	{
		
		String str="harry poter";
		int l=str.length();
		System.out.println("total no of char in string"+l);
		
		int counter_v=0;
		int counter_c=0;
		
		int counter_whitespaces=0;
		
		for(int i=0;i<l;i++)
		{
			char r=str.charAt(i);
		
			if((r=='A')||(r=='a')||(r=='E')||(r=='e')||(r=='I')||(r=='i')||(r=='O')||(r=='o')||(r=='U')||(r=='u')) 
			{
				counter_v++;
				
			}
			
			else if(r==' ')
			{
				counter_whitespaces++;
			}
			else
			{
				counter_c++;
			}
		}
			System.out.println("total no of vowel in string:-"+counter_v);
			System.out.println("total no of consonant in string:-"+counter_c);
			System.out.println("total no of whitespaces in string:-"+counter_whitespaces);
		}
				
	}

