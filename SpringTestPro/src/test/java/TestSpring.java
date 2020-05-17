import com.github.bean.Person;
import com.sun.org.apache.bcel.internal.generic.NEW;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author qianhao
 * @create 2020/5/1-13:17
 */
public class TestSpring {

    @Test
    public void testSpring1() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
        Person p = (Person) context.getBean("person");
        System.out.println(p);
    }

    public void testSpring2 () {

    }
}
