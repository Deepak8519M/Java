//FUNCTIONAL  INTERFACE
@FunctionalInterface
interface Demo {
    void a();

}

class B implements Demo {

    public void a() {
        System.out.println("In Show method");
    }
}

public class Udemy {
    public static void main(String args[]) {
        B obj = new B();
        obj.a();
    }
}