
        class mc{
            int x;
        public  mc set(int x) ///return type is class nama and it store the instance varabile
            {
                this.x=x;
                return this;
            }
            public void display()
            {
                System.out.println(x);
            }
        }
        public class thisMethodChainingReturnCurrentObj {
            public static void main(String[] args) {
                mc obj=new mc();
                obj.set(20).display();
    }
}
