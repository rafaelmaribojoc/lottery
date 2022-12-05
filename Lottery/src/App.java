import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        //Instantiate constant
        Scanner input  = new Scanner(System.in);
        Random random = new Random();

        //Variable declaration
        int betNum, lottoRandomNum, lottoRes1, lottoRes2, betNum1, betNum2, returnedVal;

        do { 
        
        //Input
        lottoRandomNum = random.nextInt(100);
        System.out.print("Enter your bet number: ");
        betNum = input.nextInt();

        //Bet Split Numbers
        betNum1 = betNum / 10; //betNum1 = input(betNum) divided by 10;
        betNum2 = betNum % 10;

        //Lotto Split Numbers
        lottoRes1 = lottoRandomNum / 10; //lottoRes1 = random generated num(LRN) divided by 10;
        lottoRes2 = lottoRandomNum % 10;
        
        //Conditional's (return) value is now stored to a variable(returnedVal)
        returnedVal = condition(betNum, lottoRandomNum, lottoRes1, lottoRes2, betNum1, betNum2);

        } while (returnedVal != 0);

        // Output result why they lost if the while loop yield true (that returnedVal is 0)
        // System.out.println("\n");
        // System.out.println("lottoRandomNum = " + lottoRandomNum);
        // System.out.println("betNum = " + betNum);
        // System.out.println("lottoRes1 = " + lottoRes1);
        // System.out.println("lottoRes2 = " + lottoRes2);
        // System.out.println("betNum1 = " + betNum1);
        // System.out.println("betNum2 = " + betNum2);
    }

    public static int condition(int betNum, int lottoRandomNum, int lottoRes1, int lottoRes2, int betNum1, int betNum2 ) {

        if (lottoRandomNum == betNum) {
            System.out.println("\nResult: You won $10,000!\n");
            return 1;
        } else if (lottoRes1 == betNum2 && lottoRes2 == betNum1) {
            System.out.println("\nResult: You won $3,000!\n");
            return 2;
        } else if (lottoRes1 == betNum2 || lottoRes2 == betNum1 || lottoRes1 == betNum1 || lottoRes2 == betNum2) {
            System.out.println("\nResult: You won $1,000!\n");
            return 3;
        } else {
            System.out.println("\nResult: You lost!\n");
            return 0;
        }

    }

    
}
