public class WeatherCheck {
    public static void main(String[] args) {
        int temperature = 13;
        boolean currentlyRaining = false;
        // below will print out whether a coat is needed or not
        if((temperature>=13) && currentlyRaining==false){ //Test to see if it's hot
            System.out.println("No coat needed!");
        }else if(currentlyRaining && temperature>=13){ //Hot but raining
            System.out.println("Bring umbrella or wear rain mac");
        }else if (temperature<13 || currentlyRaining){ // See if cold.
            // Here the || currently raining would be redundant. Could use
            System.out.println("Wear a coat");
        }
    }
}
