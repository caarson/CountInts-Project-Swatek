import java.util.Scanner;

class CountInts {

        // declare scan obj:
        private static Scanner scanObj = new Scanner(System.in);

        // append element to array using pure java, alternatively you could convert to an ArrayList but this is better to demonstrate Arrays.
        public static int[] addElementUsingPureJava(int[] srcArray, int elementToAdd) {
                int[] destArray = new int[srcArray.length+1];

                for(int i = 0; i < srcArray.length; i++) {
                        destArray[i] = srcArray[i];
                }

                destArray[destArray.length - 1] = elementToAdd;
                return destArray;
        }

        // declare callProject function:
        public static int[] callProject() {

                System.out.println("Welcome to the CountInts Project!\n(Find mean and mode!)\nHow many numbers do you want to type in?:\n");
                int inputNumberOfIterations = scanObj.nextInt(); // get number of iterations.
                System.out.println("\n"); // new line


                // declare array to store inputs that are **numbers**:
                int[] inputsFromUser = new int[0];

                // for loop to add inputs to **inputsFromUser**:
                for (int x = 0; x < inputNumberOfIterations; x++) {

                        System.out.println("Enter any number: \n");

                        // get number input from user:
                        int input = scanObj.nextInt();

                        // return inputsFromUser with new array item:
                        inputsFromUser = addElementUsingPureJava(inputsFromUser, input); // loc line: 9

                        // print value to the console:
                        System.out.println(inputsFromUser);

                }
                return inputsFromUser;
        }

        // calculates the mode given an Array and the number of items in that Array:
        public static int calculateMode(int[] numberArray, int numberOfItemsInArray) { // return an integer value, accept an Array, pass through the number of iterations
                int maxValue = 0, maxCount = 0, i, j; // create several variables to store data

                for (i = 0; i < numberOfItemsInArray; ++i) {
                        int count = 0;
                        for (j = 0; j < numberOfItemsInArray; ++j) {
                                if (numberArray[j] == numberArray[i])
                                        ++count;
                        }

                        if (count > maxCount) {
                                maxCount = count;
                                maxValue = numberArray[i];
                        }
                }
                return maxValue;


        }

        // calculates the mean given an Array and the number of items in that Array:
        public static double calculateMean(int[] numberArray, int numberOfItemsInArray) { // return a double value, accept an Array, pass through the number of iterations
                int sum = 0;
                for (int i = 0; i < numberOfItemsInArray; i++)
                        sum += numberArray[i];

                return (double)sum / (double)numberOfItemsInArray;
        }

} // denotes end of CountInt


