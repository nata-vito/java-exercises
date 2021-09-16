import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
       TimeTo seconds = new TimeTo();
       Scanner in = new Scanner(System.in);

       System.out.printf("Time in seconds: ");
       seconds.setInput(in.nextInt());
       in.close();

       seconds.toTimers();

       seconds.printData();
    }
}
