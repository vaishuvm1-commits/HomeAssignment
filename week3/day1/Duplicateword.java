package week3.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class Duplicateword {
	
    public static void main(String[] args) {
        String text = "learn java java java";
        String[] words = text.split("\\s+");
        
        Set<String> uniqueWords = new LinkedHashSet<>();
        for (String word : words) {
            uniqueWords.add(word);
        }
        StringBuilder sb = new  StringBuilder() ;
        for(String s: uniqueWords)
        {
        	sb.append(s).append(" ");
        }
        System.out.println(sb.toString());
    }

}