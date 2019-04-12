import org.junit.Assert;
import org.junit.Test;

public class DCP3Test {

    @Test
    public void deserializeSucess(){

        DCP3.Node node = new DCP3.Node("root",
                new DCP3.Node("left",
                        new DCP3.Node("left.left"), null),
                        new DCP3.Node("right"));

        System.out.println(DCP3.serialize(node));

        Assert.assertEquals("left.left",DCP3.deserialize(DCP3.serialize(node)).left.left.val);
    }
}
