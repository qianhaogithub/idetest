package cn.edu.whpu.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qianhao
 * @create 2020/5/4-19:51
 */
@RestController
public class TestController {

    @RequestMapping("/hello")
    public String testHelloWorld() {
        return "Hello World1!";
    }
}
