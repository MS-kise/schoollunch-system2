package org.example.schoollunch2;

import org.example.schoollunch2.domain.人数;
import org.example.schoollunch2.domain.今の水温;
import org.example.schoollunch2.usecase.人数分の炊飯をする;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Schoollunch2Application {

    public static void main(String[] args) {
        var context = SpringApplication.run(Schoollunch2Application.class, args);
        var 人数分の炊飯をする = context.getBean(org.example.schoollunch2.usecase.人数分の炊飯をする.class);
        人数分の炊飯をする.実行する(new 人数(), new 今の水温());
    }

}
