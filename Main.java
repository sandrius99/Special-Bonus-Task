import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        try {
            File myObj = new File("./input.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                char[] characters = data.toCharArray();
                int consecutiveInts = 0;
                for(int i=0; i<characters.length; i++){
                    int ascii = (int) characters[i];
                    
                    // First number can't be equal to 0
                    if(consecutiveInts == 1) {
                        if (ascii > 47 && ascii < 58) consecutiveInts++;
                        else consecutiveInts = 0;
                    } else {
                            if (ascii > 48 && ascii < 58) consecutiveInts++;
                            else consecutiveInts = 0;

                    }

                    if(consecutiveInts >= 2) {
                        System.out.println(data);
                        break;
                    }

                }

            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
}