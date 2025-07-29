public class TypeConversionOrWideningConversion{
    public static void main(String[] args) {
int a=10;

        float f;
      f=a;

        System.out.println(f);
    }
}
/*float is a 32-bit floating-point type, while double is a 64-bit floating-point type.
A double can represent all values of float without losing precision.
No explicit casting is required for this conversion.
widening conversion only works when converting from a smaller data type (like int) to a larger data type (like float).

However, converting from float to int is not allowed implicitly because it's a narrowing conversion—you 
are going from a larger, more precise 
type (float, which can hold decimals) to a smaller, less precise type (int, which only holds whole numbers).
*/