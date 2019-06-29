package stringHandling;

public class StringHandling {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		String s1 = "Hello, java is easy programming language!";
		String s2 = "Hello";
		
		String s3 =  new String("Hello");
		String s4 =  new String("Hello");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		//equal
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		
		//strict
		System.out.println(s1==s2);
		System.out.println(s3==s4);

		//searching
		System.out.println(s1.indexOf("e"));
		System.out.println(s1.lastIndexOf("e"));
		
		//String Extraction
		System.out.println(s1.substring(5));
		System.out.println(s1.substring(5,13));
		
		//String Splitting
		String str[]=s1.split(" ");
		for(String s:str)
		{
			System.out.println(s);
		}
		
		//
		
	}

}
