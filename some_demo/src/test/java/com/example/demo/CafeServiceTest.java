package com.example.demo;

import com.example.demo.bussineslayer.mypizzeria.CafeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class CafeServiceTest {
    private final CafeService cafeService;
    private final ApplicationContext applicationContext;
    @Autowired
    public CafeServiceTest(CafeService cafeService, ApplicationContext applicationContext) {
        this.cafeService = cafeService;
        this.applicationContext = applicationContext;
    }

    @Test
    void orderFood(){
        System.out.println("CafeService context hash code: " +
                System.identityHashCode(applicationContext));
        assertThat(cafeService.orderFood("apple pie")).isNotNull();
    }
}
