//A bookseller has lots of books classified in 26 categories labeled A, B, C, ..., Z. Each book has a code of at least 3 characters. The 1st character of a code is a capital letter which defines the book category.
//
//In the bookseller's stocklist each code is followed by a space and by a positive integer, which indicates the quantity of books of this code in stock.
//
//Task
//You will receive the bookseller's stocklist and a list of categories. Your task is to find the total number of books in the bookseller's stocklist, with the category codes in the list of categories. Note: the codes are in the same order in both lists.
//
//Return the result as a string described in the example below, or as a list of pairs (Haskell/Clojure/Racket/Prolog).
//
//If any of the input lists is empty, return an empty string, or an empty array/list (Clojure/Racket/Prolog).
//
//Example
//# the bookseller's stocklist:
//"ABART 20", "CDXEF 50", "BKWRK 25", "BTSQZ 89", "DRTYM 60"
//
//# list of categories:
//"A", "B", "C", "W"
//
//# result:
//"(A : 20) - (B : 114) - (C : 50) - (W : 0)"
//Explanation:
//
//category A: 20 books (ABART)
//category B: 114 books = 25 (BKWRK) + 89 (BTSQZ)
//category C: 50 books (CDXEF)
//category W: 0 books

import java.util.HashMap;
import java.util.Map;

public class StockList {

    // 1st parameter is the stocklist (L in example),
    // 2nd parameter is list of categories (M in example)

    public static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {

        if(lstOfArt.length == 0 || lstOf1stLetter.length == 0)
            return "";

        //Map to hold totals per category (A,B,C...)
        Map<String, Integer> totals = new HashMap<>();

        // Loop over all articles
        for(String art : lstOfArt){

            String[] parts = art.split(" ");
            String category = parts[0].substring(0,1); //first letter
            int quantity = Integer.parseInt(parts[1]);

            totals.put(category, totals.getOrDefault(category, 0) + quantity);

        }

        // Build result string
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < lstOf1stLetter.length; i++){

            String cat = lstOf1stLetter[i];
            int sum = totals.getOrDefault(cat, 0);
            result.append("(").append(cat).append(" : ").append(sum).append(")");
            if (i < lstOf1stLetter.length - 1) result.append(" - ");

        }

        return result.toString();
    }
}
