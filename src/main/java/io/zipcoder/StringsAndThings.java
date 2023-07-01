package io.zipcoder;
import java.util.ArrayList;

/**
 * @author tariq
 */
public class StringsAndThings {

    /**
     * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
     * but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic
     * letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
     * example : countYZ("fez day"); // Should return 2
     *           countYZ("day fez"); // Should return 2
     *           countYZ("day fyyyz"); // Should return 2
     */
    public Integer countYZ(String input){

                                     //An array to hold the words separated from the input
        String[] separatedWords = input.split(" ");
                                    //A counter to keep track of how many words fit the criteria
        int count = 0;
                                     //Check each element in the array for the ending characters
        for (int i = 0; i <= separatedWords.length - 1; i++) {
            if (separatedWords[i].endsWith("y") || separatedWords[i].endsWith("Y") ) {
                count++;
            } else if  (separatedWords[i].endsWith("z") || separatedWords[i].endsWith("Z") ) {
                count++;
            }
        }
        return count;
    }

    /**
     * Given two strings, base and remove, return a version of the base string where all instances of the remove string have
     * been removed (not case sensitive). You may assume that the remove string is length 1 or more.
     * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
     *
     * example : removeString("Hello there", "llo") // Should return "He there"
     *           removeString("Hello there", "e") //  Should return "Hllo thr"
     *           removeString("Hello there", "x") // Should return "Hello there"
     */
    public String removeString(String base, String remove){

        String newBase = "";
        newBase = base.replace(remove, "");

        return newBase;
        }





    /**
     * Given a string, return true if the number of appearances of "is" anywhere in the string is equal
     * to the number of appearances of "not" anywhere in the string (case sensitive)
     *
     * example : containsEqualNumberOfIsAndNot("This is not")  // Should return false
     *           containsEqualNumberOfIsAndNot("This is notnot") // Should return true
     *           containsEqualNumberOfIsAndNot("noisxxnotyynotxisi") // Should return true
     */
    public Boolean containsEqualNumberOfIsAndNot(String input){

        //set counters and somewhere to keep the answer
        int isCount = 0;
        int notCount = 0;
        boolean equality;

        //break down input into an array of strings and check through each char

        for (int i = 0; i < input.length() - 2; i++) {
            if (input.charAt(i) == 'i' ) {
                if (input.charAt(i + 1) == 's') {
                    isCount ++;
                } else isCount = isCount;
            }
        }

        for (int i = 0; i < input.length() - 2; i++ ) {
            if (input.charAt(i) == 'n') {
                if (input.charAt(i + 1) == 'o') {
                    if (input.charAt(i + 2) == 't') {
                        notCount++;
                    } else notCount = notCount;
                }
            }
        }

        //check if the number of ifs equal the number of nots
        if (isCount == notCount) {
            equality = true;
        } else {
            equality = false;
        }

        return equality;
    }

    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     * example : gHappy("xxggxx") // Should return  true
     *           gHappy("xxgxx") // Should return  false
     *           gHappy("xxggyygxx") // Should return  false
     */
    public Boolean gIsHappy(String input){
      boolean allHappy = false;

        //check to see if a g exists
        for (int i = 0; i < input.length() - 1; i++) {              //if one exists check to see if there is one to the left OR right
            if (input.charAt(i) == 'g') {
                if (input.charAt(i - 1) == 'g' || input.charAt(i + 1) == 'g') {
                    allHappy = true;
                } else allHappy = false;            // check if there are any lone gs
            }

        }

        return allHappy;

    }


    /**
     * We'll say that a "triple" in a string is a char appearing three times in a row.
     * Return the number of triples in the given string. The triples may overlap.
     * example :  countTriple("abcXXXabc") // Should return 1
     *            countTriple("xxxabyyyycd") // Should return 3
     *            countTriple("a") // Should return 0
     */
    public Integer countTriple(String input){
       int counter = 0;

        for (int i = 0; i < input.length() -2; i++) {
            if (input.charAt(i) == input.charAt(i + 1) && input.charAt(i + 1) == input.charAt(i + 2)) {
                counter++;
            }
        }
        return counter;
    }
}
