class Solution {
    public boolean isPalindrome(int x) {
        StringBuffer kris = new StringBuffer("");
        kris.append(x);
        kris.reverse();
       if (kris.toString().equals(String.valueOf(x)))
        return true;
        else 
        return false;
    
    }
  
}