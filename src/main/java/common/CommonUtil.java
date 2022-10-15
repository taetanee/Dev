package common;

public class CommonUtil {
	public static boolean isNumeric(String s) {
		try {
			Double.parseDouble(s);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	public static boolean isNumeric(char s) {
		try {
			Double.parseDouble(String.valueOf(s));
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
}