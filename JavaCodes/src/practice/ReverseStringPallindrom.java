package practice;

public class ReverseStringPallindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Verify if String is Pallindrom or not
		String st = "Nikhil";
		String reverse = "";
		for (int i = st.length() - 1; i >= 0; i--) {
			reverse = reverse + st.charAt(i);
		}
		System.out.println(reverse);
		if (reverse == st) {
			System.out.println("It is Pallindrom");
		} else {
			System.out.println("It is not Pallindrom");
		}

	}

}
