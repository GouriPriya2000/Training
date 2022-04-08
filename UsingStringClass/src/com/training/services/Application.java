package com.training.services;

public class Application {

	public static void main(String[] args) 
	{
		
		StringService service = new StringService();
		int key =14;
		
		switch (key) {
		case 1:
			service.stringEquals("ram", "ram");
			break;
		case 2: 
			service.StringObjectEquals();
			break;
		case 3:
			service.usingTrim("   ramesh   ");
			break;
		case 4: 
			service.lengthOfString("  ramesh  ");
			break;
		case 5:
			service.usingSubString("Happy Morning");
			break;
		case 6:
			service.usingIndexOf("ram@abc.com");
			break;
		case 7:
			service.usingCharAt("ram@abc.com");
			break;
		case 8:
			service.usingReplace("ram@abc.com", "hello");
			break;
		case 9:
			service.usingConcat("Hello", "Chennai");
			break;
		case 10:
			service.usingCompareTo("3", "2");
			break;
		case 11:
			service.usingStringFormat("ram", 45.258);
			break;
		case 12:
			service.usingStringFormat(17);
			break;
		case 13:
			service.usingStringFormat(16, 16);
			break;
		case 14:
			service.usingStringFormat("heLLo", "HEllo");
			break;
		case 15:
			service.usingStringFormat(421L);
			break;
		default:
			break;
		}

	}

}
