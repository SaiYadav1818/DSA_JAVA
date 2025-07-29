public class RegexReplace {
    public static void main(String[] args) {
        String str="sai18hruday";
        String replaced = str.replaceFirst("\\d+", "-");
    String str1=str.replaceAll("\\d+", " and ");
    System.out.println(str1);
    System.out.println(replaced);
    }
}
