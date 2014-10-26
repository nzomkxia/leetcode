/**
 * Created by minxuan.zmx on 2014/10/21.
 */
public class Solution {
    public String countAndSay(int n) {
        String init = "1";
        for(int i=1; i<n; i++) {
           init = helper(init);
        }
        return init;

    }

    private String helper(String temp) {
        int size = temp.length();
        int count = 0;
        char letter = temp.charAt(0);
        int repeat = 1;
        StringBuilder sb = new StringBuilder();
        while(count < size-1) {
            if(temp.charAt(count+1) == letter) {
                count++;
                repeat++;
            }
            else {
                sb.append(repeat);
                sb.append(letter);
                letter = temp.charAt(count+1);
                repeat = 1;
                count++;
            }
        }
        sb.append(repeat);
        sb.append(letter);
        return sb.toString();
    }
}
