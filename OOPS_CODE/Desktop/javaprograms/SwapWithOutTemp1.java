class SwapWithOutTemp1 {
public static void main(String[] args) {
int a=110,b=90;
/*a=a+b;
b=a-b;
a=a-b;*//* 
a=a*b;
b=a/b;
a=a/b;*/
a=a^b;
b=a^b;
a=a^b;
System.out.println(a+" "+b);
}    
}
