import java.util.*;
// import javafx.util.Pair;
class Solution {
    public String removeDuplicates(String s, int k) {
     int n=s.length();
Stack<Pair<Character, Integer>> st = new Stack<>();
     for(int i=0;i<n;i++){
        char c=s.charAt(i);
        if(st.isEmpty() ||st.peek().getKey() !=c){
            st.push(new Pair<>(c,1));
            
        }else{
            Pair<Character,Integer> top =st.pop();
            int count = top.getValue()+1;
if(count <k ){
            st.push(new Pair<>(c,count));
        }
        }}
       
    
StringBuilder ans= new StringBuilder();
while(!st.isEmpty()){
    Pair<Character,Integer> top=st.pop();
    for(int i=0;i<top.getValue();i++){
        ans.append(top.getKey());
    }}
    return ans.reverse().toString();
}

}