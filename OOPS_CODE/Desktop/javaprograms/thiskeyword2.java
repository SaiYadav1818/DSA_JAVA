class Circle
{
    String str;
    String n;
    float f;
    Circle(String str){
this.str=str;
}
Circle(float f)
{
    this.f=f;
}
Circle()
{
    this.str="sai";
    /*this("sai");*/
}
/*
 * 
 void m1()
 {
    System.out,print(str);
 }
 */
float m1()
{return f;
   
}}
 class thiskeyword2 {
    public static void main(String[] args) {
        Circle obj = new Circle(2);
        obj.m1();
    }
}
