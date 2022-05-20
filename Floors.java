import java.util.Arrays;
public class Floors extends Colors{
    static String[] toStrSplit;
    static int floor = 100;
    static String floorStr = "(.*)" + floor + "(.*)";
    public static void main(String[] args) {
        int count = 0;
        

        
        for (int i = ((100*floor)+1); i <= ((100*floor)+10); i++) {
            String toStr = Integer.toString(i);
            
            toStrSplit = toStr.split("");
            for (int j = 0; j < 2; j++) {
                int chunkSize = Integer.toString(floor).length();
 
                String[] chunks = (Integer.toString(i)).split("(?<=\\G.{" + chunkSize + "})");
                   if (chunks[j].matches(floorStr)) {
                      count++;
                   }
                //System.out.println(Arrays.toString(chunks));
            }
            System.out.println(toStr);
        }
        
            System.out.println(count);
            System.out.println(Arrays.toString(toStrSplit));
    }
}