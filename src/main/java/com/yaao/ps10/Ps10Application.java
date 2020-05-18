package com.yaao.ps10;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan(value ={"com.yaao.ps10.*.mapper","com.yaao.ps10.*.mapper.*"})
@ComponentScan(value = "com.yaao.ps10.*")
@EnableScheduling
public class Ps10Application {

    public static void main(String[] args) {
        SpringApplication.run(Ps10Application.class, args);
    }

}
