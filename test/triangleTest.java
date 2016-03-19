import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

import static org.junit.Assert.*;

/**
 * Created by gewen on 16/3/18.
 */
@RunWith(Parameterized.class)
public class triangleTest {
    private int expected;//期望
    private double valueOne;//测试数据1
    private double valueTwo;// 测试数据2
    private double valueThree;//测试数据3

    public triangleTest(int expected, double valueOne, double valueTwo,double valueThree) {
        super();
        this.expected = expected;
        this.valueOne = valueOne;
        this.valueTwo = valueTwo;
        this.valueThree = valueThree;
    }

    //初始化参数集合
    @Parameterized.Parameters
    public static Collection<Object[]> getTestParameters() {
        return Arrays.asList(new Object[][]{
                //1.等边
                // 2.等腰
                // 3.其他
                // 4.出错了
                {1,2.3,2.3,2.3},
                {2,1.0,1.0,1.5},
                {3,2,4.0,3.0},
                {-1,-1,-56,-1},
        });
    }

    @Test
    public void typeTest() {
        triangle t = new triangle();
        assertEquals(expected,t.type(valueOne, valueTwo, valueThree),0);
    }
}

