
        class a{
            int x=9;
            int y=89;
            public void add(a obj)
            {
                x=obj.x+1;
                y=obj.y+1;
            }
        }
        public class PassByValue {
            public static void main(String[] args) {
            
                a obj =new a();
               
                System.out.println(obj.x+" "+obj.y);
                obj.add(obj);
                System.out.println(obj.x+" "+obj.y);

    }
}
