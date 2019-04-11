import org.junit.Assert;
import org.junit.Test;

public class DCP1EfficientTest {

    @Test
    public void Test1() {

        int[] numbers = {10,15,3,7};
        int k = 17;

        Assert.assertEquals(true,DCP1Efficient.solution(numbers,k));

    }

    @Test
    public void Test2() {

        int[] numbers = {3,10,5,3,2,7,13};
        int k = 9;

        Assert.assertEquals(true,DCP1Efficient.solution(numbers,k));

    }

    @Test
    public void Test3() {

        int[] numbers = {1,2,3};
        int k = 10;

        Assert.assertEquals(false,DCP1Efficient.solution(numbers,k));

    }

    @Test
    public void Test4() {

        int[] numbers = {};
        int k = 3;

        Assert.assertEquals(false,DCP1Efficient.solution(numbers,k));

    }

    @Test
    public void Test5() {

        int[] numbers = {-2,3,5,-1};
        int k = 4;

        Assert.assertEquals(true,DCP1Efficient.solution(numbers,k));

    }



}
