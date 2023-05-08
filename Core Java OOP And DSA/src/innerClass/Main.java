package innerClass;

class OuterClass {
    int x = 10;
    int c = 7 ;
    void m2() {
        System.out.println("m2 method Outer class ");
    }

    //mujahid
     class InnerClass {
       // c=78; not accessible

         void m1() {
            System.out.println("m1 method from inner class ");
            c=98;//accessible
             System.out.println("c = "+c);
        }
        int y = 5;
    }
}

public class Main {
    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.y);
       // System.out.println(myInner.x); not accessible
        myInner.m1();

    }
}
