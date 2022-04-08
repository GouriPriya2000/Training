package com.training.services;

public class StringService 
{
	public void stringEquals(String str1 , String str2)
	{
		System.out.println("Is value Same: " + str1.equals(str2));
		
		System.out.println("Are they pointing to the same location:" + (str1==str2));
	}
	
	public void StringObjectEquals()
	{
		String ram = new String("ram");
		String ramesh = new String("ram");
		
		System.out.println("Is values Same: " + ram.equals(ramesh));
		System.out.println("Are they pointing to the same location:" + (ram==ramesh));
		
	}
	
	public String usingTrim(String name)
	{
		System.out.println("without trim: " + name);
		System.out.println("Trim: " + name.trim());
		
		return name.trim();
	}
	
	public void lengthOfString(String name)
	{
		String resp = usingTrim(name);
		System.out.println("String length: " + resp.length());
		
	}
	
	public void usingSubString(String name)
	{
		System.out.println(name.substring(3));
		System.out.println(name.substring(0,3));
	}
	
	public void usingIndexOf(String name)
	{
		System.out.println("Index Position of @: " + name.indexOf("@"));
	}
	
	public void usingCharAt(String name) {
		System.out.println("Character at position 3: " + name.charAt(3));
	}
	
	public void usingReplace(String str1, String str2)
	{
		System.out.println(str1.replace(".com", ".org"));
		System.out.println(str2.replace("h","H"));
	}
	
	public void usingConcat(String str1, String str2)
	{
		System.out.println(str1.concat(str2));
		
		StringBuilder builder = new StringBuilder(str1);
		builder.append(str2);
		System.out.println(builder.toString());
	}
	
	public void usingCompareTo(String str1, String str2)
	{
		System.out.println(str1.compareTo(str2));
	}
	
	public void usingStringFormat(String str1, double mark)
	{
		String formatString = String.format("Name %S", str1);
		System.out.println(formatString);
		
		System.out.println(String.format("Mark %.2f" , mark));
	}
	
	public void usingStringFormat(int mark)
	{
		System.out.println(String.format("Octal %o", mark));
		System.out.println(String.format("Hexa Decimal %x", mark));
	}
	
	public void usingStringFormat(int mark1, int mark2)
	{
		System.out.println(String.format("Octal %1$o, Hexa %2$x", mark1,mark2));
		
	}
	
	public void usingStringFormat(String str1, String str2)
	{
		System.out.println(String.format("%1$s %2$S", str1,str2));
	}
	
	public void usingStringFormat(long value)
	{
		System.out.println(String.format("%+d", value));
	}
}
