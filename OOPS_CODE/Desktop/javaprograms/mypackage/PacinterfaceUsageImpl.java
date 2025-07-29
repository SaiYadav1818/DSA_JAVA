package mypackage;
import Myinterace.interfaceUsage;
 class PacinterfaceUsageImpl {
        public static void main(String[] args) {
            PacinterfaceUsage obj = new PacinterfaceUsage();
            int result = obj.ask();
    
            switch (result) {
                case interfaceUsage.NO:
                    System.out.println("No");
                    break;
                case interfaceUsage.YES:
                    System.out.println("Yes");
                    break;
                case interfaceUsage.MAYBE:
                    System.out.println("Maybe");
                    break;
                case interfaceUsage.LATER:
                    System.out.println("Later");
                    break;
                case interfaceUsage.SOON:
                    System.out.println("Soon");
                    break;
                case interfaceUsage.NEVER:
                    System.out.println("Never");
                    break;
                default:
                    System.out.println("Unknown");
                    break;
            }
        }
    
}
