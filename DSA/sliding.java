import java.util.Scanner;

public class sliding {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();
        int[] count=new int[128];
        for(char c:str2.toCharArray()){
            count[c]++;
        }
        int l=str2.length(),h=str1.length();
        String ans="-1";
while(l<=h){
    int m=l+(h-l)/2;
    StringBuilder sb=new StringBuilder();
    if(check(m,sb,str1,str2,count)){
        System.out.println(sb.toString());
        ans=sb.toString();
    h=m-1;    
    }
    else{
        l=m+1;
    }
}
System.out.println(ans);
    }
    public  static boolean check(int x,StringBuilder sb,String str1,String str2,int[] count){
        for(int i=0;i<=str1.length()-x;i++){
String s=str1.substring(i,i+x);
int[] win=new int[128];
for(char c:s.toCharArray()){
win[c]++;
}
boolean f=true;
for(int j=0;j<128;j++){
if(win[j]<count[j]){
f=false;
break;
}
}
if(f){
    sb.setLength(0); 
    sb.append(s);
    return true;
}
        }
        return false;
    }
}