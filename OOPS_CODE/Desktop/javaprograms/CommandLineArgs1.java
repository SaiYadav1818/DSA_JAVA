public class CommandLineArgs1 {
    public static void main(String[] args) {
        if(args.length>0)
        {
            System.out.println("command line arguments are:");
            for(String val : args)
            {
                System.out.println(val);
            }
        }
    else
    {
        System.out.println("not found command line arguments");
    }
    }
}
