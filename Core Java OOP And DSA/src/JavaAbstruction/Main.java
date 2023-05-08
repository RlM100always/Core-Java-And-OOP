package JavaAbstruction;


abstract class Animal{
    public static final int val=10 ;
    public abstract void f1();
    public abstract void f2();
    public  void m1()
    {
        System.out.println("M1 method from abstract class with body part");
    }
}

class Dog extends Animal{
    @Override
    public void f1() {
        System.out.println("Abstract method from abstract Animal class ");
    }

    @Override
    public void f2() {

    }
}



public class Main {
    public static void main(String[] args) {
      var obj = new Dog();
      obj.f1();
      obj.m1();
      System.out.println(Animal.val);
    }
}
