import java.util.Scanner;


public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubstitutionCipher aShift = new SubstitutionCipher(5);
		ShuffleCipher aShuffle = new ShuffleCipher (1);
		System.out.println("Please enter the message you want to decode");
		Scanner keyboard= new Scanner(System.in);
		String message = keyboard.next();
	
		System.out.println(aShift.decode(message));
		System.out.println(aShuffle.decode(message));
	}

}
