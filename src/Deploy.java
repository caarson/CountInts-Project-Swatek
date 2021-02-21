// import all methods that exist under parent "util":
import java.util.*;

// declare a public class "Deploy" to run the code from CountInts class: extend class CountInts to allow access of functionality from within that class
public class Deploy extends CountInts {

    // declare a main function to test the individual code for the project:
    public static void main(String[] args) {
        // declare variables and do specific method calls to get the project started.
        int[] numberArrayFromUser = callProject();
        int lengthOfArray = numberArrayFromUser.length;

        // print the results to console:
        System.out.println(Arrays.toString(numberArrayFromUser)); // start the project from CountInts > callProject

        // calculate the mean & mode and print these values to console:
        System.out.println("Here is the Mode! : \n" + calculateMode(numberArrayFromUser, lengthOfArray));
        System.out.println("Here is the Mean! : \n" + calculateMean(numberArrayFromUser, lengthOfArray));
    }



}
