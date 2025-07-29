class GF {
    int age=100;
    void GFage(){
System.out.println("the age of grandfather age"+age);
    }
}
class Father extends GF {
    int fage=50;
    void fatherage(){
        int add=age+fage;
System.out.println("the addtion of  grandfather  and father age"+add);
    }
}
class Son extends Father {
    int sage=20;
    void sonage(){
        int add1=age+fage+sage;
System.out.println("the addtion of  grandfather  ,son and father age"+add1);
    }
}
class MULTIinheritance {
    public static void main(String ars[])
    {
        Son obj = new Son();
        obj.sonage();
        obj.fatherage();
   // Father obj1 = new Father();
    obj.GFage();
    }
}