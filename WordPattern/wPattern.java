import java.util.HashMap;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<String,Integer> map2 = new HashMap<>();

        String[] words = s.split(" ");
        if(words.length != pattern.length()){
            return false;
        }

        for(int i = 0; i < pattern.length(); i++){
            char ch1 = pattern.charAt(i);
            String ch2 = words[i];
            if(!map1.containsKey(ch1)){
                map1.put(ch1, i);
            }
            if(!map2.containsKey(ch2)){
                map2.put(ch2, i);
            }

            if(!map1.get(ch1).equals(map2.get(ch2))){
                return false;
            }

        }
        return true;
    }
}


public class wPattern {
    public static void main(String[] args) {
        Solution solve = new Solution();

        System.out.println(solve.wordPattern("aabaa", "cat cat fish cat cat"));
    }

}
