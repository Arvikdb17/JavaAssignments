package ExceptionalHandling;

public class ArrayIndexOutOfBoundException {
    public static void main(String[] args) {
        System.out.println(args[10]);
        // args maximum size if 0 , if we access beyond that ArrayIndexOutOfBoundsException will throw by the JVM
    }

}
