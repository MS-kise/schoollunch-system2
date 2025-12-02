package org.example.schoollunch2;

import org.example.schoollunch2.domain.人数;
import org.example.schoollunch2.domain.今の水温;
import org.example.schoollunch2.domain.出力内容;
import org.example.schoollunch2.usecase.人数分の炊飯をする;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Schoollunch2Application {

    public static void main(String[] args) {
        var context = SpringApplication.run(Schoollunch2Application.class, args);
        var 人数分の炊飯をする = context.getBean(org.example.schoollunch2.usecase.人数分の炊飯をする.class);
        出力内容 out = 人数分の炊飯をする.実行する(new 人数(10), new 今の水温(20));
        System.out.println("お米の量: " + out.お米の量().getお米の量() + "g");
        System.out.println("洗米時間: " + out.洗米時間().get洗米時間() + "分");
        System.out.println("注水量: " + out.注水量().get注水量() + "ml");
        System.out.println("使う鍋: " + out.使う鍋().get使う鍋());
        System.out.println("炊飯時間: " + out.炊飯時間().get炊飯時間() + "分");
    }

}
