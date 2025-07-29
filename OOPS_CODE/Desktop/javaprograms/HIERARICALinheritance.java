class animal {
void wild()
{
    System.out.println("wild animals are");
}
}
class lion extends animal {
    void king()
    {
        System.out.println("raja of the forest");
    } 
}
class cheetha extends animal {
    void hungrycheetha()
    {
        System.out.println("hungry cheetha is fastest runner animal in the forest");
    } 
}
class elephant extends animal {
    void stronger(){
        System.out.println("elephant is the strongest animal  in the forest");
    }
}
class chotalion extends lion {
    void chotashare()
    {  
 System.out.println("chota lion is the one of the gretest sons   in the forest");
    }
}
class HIERARICALinheritance {
    public static void main(String args[]){
        lion obj = new lion();
        obj.king();
        obj.wild();
        cheetha obj1 = new cheetha();
obj1.hungrycheetha();
  chotalion obj2 = new chotalion();
  obj2.chotashare();
  obj2.king(); 
  obj2.wild();   
    }
}