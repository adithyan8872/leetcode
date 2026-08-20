class Solution {
    public boolean isPalindrome(int x) {
        int temp=x,sum=0;
        if(x==0) return true;
        else if(x<1) return false;
        while(x!=0){
            int rem=x%10;
            x=x/10;
            sum=(sum*10)+rem;
        }
        if(sum==temp) return true;
        else return false;
    }
}