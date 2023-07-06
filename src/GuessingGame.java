public class GuessingGame {
    public static void main(String[] args) {
        int secretNumber = 47; // Number aiming to guess
        int guess = 36;
        if( guess == secretNumber){
            System.out.println("Correct");
        }else if(guess > secretNumber){ //test if greater than
            System.out.println("Too High");
        }else{ //this result is because it is less than
            System.out.println("Too Low");
        }
    }
}
