public class VariableScopeGlobal {

    final static String txt = "This is a GLOBAL variable of the VariableScopeGlobal class.";

    public static void main(String[]args) {

        String txt = "This is my local variable in the main method.";
        System.out.println(txt);

        // we are going to print our the GLOBAL variable. look at how we are calling it.
        System.out.println(VariableScopeGlobal.txt);
        
        sub();
    }

    public static void sub() {

        String txt = "This is our local variable inside our sub method.";
        System.out.println(txt);

    }
}
