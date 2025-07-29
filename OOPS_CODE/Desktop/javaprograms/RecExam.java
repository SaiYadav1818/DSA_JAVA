class a{
    int c(int count)
    {
        if(count==5)
        {
            return count;
        }
        else{
            return c(count+1);
        }
    }
}
class RecExam {
    public static void main(String[] args) {
        
    
    a obj =new a();
System.out.println(obj.c(0));

}}
