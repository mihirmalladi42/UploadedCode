import java.util.Timer;
import java.util.TimerTask;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class MemoryTest extends Colors{
    public static int num = 0;
    public static int level = 1;
    public static void memory(int level) {
            int[] symbols = new int[level];
            Random newRand = new Random();
            for (int i = 0; i < level; i++) {
                int returner = newRand.nextInt(5)+1;
                symbols[i] = returner;
            }
            int setNum = newRand.nextInt(9)+1;
            symbols[symbols.length-1] = setNum;
            Timer timer = new Timer();
                timer.schedule(new TimerTask() {
                    public void run() {
                     System.out.print(symbols[num]);
                     num++;
                     if (num >= level) {
                        System.out.println("\033[H\033[2J");
                         timer.cancel();
                         boolean checker = checker(symbols, setNum);
                         if (checker) {
                            System.out.println(GREEN + "Correct." + RESET);
                            boolean doAgain = doAgain(level);
                                if (doAgain) {
                                    num = 0;
                                    memory(level+1);
                                } else if (!doAgain) {
                                    System.out.println(CYAN + "Thank you for testing your memory." + RESET);
                                }
                         } else if (!checker) {
                             String[] strSymbols = new String[symbols.length];
                             for (int l = 0; l < symbols.length; l++) {
                                 strSymbols[l] = Integer.toString(symbols[l]);
                             }
                             System.out.println(RED + "Incorrect. The correct order was '" + YELLOW + (String.join("",strSymbols)) + RED + "'." + RESET);
                         }   
                       }
                    }
                 }, 0, 1 * 1000);

    }
    public static boolean doAgain(int level) {
        Scanner nextLevel = new Scanner(System.in);
        System.out.println(GREEN + "Do you want to go to level " + (level+1) + "? (Yes or no): " + RESET);
        String response = nextLevel.nextLine();
        if (response.equalsIgnoreCase("yes")) {
            return true;
        } else if (response.equalsIgnoreCase("no")){
            return false;
        } else if (response.equalsIgnoreCase("schmetterling")){
            System.out.println(YELLOW + "Ich freue mich, dass Sie an den Schmetterling gedacht haben, der im Krankenhaus war. Dies war jedoch eine Ja- oder Nein-Frage, also nehme ich dies als Nein." + RESET);
            return false;
        } else {
            System.out.println(RED + "Enter a correct response." + RESET);
            return false;
        }
    }
    public static boolean checker(int[] symbols, int setNum) {
        Scanner inOrder = new Scanner(System.in);
        System.out.println(BLUE + "What were the numbers in order? (Type " + setNum + " after you type everything else) (IF YOU WERE ON LEVEL 1, JUST TYPE " + setNum + "): " + RESET);
        String res = inOrder.nextLine();
        String[] resArr = res.split("");
        int[] newArrInt = new int[resArr.length];
        for (int i = 0; i < resArr.length; i++) {
            newArrInt[i] = Integer.parseInt(resArr[i]);
        }
            if (Arrays.equals(newArrInt, symbols)) {
                return true;
            } else {
                return false;
            }
    }
    public static void main(String[] args) {  
        Scanner levelScan = new Scanner(System.in);
        System.out.println("What level do you want to start at? (Enter a number): ");  
        int levelNum = levelScan.nextInt();  
        memory(levelNum);
    }
}
