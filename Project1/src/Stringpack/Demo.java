package Stringpack;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String fruit = "mango";
		String fruit2 = "mango";
		String name = new String("mango");
		String language = "javaprogramming";
		
		//length()
		System.out.println(fruit.length());
      //toUpperCase 
         System.out.println(fruit.toUpperCase());
		//toLowerCase()
       	System.out.println(fruit.toLowerCase());
		//charAt()
 		System.out.println(fruit.charAt(0));
		//trim()
		System.out.println(fruit.trim());
		//subString()
		System.out.println(language.substring(4));
		System.out.println(language.substring(1,4));
		//replace
		System.out.println(language.replace("java", "python"));
		//equals()
		System.out.println(fruit.equals(fruit2));
		//equalsIgnoresCase
		System.out.println(fruit.equalsIgnoreCase(fruit2));
		//==
		System.out.println(fruit==fruit2);
		System.out.println(fruit==name);
		//contains
		System.out.println(language.contains("java"));
      
	}

}
