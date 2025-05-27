import java.io.File;

import static java.lang.System.out;

public class MyFiles2 {

    public static void main(String[]args) {

        File dir = new File("NewFolder");

        // starting with if else

        if (dir.exists()) {
            // :)
            // calling out array

            String[] files = dir.list();
            // new keyword "assert"
            assert files != null;

            out.println(files.length + " files found.");
            // let's see those files. using for loop.

            for(int i = 0; i < files.length; i++) {
                out.println(files[i]);
            }

        } else {
            // :(
            out.println("Directory does not exist.");
        }

    }
}
