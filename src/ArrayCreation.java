public class ArrayCreation {

    public static double getAverage(double[] numbers) {
        if(numbers.length>= 3){
            double avg = (numbers[0] + numbers[((numbers.length)/2)] + numbers[(numbers.length-1)])/3;
            avg = (int) (avg + 0.5);
            return avg;
        }
        else{
            return 0.0;
        }
    }

    public static String stringArray(String[] friends) {
        if (friends.length == 5){
            String retString = "";
            retString += friends[0].length() + " " ;
            retString += friends[1].length() + " " ;
            retString += friends[2].length() + " " ;
            retString += friends[3].length() + " ";
            retString += friends[4].length() ;
            return retString;
        }
        else{
            return "";
        }
    }

    public static String countryData() {
        String[] countries = {"China", "Egypt", "France", "South Korea", "Germany", "India", "Japan", "Ghana",
                "Kenya", "Mexico", "United Kingdom", "Burkina Faso", "United States"};

        String[] capitals = {"Beijing", "Cairo", "Paris", "Seoul", "Berlin", "New Delhi", "Tokyo", "Accra", "Nairobi",
        "Mexico City", "London", "Ouagadougou", "Washington D.C."};

        String[] languages = {"Mandarin", "Arabic", "French", "Korean", "German", "Hindi", "Japanese", "Akuapem Twi",
        "Swahili", "Spanish", "English", "French", "English"};


        return "";
    }
}
