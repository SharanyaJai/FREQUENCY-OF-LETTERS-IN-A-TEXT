/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frequency;

/**
 *
 * @author sharanya
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * Calculates Relative frequency of letters in a given file
 *
 * @author sharanya
 */

public class Frequency {

    Map<Character, Integer> m = new HashMap<Character, Integer>();
    char[] s;

    int count = 0, lengthofParsedString = 0;
    String str;
    String str1 = null;

    /**
     * Reads contents of passed file
     *
     * 
     * @throws FileNotFoundException
     * @throws IOException
     */

    public void readFile() throws FileNotFoundException, IOException {
        System.out.println("Enter the file name along with extension in the source code package: ");//Text.txt

        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        BufferedReader in = new BufferedReader(new FileReader(str));
        str = in.readLine();
        if (str != null) {
            str1 = in.readLine(); // Single line text file reading
        }
        while (str != null && str1 != null) { //Reads Multiple line text file
            // str1=in.readLine();
            str = str.concat(str1);
            str1 = in.readLine();  // concats next line to existing string

        }

        str = str.toLowerCase(); // convert all letters to lower case
        str = str.replace(" ", "");// deletes all white spaces
        s = new char[str.length()];
        s = str.toCharArray();
        lengthofParsedString = str.length(); //keeps a count of length of the string 
    }

    /**
     * Calculates Relative Frequency of all letters in the given file
     */

    public void callculateRelativeFrequency() {

        // Initialize relative frequency table from command line
        for (int i = 0; i < lengthofParsedString; i++) {
            Integer freq = m.get(s[i]);

            if (s[i] >= 97 && s[i] <= 122) { //Adds only letters to the map based on ascii value of lower case letters
                count++; //Maintains total count of all letters in the file
                if (freq != null) {
                    m.put(s[i], freq + 1); // Sets frequency to 1 if a letter is read for the first time
                } else {
                    m.put(s[i], 1); // Increments frequency of an exiting letter by 1
                }
            }
        }

    }

    /**
     * Displays the calculated relative frequency of all letters in given file
     */
    public void displayRelativeFrequency() {
        System.out.println("Total no of letters in given file :"+count+"\nRelative Frequency of all letters in the given text:");
        for (char key : m.keySet()) {
            
          
           
            System.out.printf("%-5c %-5.3f\n", key, ((float) m.get(key) / count)); //Divides frequency of each alphabet by total no of letters read in the file
        }

    }
}
