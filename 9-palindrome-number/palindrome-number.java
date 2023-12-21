class Solution {
    public boolean isPalindrome(int x) {
        StringBuilder kris = new StringBuilder();
        kris.append(x);
        kris.reverse();
       if (kris.toString().equals(String.valueOf(x)))
        return true;
        else 
        return false;
    
    }
  
}