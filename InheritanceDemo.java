// Single Inheritance
class Parent {
    void show() { System.out.println("Parent class"); }
}

class Child extends Parent {
    void display() { System.out.println("Child class"); }
}

// Multilevel Inheritance (instead of multiple)
class GrandParent {
    void greet() { System.out.println("GrandParent class"); }
}

class ParentM extends GrandParent {
    void parentMsg() { System.out.println("ParentM class"); }
}

class ChildM extends ParentM {
    void childMsg() { System.out.println("ChildM class"); }
}

// Hierarchical Inheritance
class ParentH {
    void hi() { System.out.println("Hierarchical Parent"); }
}

class Child1 extends ParentH {
    void one() { System.out.println("Child1"); }
}

class Child2 extends ParentH {
    void two() { System.out.println("Child2"); }
}

// Main class
public class InheritanceDemo {
    public static void main(String[] args) {
        System.out.println("=== Single Inheritance ===");
        Child c = new Child();
        c.show();
        c.display();

        System.out.println("\n=== Multilevel Inheritance ===");
        ChildM cm = new ChildM();
        cm.greet();
        cm.parentMsg();
        cm.childMsg();

        System.out.println("\n=== Hierarchical Inheritance ===");
        Child1 ch1 = new Child1();
        Child2 ch2 = new Child2();
        ch1.hi(); ch1.one();
        ch2.hi(); ch2.two();
    }
}
