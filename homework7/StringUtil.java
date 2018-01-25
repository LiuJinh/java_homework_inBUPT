package homework7;

import java.util.regex.Pattern;

public class StringUtil {
	public static boolean isStr(String str){
		if(str!=null&&!str.equals(""))
			return true;
		return false;
	}
	
	public static boolean isInteger(String str) {
		if (null == str || "".equals(str)) {  
	        return false;  
	    }  
	    Pattern pattern = Pattern.compile("^[-\\+]?[\\d]*$");  
	    return pattern.matcher(str).matches(); 
	}
	
	public static boolean isDouble(String str) {
		if (null == str || "".equals(str)) {  
	        return false;  
	    }  
	    Pattern pattern = Pattern.compile("^[-\\+]?[.\\d]*$");  
	    return pattern.matcher(str).matches();  
	}
	
	public static boolean isNumber(String value) {
		 return isInteger(value) || isDouble(value);
	}

}
