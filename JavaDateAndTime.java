import java.util.*;

public class JavaDateAndTime {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		String month = in.next();
		String day = in.next();
		String year = in.next();
		Calendar c = Calendar.getInstance();
		c.set(Integer.parseInt(year), Integer.parseInt(month) - 1,
				Integer.parseInt(day));
		System.out.println(String.format("%tA", c).toUpperCase());

	}

}
