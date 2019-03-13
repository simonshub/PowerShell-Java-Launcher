package src;

import java.util.Arrays;
import java.util.List;

/**
 * 
 * A simple sample Java application for use in the PowerShell Java-Launcher script's example.
 * 
 * @author Simon
 */
public class JustAnotherJavaApplication {
    
    private static final int VERSION = 1;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<String> arg_list = Arrays.asList(args);
        
        if (arg_list.contains("version") || arg_list.contains("v")) {
            System.out.println("v"+VERSION);
            return;
        }
        
        System.out.println("Hello there! These are your arguments; ");
        for (String arg : arg_list) {
            System.out.println("\t"+arg);
        }
        System.out.println("Ok, have a nice day!");
    }
    
}
