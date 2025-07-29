
        class a {
            void m1()
            {
              System.out.println("this is method m1");  
            }
            void m2()
            {
                this.m1();
            }
        }
     class thiskeyword {
            public static void main(String[] args) {
                a obj =new a();
                obj.m2();
    }
    
}
