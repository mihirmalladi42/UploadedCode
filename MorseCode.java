import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class MorseCode {
    public static void convert() {
        Scanner wordInp = new Scanner(System.in);
	    System.out.println("What do you want to convert to Morse Code?");
	    String input = wordInp.nextLine();
	    String upper = input.toUpperCase();
	    String[] spl = upper.split("");
	    String[] charsandsymbols = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", ".", ",", "?", "'", ":", "=", "/", "!", ";", "+", "-", "@", "(", ")", "&", "_", "$", " "};
	    ArrayList<String> charsAndSymbolsArrList = new ArrayList<>(Arrays.asList(charsandsymbols));
	    String[] morseCodeArr = {" ∙- ", "-∙∙∙", "-∙-∙", "-∙∙", "∙", "∙∙-∙", "--∙", "∙∙∙∙", "∙∙", "∙---", "-∙-", "∙-∙∙", "--", "-∙", "---", "∙--∙", "--∙-", "∙-∙", "∙∙∙", "-", "∙∙-", "∙∙∙-", "∙--", "-∙∙-", "-∙--", "--∙∙", "-----", "∙----", "∙∙---", "∙∙∙--", "∙∙∙∙-", "∙∙∙∙∙", "-∙∙∙∙", "--∙∙∙", "---∙∙", "----∙", "∙-∙-∙-", "--∙∙--", "∙∙--∙∙", "∙----∙", "---∙∙∙", "-∙∙∙-", "-∙∙-∙", "-∙-∙--", "-∙-∙-∙", "∙-∙-∙", "-∙∙∙∙-", "∙--∙-∙", "-∙--∙", "-∙--∙-", "∙-∙∙∙", "∙∙--∙-", "∙∙∙-∙∙-", "     "};
		ArrayList<String> morseCode = new ArrayList<>(Arrays.asList(morseCodeArr));
        for (int i = 0; i < spl.length; i++) {
		    System.out.print("/ " + morseCode.get(charsAndSymbolsArrList.indexOf(spl[i])) + " ");
		}
		System.out.println("/");
		doAgain();
    }
    public static void doAgain() {
        Scanner doAgain = new Scanner(System.in);
        System.out.println("Do you want to convert more text to Morse Code? (Type yes or no)");
        String yesorno = doAgain.nextLine();
        if (yesorno.equalsIgnoreCase("yes")) {
            convert();
        } else if (yesorno.equalsIgnoreCase("no")) {
            System.out.println("Thank you for using the Morse Code converter!");
        } else {
            System.out.println("Please enter a valid response.");
            doAgain();
        }
    }
	public static void main(String[] args) {
	    convert();
	}
}

