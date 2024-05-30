package strings;

import java.util.Scanner;

public class CountDig {
	public static void main(String[] args) 
		{
			Scanner s=new Scanner(System.in);
			System.out.println("Enter a String");
			String str=s.next();
			str=lowerCase(str);
			System.out.println(str);
		}

		static String lowerCase(String str) 
		{
			char[ ] c=str.toCharArray();
			for(int i=0;i<c.length;i++)
			{
				if(c[i]>='A' && c[i]<='Z')
					c[i]=(char)(c[i]+32);
			}
			str=new String(c);
			return str;
		
	}

	}
