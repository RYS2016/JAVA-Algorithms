import javax.swing.JOptionPane;
import java.util.StringTokenizer;

public class StringTest {

	public static void main(String[] args) {

		try {
			String input = JOptionPane.showInputDialog("Enter data using the format Name,Age,City");
			System.out.println(input.trim());

			int pos = input.indexOf(',');
			String name = input.substring(0, pos);
			System.out.println("First Comma Position:" + pos + ", Name:" + name + ", Length:" + name.length());
			int pos2 = input.indexOf(',', pos + 1);

			String age = input.substring(pos + 1, pos2);
			System.out.println("Second Comma Position:" + pos2 + ", Age:" + age);

			int iValue = Integer.parseInt(age);// Convert the string input to an integer
			System.out.println("You will be " + (iValue + 10) + " in 10 years from now") ;

			String city = input.substring(pos2 + 1, 18);
			System.out.println("City:" + city + ", Length: " + city.length());
		}
		catch (NullPointerException e)
		{
			System.out.println(e);
			System.out.println("Why Cancel???");
		}
		catch (NumberFormatException e) 
		{
			System.out.println(e);
			System.out.println("Try a number instead of literals");
		}
		catch (IndexOutOfBoundsException e)
		{
			System.out.println(e);
			System.out.println("You should put a little bit more information");
		}
	}
}
