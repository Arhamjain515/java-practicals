
import java.util.*;

class Box<T> {
    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public void display() {
        System.out.println("Key: " + key + ", Value: " + value);
    }
}

class GenericDemo {

    // Generic method
    public static <T> void display(T data) {
        System.out.println("Value: " + data);
    }

    // Bounded type parameter
    public static <T extends Number> double square(T num) {
        return num.doubleValue() * num.doubleValue();
    }

    // Wildcard: ? extends Number
    public static double sum(List<? extends Number> list) {
        double total = 0;

        for (Number n : list) {
            total += n.doubleValue();
        }

        return total;
    }

    // Wildcard: ? super Integer
    public static void addNumbers(List<? super Integer> list) {
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("List after adding integers: " + list);
    }
}

public class Main {
    public static void main(String[] args) {

        // Generic Box class
        Box<Integer> b1 = new Box<>();
        b1.setValue(100);
        System.out.println("Integer Box: " + b1.getValue());

        Box<String> b2 = new Box<>();
        b2.setValue("Hello Java");
        System.out.println("String Box: " + b2.getValue());

        // Generic Pair class
        Pair<Integer, String> p1 =
            new Pair<>(1, "Aditya");
        p1.display();

        // Generic method with different data types
        GenericDemo.display(100);
        GenericDemo.display("Java Generics");
        GenericDemo.display(25.5);

        // Bounded type parameter
        System.out.println("Square of 5: " +
            GenericDemo.square(5));
        System.out.println("Square of 2.5: " +
            GenericDemo.square(2.5));

        // ? extends Number wildcard
        List<Integer> numbers = Arrays.asList(10, 20, 30);
        System.out.println("Sum of integers: " +
            GenericDemo.sum(numbers));

        List<Double> decimals = Arrays.asList(1.5, 2.5, 3.5);
        System.out.println("Sum of doubles: " +
            GenericDemo.sum(decimals));

        // ? super Integer wildcard
        List<Number> numberList = new ArrayList<>();
        GenericDemo.addNumbers(numberList);

        List<Object> objectList = new ArrayList<>();
        GenericDemo.addNumbers(objectList);
    }
}
