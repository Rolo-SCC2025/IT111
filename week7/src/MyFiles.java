import java.io.File;

public class MyFiles {

    public static void main(String[]args) {
// we are going to create a file object

        File dir = new File("/Users/rolmu/IdeaProjects/week7/NewFolder");

        // create an if else statement. if directory exists, yay
        // else, nay

        if (dir.exists()) {
            System.out.println("Yippy skippy!");
        } else {
            System.out.println("Oh noes~ Where be directory???");
        }

    }

}
