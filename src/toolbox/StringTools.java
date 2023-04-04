package toolbox;

//toolbox.StringTools: collection of useful methods for string manipulation
public class StringTools {
	//center: returns String of specified length with the given string centered
	public static String center(String string, int length){
		return center(string, length, ' ');
	}
	public static String center(String string, int length, char fillChar){
		return center(string, length, fillChar, fillChar);
	}
	public static String center(String string, int length, char fillCharFront, char fillCharBack){
		//if given String is longer than specified length
		if(string.length() > length){
			//return string up to length limit with the last 3 chars set to "..."
				// center("my String is too long!", 7) returns "my Stri..."
			return cut(string, length);
		}
		//declare and init return String
		String centeredString = new String();
		//while centeredString is shorter that specified length of return String
		while(centeredString.length() < length){
			//if centeredString.length is equal to half the given length minus half the length of the String to center
			if(centeredString.length() == length/2 - string.length()/2){
				//add string to centeredString
				centeredString += string;
			//if centeredString is shorter then half of the wanted length
			}else if(centeredString.length() < length/2){
				//add char in front of string
				centeredString += fillCharFront;
			}else{
				//add char after string
				centeredString += fillCharBack;
			}
		}
		return centeredString;
	}
	//alignLeft: returns String of specified length with the given string aligned left
	public static String alignLeft(String string, int length){
		return alignLeft(string, length, ' ');
	}
	public static String alignLeft(String string, int length, char fillChar){
		//if given String is longer than specified length
		if(string.length() > length){
			//return string up to length limit with the last 3 chars set to "..."
			// center("my String is too long!", 7) returns "my Stri..."
			return cut(string, length);
		}
		//declare and init return String
		String alignLeftString = string;
		//while flushLeftString is shorter that specified length of return String
		while(alignLeftString.length() < length){
			//add char after string
			alignLeftString += fillChar;
		}
		return alignLeftString;
	}
	//alignRight: returns String of specified length with the given string aligned right
	public static String alignRight(String string, int length){
		return alignRight(string, length, ' ');
	}
	public static String alignRight(String string, int length, char fillChar){
		//if given String is longer than specified length
		if(string.length() > length){
			//return string up to length limit with the last 3 chars set to "..."
			// center("my String is too long!", 7) returns "my Stri..."
			return cut(string, length);
		}
		//declare and init return String
		String alignRightString = new String();
		//while flushRightString is shorter that specified length of return String
		while(alignRightString.length() < length - string.length()){
			//add char after string
			alignRightString += fillChar;
		}
		alignRightString += string;
		return alignRightString;
	}
	public static String cut(String string, int length){
		return string.substring(0, length-3) + "...";
	}
}
