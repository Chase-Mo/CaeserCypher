import java.util.ArrayList;
import java.util.List;

public class CaeserCrypt {

    public CaeserCrypt(){

    }
    public static List<Character> EncryptCaeser(String message, String diff) {

        List<Character> eMessage = new ArrayList<>();

        if(checkUsingMatchesMethod(message)) {
            System.out.print("Message has numbers");
            return eMessage;
        }

        if(checkOnlyContainsNumbers(message)){
            System.out.print("Diff is not a number");
            return eMessage;
        }

        try {
            int i;
            //Check for negative numbers
            if(diff.charAt(0) == '-')
            {
                i = 26 + Integer.parseInt(diff);
            }
            else {
                i = Integer.parseInt(diff);
            }

            //Parse though message
            for(int p = 0; p < message.length(); p++)
            {
                //If white space, leave alone
                if(message.charAt(p) == ' ')
                {
                    eMessage.add(' ');
                    continue;
                }

                int number = Character.getNumericValue(message.charAt(p));
                int holder = 65 + ((i + number - 10) % 26);
                eMessage.add(Character.toLowerCase((char) holder));

            }
        }catch(Exception e)
        {
            System.out.println("Something went wrong");
        }
        return eMessage;
    }

    public static void messageDisplay(List<Character> e)
    {
        e.forEach(System.out::print);
    }

    //Method to check string for numbers
    // Credit to: https://www.baeldung.com/java-string-number-presence
    static boolean checkUsingMatchesMethod(String input) {
        return input.matches(".*\\d.*");
    }

    static boolean checkOnlyContainsNumbers(String input){
        return input.matches("\\d+");
    }


}
