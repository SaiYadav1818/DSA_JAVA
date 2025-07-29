//multiple inheritance concept cannot work in class .we are using implement interface concept because of ambiguty
interface F {
    void athamma();
    void naynamma();
}
interface M {
    void pini();
    void amamma();
}
class S implements F, M {
    public void athamma(){
        System.out.println("athamma is  from father family");
    }
     public void naynamma(){
        System.out.println("naynamma is from father family");
    }
    public void pini(){
        System.out.println("pini is from mother family");
    }
 public void amamma(){
        System.out.println(" amamma is from mother family");
    }
}
class MULTIPLEinheritance {
    public static void main(String args[])
    {
S obj = new S();
obj.athamma();
obj.naynamma();
obj.pini();
M obj1;
obj1 = new S();
obj1.amamma();
    }
}