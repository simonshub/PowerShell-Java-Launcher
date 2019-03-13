package src;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

/**
 * 
 * A simple sample Java application for use in the PowerShell Java-Launcher script's example.
 * 
 * @author Simon
 */
public class JustAnotherJavaApplication {
    
    private static final String VERSION_FILE = "version.txt";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<String> arg_list = Arrays.asList(args);
        
        if (arg_list.contains("version") || arg_list.contains("v")) {
            String version_contents = "?";
            try {
                byte[] encoded = Files.readAllBytes(Paths.get(VERSION_FILE));
                version_contents = new String (encoded, Charset.forName("UTF-8"));
            } catch (IOException ex) { }
            System.out.println("v"+version_contents);
            return;
        }
        
        System.out.println("Hello there! These are your arguments; ");
        for (String arg : arg_list) {
            System.out.println("\t"+arg);
        }
        System.out.println("Ok, have a nice day!");
    }
    
}
