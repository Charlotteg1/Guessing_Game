public class GuessingGame {
    public static void main(String[] args) {
        int secretNumber = 47;
        int guess = 36;
        if( guess == secretNumber){
            System.out.println("Correct");
        }else if(guess > secretNumber){
            System.out.println("Too High");
        }else{
            System.out.println("Too Low");
        }
    }
}
