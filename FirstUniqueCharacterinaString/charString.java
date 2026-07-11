import java.util.HashMap;

class Solution{
    public int solve(String s){
        HashMap<Character, Integer> map = new HashMap<>();
        char[] arr = s.toCharArray();
        for(char ch : arr){
            map.put(ch, map.getOrDefault(ch , 0)+1);
        }
        for(int i = 0; i < arr.length; i++){
            if(map.get(arr[i]) == 1){
                return i;
            }
        }
        
        return -1;
    }
}

public class charString {
    public static void main(String[] args) {
        
        Solution s = new Solution();
        System.out.println(s.solve("sanjana"));
    }
}
