
package concreteExample;

import java.util.Scanner;
/**
 *
 * @author Jenna
 */
public class InputService {
    private Scanner scanner;
    
    public InputService() {
        scanner = new Scanner(System.in);
    }

    public Scanner getScanner() {
        return scanner;
    }

    public String getInput() {  
       String input = System.console().readLine();
       return input;
    }

}
