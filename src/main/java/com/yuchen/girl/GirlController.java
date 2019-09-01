package com.yuchen.girl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GirlController {

    @Autowired
    private GirlRepository girlRepository;

    @Autowired
    private GirlService girlService;

    /***
     * 获取所有信息
     * @return
     */
    @GetMapping(value = "/girls")
    public List<Girl> girsList(){
        return girlRepository.findAll();
    }

    /***
     * 添加Girl
     * @param name
     * @param age
     * @return
     */
    @PostMapping(value = "/girls")
    public Girl girlAdd(@RequestParam("name") String name,@RequestParam("age") Integer age){
        Girl girl = new Girl();
        girl.setName(name);
        girl.setAge(age);
        return girlRepository.save(girl);
    }

    /***
     * 根据id查询
     * @param id
     * @return
     */
    @GetMapping(value = "/girls/{id}")
    public Girl girlFindOne(@PathVariable("id") Integer id){
        return girlRepository.findById(id).orElse(null);
    }

    /***
     * 根据id修改对象
     * @param id
     * @param name
     * @param age
     * @return
     */
    @PutMapping(value = "/girls/{id}")
    public Girl girlUpdate(@PathVariable("id") Integer id,@RequestParam("name") String name,@RequestParam("age") Integer age){
        Girl girl = new Girl();
        girl.setId(id);
        girl.setName(name);
        girl.setAge(age);
        return girlRepository.save(girl);
    }

    /***
     * 根据id删除
     * @param id
     */
    @DeleteMapping(value = "/girls/{id}")
    public void girlDelete(@PathVariable("id") Integer id){
        girlRepository.deleteById(id);
    }

    /***
     * 根据年龄查询
     * @param age
     * @return
     */
    @GetMapping(value = "/girls/age/{age}")
    public List<Girl> girlFindByAge(@PathVariable("age") Integer age){
        return girlRepository.findByAge(age);
    }

    @PostMapping(value = "/girls/two")
    public void addTwo(){
        girlService.addTwo();
    }
}
