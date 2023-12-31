package cn.edu.csu.compkey;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
@MapperScan("cn.edu.csu.compkey.mapper")
public class CompKeyApplication {

    public static void main(String[] args) {
        SpringApplication.run(CompKeyApplication.class, args);
    }

}
