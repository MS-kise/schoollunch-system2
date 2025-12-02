package org.example.schoollunch2.domain;

import org.springframework.stereotype.Component;

@Component
public class 洗米時間計算式 {
    public 洗米時間 計算する(お米の量 お米の量, 今の水温 今の水温) {
        double 洗米時間;
        洗米時間 = お米の量.getお米の量() * 0.003 *8 / 今の水温.get今の水温();
        return new 洗米時間(洗米時間);
    }
}
