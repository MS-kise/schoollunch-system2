package org.example.schoollunch2.domain;

import org.springframework.stereotype.Component;

@Component
public class 注水量計算式 {
    public 注水量 比例計算する(お米の量 お米の量) {
        int 水量;
        水量 = お米の量.getお米の量() * 100;
        return new 注水量(水量);
    }
}
