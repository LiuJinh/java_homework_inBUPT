package homework5;

public class StringUtil {
	public static boolean isStr(String str){
		if(str!=null&&!str.equals(""))
			return true;
		return false;
	}
	
	public static boolean isInteger(String value) {
		 try {
		  Integer.parseInt(value);
		  if(Integer.parseInt(value)>=0)
			  return true;
		  return false;
		 } catch (NumberFormatException e) {
		  return false;
		 }
	}
	
	public static boolean isDouble(String value) {
		 try {
		  Double.parseDouble(value);
		  if (value.contains(".")&&Double.parseDouble(value)>=0)
		   return true;
		  return false;
		 } catch (NumberFormatException e) {
		  return false;
		 }
	}
	
	public static boolean isNumber(String value) {
		 return isInteger(value) || isDouble(value);
	}

}
