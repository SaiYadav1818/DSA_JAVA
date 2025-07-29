public class Printf {
    public static void main(String[] args) {
        int x=100;
        System.out.printf("the number is %d\n",x);
        System.out.printf("%23d\n",x);
        float f=304;
        float t=304.4f;
        System.out.printf(" ff  %.2f\n",t);
        System.out.printf("%.2f\n",f);
        System.out.printf("%.4f\n",f);
        System.out.printf("%10.4f\n",f);
        System.out.printf("%20.4f\n",Math.PI);
    }
    
}
