import org.apache.kafka.streams.StreamsBuilder;

import java.util.Arrays;

public class StringReverse {
    public static void main(String[] args) {
        String givenString = "KMC India KMC India welcomes you";
        String[] tempArray = givenString.split(" ");
        String[] outputArray = new String[tempArray.length + 1];
        int number = 0;
        for (int i = tempArray.length - 1; i > 0; i--) {

            int count = 0;
            for (int j = tempArray.length - 1; j >= 0; j--) {

                if (tempArray[i].equals(tempArray[j])) {
                    count = count + 1;
                }
            }
            if (count == 1) {
                outputArray[number] = tempArray[i];
                number++;
            }
        }
        for (String string : outputArray) {
            if (string != null) {
                System.out.println(string);
            }
        }
    }

}
