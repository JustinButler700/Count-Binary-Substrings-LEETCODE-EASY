//Justin Butler
//11/21/2021

class Solution {
    public int countBinarySubstrings(String s) {
        int count = 0, i = 1, prev = 0, curr = 1;
        while(i < s.length())
        {
            //when the characters no longer match, the minimum between the two groupings is our # of substrings.
            if(s.charAt(i-1) !=s.charAt(i))
            {
                count += Math.min(prev,curr);
                prev = curr;
                curr = 1;
            }
            //When we have matching characters, we count the frequency of their groupings
            else
            {
                curr++;
            }
            i++;
        }
        //This last Math.min function covers the last iteration of the loop when i = s.length()
        return count+=Math.min(prev,curr);
        
    }
}
