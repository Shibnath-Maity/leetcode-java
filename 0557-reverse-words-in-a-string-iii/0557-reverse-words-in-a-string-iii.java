class Solution {
    public String reverseWords(String s) {
String[] words = s.trim().split("\\s+");
     StringBuilder ans= new StringBuilder();
    

        for( int i=0;i<=words.length-1;i++){
       ans.append(new StringBuilder(words[i]).reverse());
           if (i < words.length-1) {
                ans.append(" ");
            }

        }return ans.toString();


        
    }
}