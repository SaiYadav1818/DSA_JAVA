import java.util.*;
public class pattern {
    public static void main(String ad[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=n+n;
        int m=n/2;
        int odd=3;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=r;j++){
                if(j<n-i){
                    System.out.print(" ");
                }
                else if(j==n-i+1 || j==n+i-1){
                    System.out.print(i+" ");
                }
                else if(j==n){
                    System.out.print(odd+" ");
                    odd+=2;
                }
                else if(n-i+1<j && j<n+i+1){
                    if(j<=n){
                        System.out.print(i+j-(n-i+1)+" ");
                    }
                    else{
                        System.out.print((odd-2)-(j-n)+" ");
                    }
                }
            }
            System.out.println();
        }
    }
    
}
