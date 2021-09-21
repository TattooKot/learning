package main.java.com.tattookot.javacore.chapter13;

class A {
    int i,j;
}

class B {
    int i,j;
}

class C extends A {
    int k;
}

class D extends A {
    int k;
}

public class InstanceOf {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        
        if(a instanceof A) System.out.println("a is A type object");
        if(b instanceof B) System.out.println("b is B type object");
        if(c instanceof C) System.out.println("c is C type object");

        if(c instanceof A) System.out.println("c can be A type element");
        if(a instanceof C) System.out.println("a can be C type element");
        System.out.println();

        A ob;

        ob = d;
        System.out.println("Now 'ob' have link to 'd' element");

        if(ob instanceof D) System.out.println("ob is D type object");
        System.out.println();

        ob = c;
        System.out.println("Now 'ob' have link to 'c' element");

        if(ob instanceof D) System.out.println("ob can be D type object");
        else System.out.println("ob can`t be D type object");

        if(ob instanceof A) System.out.println("ob can be A type object");
        System.out.println();

        if(a instanceof Object) System.out.println("a can be Object type element");
        if(b instanceof Object) System.out.println("b can be Object type element");
        if(c instanceof Object) System.out.println("c can be Object type element");
        if(d instanceof Object) System.out.println("d can be Object type element");
    }
}
