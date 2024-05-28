// Interface A
interface A {
    void methodA();
}

// Interface B
interface B {
    void methodB();
}

// Class C implementing interfaces A and B
class C implements A, B {
    public void methodA() {
        System.out.println("Method A implemented by class C");
    }

    public void methodB() {
        System.out.println("Method B implemented by class C");
    }
}

public class MultiPleInhritance {
    public static void main(String[] args) {
        C obj = new C();
        obj.methodA();
        obj.methodB();
    }
}
