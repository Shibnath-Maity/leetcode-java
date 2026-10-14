class Solution {
    public List<List<String>> partition(String s) {
        List<String>list=new ArrayList<>();
        List<List<String>>res=new ArrayList<>();
        fun(s,0,list,res);
         return res;
        
    }

    void fun(String s,int idx,List<String>list,List<List<String>>res){
        if(idx==s.length()){
            res.add(new ArrayList<>(list));
            return;}
            for(int i=idx;i<s.length();i++){
                String sub=s.substring(idx,i+1);
            
            if(isPalindrome(sub)){
                list.add(sub);
                fun(s,i+1,list,res);
                list.remove(list.size()-1);
            }
            }
        
    }
    boolean isPalindrome(String s){
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if(s.charAt(right) != s.charAt(left)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}