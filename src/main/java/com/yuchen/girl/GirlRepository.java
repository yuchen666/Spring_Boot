package com.yuchen.girl;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GirlRepository extends JpaRepository<Girl,Integer> {
    /***
     * 根据年龄查询
     * @param age
     * @return
     */
    public List<Girl> findByAge(Integer age);
}
