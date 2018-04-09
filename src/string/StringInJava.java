/**
 * 
 */
package string;

/**
 * @description:
 * @author: Admin
 * @time: 7:53:28 PM
 * @date: Apr 6, 2018
 */
public class StringInJava {
	static String string = "xy;zmy;zmy;Wzm";

	static String string2 = new String("1");

	public static void main(String[] args) {
		// System.out.println(string + " ca lop");

		// System.out.println(string2);
		// System.out.println(string.equals(string2));

		// System.out.println(string.compareTo(string2));

		// System.out.println(string.compareToIgnoreCase(string2));
		// System.out.println(string.concat("y"));
		// System.out.println(string + 123);

		//System.out.println(string.lastIndexOf("yzm"));
		/*String[] stringsSplit = string.split(";");
		System.out.println(stringsSplit.length);
		for (String string : stringsSplit) {
			System.out.println(string);
		}*/
		System.out.println(string.substring(3,4));
	}

}
