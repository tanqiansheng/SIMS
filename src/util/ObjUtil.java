package util;

public class ObjUtil {
	public static boolean isEmpty(Object obj){
		if(obj==null)
			return true;
		if(obj instanceof java.lang.String){
			if(((java.lang.String )obj).length()<=0)
				return true;
		}
		return false;
		
		
	}
	

}
