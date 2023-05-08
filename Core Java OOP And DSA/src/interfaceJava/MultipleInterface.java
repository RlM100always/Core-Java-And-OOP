package interfaceJava;


interface FirstInterface {
    public void myMethod(); // interface method
}

interface SecondInterface {
    public void myOtherMethod(); // interface method
}

class DemoClass implements FirstInterface, SecondInterface {
    public void myMethod() {
        System.out.println("Some text.. my Method");
    }
    public void myOtherMethod() {
        System.out.println("Some other text... My Other Method");
    }
}


public class MultipleInterface {
    public static void main(String[] args) {
        var obj = new DemoClass();
        obj.myMethod();
        obj.myOtherMethod();
    }
}
