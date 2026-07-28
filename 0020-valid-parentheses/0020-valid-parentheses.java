class Solution {
    public boolean isValid(String s) {
   
    
     Stack<Character> str= new Stack<>();
     for(int i=0;i<=s.length()-1;i++){
        if(s.charAt(i)=='(' || s.charAt(i)=='{' ||s.charAt(i)== '['){
            str.push(s.charAt(i));

        }else{
            if(str.isEmpty()){
                return false;
            }
           else if( s.charAt(i)==')' && str.peek()=='('){
                str.pop();
            }
           else  if( s.charAt(i)==']' && str.peek()=='['){
                str.pop();
            }
           else if( s.charAt(i)=='}' && str.peek()=='{'){
                str.pop();
            }else {
    return false;
}
        }
     }if(! str.isEmpty()){
            return false;}
     return true;

        
    }
}