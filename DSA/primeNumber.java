import java.util.*;
public class primeNumber {
    public static void main(String ad[]){
        boolean[] prime=new boolean[1000];
        Arrays.fill(prime,true);
        prime[0]=false;
        prime[1]=false;
for(int i=2;i*i<1000;i++){
    if(prime[i]){
        for(int j=i*i;j<1000;j+=i){
prime[j]=false;
        }
    }
}
for(int i=2;i<10;i++){
    if(prime[i]){
        System.out.println(i+" is a prime number");
    }
}
    }
}
