class Solution {
    Map<Character,String>mp= new HashMap<>();
    public List<String> letterCombinations(String digits) {
        mp.put('2',"abc");
        mp.put('3',"def");
        mp.put('4',"ghi");
        mp.put('5',"jkl");
        mp.put('6',"mno");
        mp.put('7',"pqrs");
        mp.put('8',"tuv");
        mp.put('9',"wxyz");
List<String> res= new ArrayList<>();
if(digits.length()==0){
    return res;
}
StringBuilder diary=new StringBuilder();
fun(digits,0,diary,res);
return res;

    }
    void fun(String s,int idx,StringBuilder diary,List<String>res){
        if(idx==s.length()){
            res.add(diary.toString());
            return;
        }
        String choice= mp.get(s.charAt(idx));
        for(int j=0;j<choice.length();j++){
            diary.append(choice.charAt(j));
            fun(s,idx+1,diary,res);
            diary.deleteCharAt(diary.length()-1);
        }
    }


  
    
}