import com.microsoft.demo.Demo;
import org.junit.Test;

public class MyTest {
    @Test
    public void test_method_1() {
        Demo d = new Demo();
        System.out.println("Well hello...");
        //Fail test worked
        //console.log("Well, this is the wrong language!")
        d.DoSomething(true);
        
    }

    @Test
    public void test_method_2() {
    }
}
