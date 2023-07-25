import org.example.util.StringUtil;
import org.junit.Assert;
import org.junit.Test;

public class StringUtilTest {

    @Test
    public void testRepeat(){
        String result = StringUtil.repeat("hola", 3);
        Assert.assertEquals( "holaholahola", result);
    }
    }



