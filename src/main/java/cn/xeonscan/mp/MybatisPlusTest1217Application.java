package cn.xeonscan.mp;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.xeonscan.mp.mapper")
public class MybatisPlusTest1217Application {
    public static void main(String[] args) {
        SpringApplication.run(MybatisPlusTest1217Application.class, args);
    }

}
