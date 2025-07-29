public class jump {
    public static void main(String[] args) {
      
        int[] arr={1, 4, 3, 2, 6, 7};
             // code here
      int c=-1;
      int jump=0;
      int i=0;
      boolean t=false;
      while(jump<arr.length && i<arr.length)
      {
          jump=arr[i];
          if(t){
          i+=jump+1;
           
          }
          else{
              i+=jump;
              t=true;
          }
          c++;
      }
       System.out.println(c);
    }

}
