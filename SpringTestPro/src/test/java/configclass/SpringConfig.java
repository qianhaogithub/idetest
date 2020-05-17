package configclass;

import com.github.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author qianhao
 * @create 2020/5/1-13:19
 */
//配置类==配置文件
@Configuration  //告诉spring是一个配置类
@ComponentScan(value="com.github")
public class SpringConfig {

    @Bean(value = "perspon")
    public Person getPerson() {
        return new Person();
    }
}
