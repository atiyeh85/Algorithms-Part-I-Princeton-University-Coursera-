/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {

        String championWinner = "";
        int j = 1;

        while (!StdIn.isEmpty()) {
            String inputWord = StdIn.readString();
            if (StdRandom.bernoulli((double) 1 / j)) {
                championWinner = inputWord;
            }
            j++;

        }
        StdOut.print(championWinner);
    }
}
