package com.yuchen.girl;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/***
 * 加@Entity表示对应数据库的一个表
 */
@Entity
public class Girl {
    /***
     * ID一般都是自增的，可以用@GeneratedValue注解
     */
    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private Integer age;

    public Girl() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
