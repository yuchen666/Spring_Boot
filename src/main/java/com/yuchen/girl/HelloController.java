package com.yuchen.girl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import sun.misc.Contended;

@RestController
public class HelloController {

    @Autowired
    private GirlProperties girlProperties;

    /*@Value("${name}")
    private String name;

    @Value("${age}")
    private Integer age;*/

    /*@Value("${content}")
    private String content;*/

    /***
     * 后面的id与@PathVariable种的参数是对应的
     */
    /*@RequestMapping(value = "/hello/{id}", method = RequestMethod.GET)
    public String sayHello(@PathVariable("id") Integer id) {
        *//*return name + age ;*//*
        return "id = " + id;
    }
    @RequestMapping(value = "/{id}/hello", method = RequestMethod.GET)
    public String sayHello(@PathVariable("id") Integer id) {
        *//*return name + age ;*//*
        return "id = " + id;
    }*/

    /***
     * @RequestParam中的参数与后面的id不用对应的，@RequestParam中的参数等同于url中的id
     * @param id
     * @return
     */
    /*@RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String sayHello(@RequestParam("id") Integer id) {
        return "id = " + id;
    }*/

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String sayHello(@RequestParam(value = "id" ,required = false, defaultValue = "0") Integer id) {
        return "id = " + id;
    }

}
