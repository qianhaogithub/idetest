package com.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author qianhao
 * @create 2020/5/1-22:57
 */
@Controller
public class FltTestController {

    @RequestMapping("/other")
    public String toOther(Map<String,Object> map) {
        map.put("address","1");
        map.put("name","张三");
        List<String> listResult = new ArrayList<>();
        listResult.add("springboot");
        listResult.add("linux CentOs");
        listResult.add("spring Cloud");
        map.put("listResult",listResult);

        return "other";
    }
}
