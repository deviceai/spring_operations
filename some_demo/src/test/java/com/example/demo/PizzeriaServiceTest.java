package com.example.demo;

import com.example.demo.bussineslayer.mypizzeria.PizzeriaService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
public class PizzeriaServiceTest {
    private final PizzeriaService pizzeriaService;
    private final ApplicationContext applicationContext;

    @Autowired
    PizzeriaServiceTest(PizzeriaService pizzeriaService, ApplicationContext applicationContext) {
        this.pizzeriaService = pizzeriaService;
        this.applicationContext = applicationContext;
    }

    @Test
    void orderPizza() {
        System.out.println("PizzeriaService context hash code: " +
                System.identityHashCode(applicationContext));
        assertThat(pizzeriaService.orderPizza("pepperoni")).isNull();
    }
}
