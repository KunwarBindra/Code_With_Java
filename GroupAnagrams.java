import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class GroupAnagrams {
    public static void groupAnagrams(String[] strs) {
        List<List<String>> anagramList = new ArrayList<>();
        List<String> sortedStringList = new ArrayList<>();
        boolean isVisited[] = new boolean[strs.length];
        for (int i = 0; i < strs.length; i++) {
            char arr[] = strs[i].toCharArray();
            Arrays.sort(arr);
            String sortedString = String.valueOf(arr);
            sortedStringList.add(sortedString);
        }
        for (int i=0; i<strs.length; i++) {
            List<String> currentList = new ArrayList<>();
            if (!isVisited[i]) {
                currentList.add(strs[i]);
            }
            for (int j=i+1; j<strs.length; j++) {
                if (sortedStringList.get(i).compareTo(sortedStringList.get(j)) == 0 && !isVisited[j]) {
                    currentList.add(strs[j]);
                    isVisited[j] = true;
                }
            }
            anagramList.add(currentList);
        }
        List<List<String>> updatedAnagramList = new ArrayList<>();
        for (int i=0; i<anagramList.size(); i++) {
            if (anagramList.get(i).size() > 0) {
                updatedAnagramList.add(anagramList.get(i));
            }
        }
    }
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        String strs[] = {"eat","tea","tan","ate","nat","bat"};
        groupAnagrams(strs);
    }
}
