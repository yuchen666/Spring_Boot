package com.yuchen.girl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

@Service
public class GirlService {
    @Autowired
    private GirlRepository girlRepository;

    @Transactional
    public void addTwo(){
        Girl girl = new Girl();

        girl.setAge(10);
        girl.setName("b");
        girlRepository.save(girl);

        Girl girl1 = new Girl();
        girl1.setAge(20);
        girl1.setName("bbb");
        girlRepository.save(girl1);


    }
}
