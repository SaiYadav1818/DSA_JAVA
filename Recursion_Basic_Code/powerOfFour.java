class powerOfFour {
    public boolean isPowerOfFour(int n) {
        int num=1;
       return isPower(n,num);
    }
    public static boolean  isPower(int n,int num){
        if(num==n){
            return true;
        }
        if(num>n){
            return false;
        }
        return isPower(n,num*4);
    }
}