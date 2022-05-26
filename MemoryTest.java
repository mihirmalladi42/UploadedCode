import java.util.Timer;
import java.util.TimerTask;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class Main extends Colors {
    public static int num = 0;
    public static int level = 1;
    public static void plS(String outStr) {
        System.out.println(outStr);
    }
    public static void plI(int outInt) {
        System.out.println(outInt);
    }
    public static void pI(int outInt) {
        System.out.print(outInt);
    }
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
                pI(symbols[num]);
                num++;
                if (num >= level) {
                    plS("\033[H\033[2J");
                    timer.cancel();
                    boolean checker = checker(symbols, setNum);
                    if (checker) {
                        plS(GREEN + "Correct." + RESET);
                        boolean doAgain = doAgain(level);
                        if (doAgain) {
                            num = 0;
                            memory(level+1);
                        } else {
                            plS(CYAN + "Thank you for testing your memory." + RESET);
                        }
                    } else {
                        String[] strSymbols = new String[symbols.length];
                        for (int l = 0; l < symbols.length; l++) {
                            strSymbols[l] = Integer.toString(symbols[l]);
                        }
                        plS(RED + "Incorrect. The correct order was '" + YELLOW + (String.join("",strSymbols)) + RED + "'." + RESET);
                    }   
                }
            }
        }, 0, 1000);

    }
    public static boolean doAgain(int level) {
        Scanner nextLevel = new Scanner(System.in);
        plS(GREEN + "Do you want to go to level " + (level+1) + "? (Yes or no): " + RESET);
        String response = nextLevel.nextLine();
        if (response.equalsIgnoreCase("yes")) {
            return true;
        } else if (response.equalsIgnoreCase("no")){
            return false;
        } else {
            plS(RED + "Enter a correct response." + RESET);
            return false;
        }
    }
    public static boolean checker(int[] symbols, int setNum) {
        Scanner inOrder = new Scanner(System.in);
        plS(BLUE + "What were the numbers in order? (Type " + setNum + " after you type everything else) (IF YOU WERE ON LEVEL 1, JUST TYPE " + setNum + "): " + RESET);
        String res = inOrder.nextLine();
        String[] resArr = res.split("");
        int[] newArrInt = new int[resArr.length];
        for (int i = 0; i < resArr.length; i++) {
            newArrInt[i] = Integer.parseInt(resArr[i]);
        }
        return Arrays.equals(newArrInt, symbols);
    }
    public static void main(String[] args) {  
        Scanner levelScan = new Scanner(System.in);
        plS("What level do you want to start at? (Enter a number): ");
        int levelNum = levelScan.nextInt();  
        memory(levelNum);
    }
}
