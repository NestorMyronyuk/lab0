import org.testng.annotations.Test;

import java.awt.*;

import static org.testng.Assert.*;

public class SomeMethodsTest {
    SomeMethods methods = new SomeMethods();

    @Test
    public void testMyIntegerTask() {
        assertEquals(methods.MyIntegerTask(3,2),1);
    }

    @Test
    public void testMyBoolean() {
        assertEquals(methods.MyBoolean(1,2),false);
    }

    @Test
    public void testMyIf() {
        assertEquals(methods.MyIf(1,2,-1),new Point(2,1));
    }

    @Test
    public void testMyCase() {
        assertEquals(methods.MyCase(1,2,1),3);
    }

    @Test
    public void testMyFor() {
        assertEquals(methods.MyFor(1),"0.1 0.2 0.3 0.4 0.5 0.6 0.7 0.8 0.9 ");
    }

    @Test
    public void testMyWhile() {
        assertEquals(methods.MyWhile(2),1);
    }

    @Test
    public void testMyMinMax() {
        float[][] mas = new float[][]{
                {1,2},{3,4},{5,6},{0,0}
        };
        assertEquals(methods.MyMinMax(mas),"0.8333333;2");
    }

    @Test
    public void testMyArray() {
        assertEquals(methods.MyArray(5), new int[]{1, 2, 3, 5, 8});
    }

    @Test
    public void testMyMatrix() {
        assertEquals(methods.MyMatrix(2,2,3f,new float[]{5,6}),new float[][]{{5.0f, 6.0f}, {8.0f, 9.0f}});
    }
}