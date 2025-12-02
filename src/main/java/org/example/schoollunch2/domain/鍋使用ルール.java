package org.example.schoollunch2.domain;

import org.springframework.stereotype.Component;

@Component
public class 鍋使用ルール {
    public 使う鍋 判断する(お米の量 お米の量) {
        String 鍋 = null;
        if(お米の量.getお米の量() < 7500){
            鍋 = "小さい鍋";
        }else if (お米の量.getお米の量() < 9400){
            鍋 = "浅い鍋";
        }else if (お米の量.getお米の量() < 11500){
            鍋 = "深い鍋";
        }else {
            鍋 = "特大の鍋";
        }
        return new 使う鍋(鍋);
    }
}
