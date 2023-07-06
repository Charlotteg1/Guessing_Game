public class WeatherCheck {
    public static void main(String[] args) {
        int temperature = 17;
        boolean currentlyRaining = false;
        if((temperature>=13) && currentlyRaining==false){
            System.out.println("No coat needed!");
        }else if(currentlyRaining && temperature>=13){
            System.out.println("Bring umbrella or wear rain mac");
        }else if (temperature<13 || currentlyRaining){ // here the || currently raining would be redundant
            System.out.println("Wear a coat");
        }
    }
}
