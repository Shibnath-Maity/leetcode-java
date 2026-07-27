class Solution {
    public String removeDuplicates(String s) {
        int n =s.length();
        Stack<Character> str= new Stack();
        int i;

        for(i=0;i<=n-1;i++){
            if(str.empty()){
                str.push(s.charAt(i));
                continue;
            }if(str.peek()==s.charAt(i)){
                str.pop();
                continue;
            }str.push(s.charAt(i));
        } StringBuilder res =new StringBuilder();
        while(! str.empty()){
           res.append(str.pop());
        }return res.reverse().toString();
    }
}