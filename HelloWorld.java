import java.util.Scanner;
public class HelloWorld {

    public class NestedClass {
        int number(int input) {
            int a = 10;
            int sum = a + input;
            return (sum);
        }
    }

    public static void main(String []args) {
        HelloWorld helloWorld = new HelloWorld();
        HelloWorld.NestedClass nestedClass = helloWorld.new NestedClass();
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int result = nestedClass.number(input);
        System.out.println(result);
    }
}

// learnt taking input from terminal
// accessed a function from nested class by creating an instance of its object
// to run java code -> open terminal, open the java directory using ls, cd {foldername}, code {filename}.java, compile using "javac {name}.java", run "java {name}"