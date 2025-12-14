package sumo.sim;

import java.util.*;

public class Util {

    // used for initial selection of binary path

    /**
     * Used to recognise what operating system the program is being run on.
     *
     * @return The recognised operating system.
     */
    public static String getOSType() {
        String os = System.getProperty("os.name");
        if (os.toLowerCase().contains("windows")) {
            return "Windows";
        }
        else {
            return "Other";
        }
    }
}