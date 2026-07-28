class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder n = new StringBuilder();
        for(char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
//System.out.print(Character.toLowerCase(c));

                n.append(Character.toLowerCase(c));
            }
        }
      //  System.out.print("\n"+n.toString() +"\nRevser : "+n.reverse().toString());
        return n.toString().equals(n.reverse().toString());
    }
}
