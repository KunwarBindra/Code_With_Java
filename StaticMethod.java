/* Static Method can be accessed without creating instance of class */
public class StaticMethod {

    public static class NestedClass {
        static int numberFunc() {
            return 20;
        }
    }

    public static void main(String []args) {
        int result;
        result = NestedClass.numberFunc(); 
        System.out.println(result);
    }
}

// In Java, inner (nested) classes that are not declared as static cannot have static methods or fields themselves. 
// The error you're encountering is because you're trying to declare a static method (numberFunc) inside a non-static inner class (NestedClass).
// To resolve this issue, declare NestedClass as a Static Nested Class