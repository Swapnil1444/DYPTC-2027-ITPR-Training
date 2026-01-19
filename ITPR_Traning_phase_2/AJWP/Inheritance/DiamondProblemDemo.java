package AJWP.Inheritance;
// Explain the diamond problem in inheritance and how Java resolves it using interfaces. Provide an example.?
interface A {
    default void show() {
        System.out.println("Show from A");
    }
}

interface B extends A {
    @Override
    default void show() {
        System.out.println("Show from B");
    }
}

interface C extends A {
    @Override
    default void show() {
        System.out.println("Show from C");
    }
}

class D implements B, C {
    // Must resolve ambiguity explicitly
    @Override
    public void show() {
        B.super.show(); // or C.super.show()
        System.out.println("Show resolved in D");
    }
}

public class DiamondProblemDemo {
    public static void main(String[] args) {
        D obj = new D();
        obj.show();
    }
}
