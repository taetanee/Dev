package work;

public class CamelReg {

	public static void main(String[] args) {
		String key = "resPensionType";
		String value = "";
		value = key.substring(3).replaceAll("([a-z])([A-Z]+)", "$1_$2").toLowerCase();
		System.out.println(value);
	}

	//@Test
	public void x() {

	}
}