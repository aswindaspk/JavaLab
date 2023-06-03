class StrManipulation{
	public static void main(String ar[]){
		char chs[] = {'w','e','l','c','o','m','e'};
		String newstr =new String(chs);
		System.out.println("New string from char[] using new string:"+newstr);
		

		byte asciis[] = {65,66,67,68,69,70};
		newstr = new String(asciis);

		System.out.println("New string from byte[] using new string:"+newstr);


		String s1 = "good";
		String s2 = "EVENING";

		System.out.println("string length of 'good': "+s1.length());


		System.out.println("\nstring case change");
                  System.out.println("-----------------------\n");
		System.out.println(s1 + " toUpperCase: "+ s1.toUpperCase());
		System.out.println(s2 + " toLowerCase: "+ s2.toLowerCase());
		
		System.out.println("\nstring concatination");
                  System.out.println("-------------------------\n");
		System.out.println("using concat() :" +s1.concat(s2));
		System.out.println("using + operator :" + s1 +" "+ s2);


		System.out.println("\ncharacter extraction");
		System.out.println("--------------------\n");
		System.out.println("character at 3rd position:" +s1.charAt(3));
		char c[] = new char[5];

		s1.getChars(2,4,c,0);
		System.out.println("character between 2 and 4 :" +new String(c));

		System.out.println("\nstring comparison");
                  System.out.println("-------------------------\n");
		s1 = "welcome";
		s2 = "WELCOME";
		System.out.println(s1 + " Equals " +s2+ " : " + s1.equals(s2));
		System.out.println(s1 + " equalsIgnoreCase " + s2 + " : "+s1.equalsIgnoreCase(s2));

		System.out.println(s1 + " compareTo " +s2+ " : " +s1.compareTo(s2));
		System.out.println(s1 + " compareToIgnoreCase " +s2 +" : " +s1.compareToIgnoreCase(s2));
		
		System.out.println(s1 + " startsWith w : " +s1.startsWith("w"));
		System.out.println(s1 + " endsWith x: " +s1.endsWith("x"));


		System.out.println("\nSearch Substring");
                  System.out.println("--------------------\n");
		s1= "arun was eating arun icecream";
		System.out.println(s1 + " indexOf(was) : " +s1.indexOf("was"));
		System.out.println(s1 + " lastIndexOf(arun) : " +s1.lastIndexOf("arun"));


		System.out.println("\nModifying a string");
                  System.out.println("------------------------\n");
		s1="welcome to ooty";
		
		System.out.println(s1 +"<--> replace ooty to mysoor: " +s1.replace("ooty","mysoor"));



		System.out.println("\nData conversion using valueOf()");
                  System.out.println("------------------------------------\n");
		int i=10;
		
		System.out.println(i +" is covert using Data conversion using valueOf() : " +String.valueOf(i));
		
		System.out.println("concat 100 with string "+i+":"+100 + String.valueOf(i));
		
 
}


}
