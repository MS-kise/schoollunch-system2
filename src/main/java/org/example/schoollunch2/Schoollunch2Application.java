package org.example.schoollunch2;

import org.example.schoollunch2.domain.お米の品種;
import org.example.schoollunch2.domain.給食を食べる人数;
import org.example.schoollunch2.domain.今の水温;
import org.example.schoollunch2.domain.出力内容;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Schoollunch2Application {

    public static void main(String[] args) {
        var context = SpringApplication.run(Schoollunch2Application.class, args);
        var 人数分の炊飯をする = context.getBean(org.example.schoollunch2.usecase.人数分の炊飯をする.class);
        出力内容 out = 人数分の炊飯をする.実行する(new 給食を食べる人数(154), new 今の水温(10), new お米の品種("きらら３９７"));
        System.out.println("getお米の量: " + out.getお米の量().getお米の量() + "g");
        System.out.println("get洗米時間: " + out.get洗米時間().get洗米時間() + "分");
        System.out.println("get注水量: " + out.get注水量().get注水量() + "ml");
        System.out.println("get使う鍋: " + out.get使う鍋().get使う鍋());
        System.out.println("get炊飯時間: " + out.get炊飯時間().get炊飯時間() + "分");
        System.out.println("getお米を研ぐ人数: " + out.getお米を研ぐ人数().getお米を研ぐ人数() + "人");
    }

}
