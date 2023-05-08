import wrapperClass.*;

public class TestGarbage1 {
    public void finalize()
    {
        System.out.println("object is garbage collected");
    }
    public static void main(String args[])
    {
        TestGarbage1 s1=new TestGarbage1();
        TestGarbage1 s2=new TestGarbage1();
        s1=null;
        s2=null;
        System.gc();
    }
}

//Note: Garbage collection is performed by a daemon thread called Garbage Collector(GC).
// This thread calls the finalize() method before object is garbage collected.
