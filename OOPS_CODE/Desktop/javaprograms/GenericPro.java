class xyz<T> {
    T a;

    xyz(T b) {
        a = b;
    }

    void display(T a) {
        System.out.println("" + a);
    }
}

public class GenericPro {
    public static void main(String[] args) {
        xyz<Integer> obj = new xyz<Integer>(30);
        obj.display(50);
    }
}
