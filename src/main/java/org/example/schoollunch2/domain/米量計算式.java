package org.example.schoollunch2.domain;

import org.springframework.stereotype.Component;

@Component
public class 米量計算式 {
    public お米の量 計算する(人数 人数) {
        int 米量;
        米量 = 人数.get人数() * 75;
        return new お米の量(米量);
    }
}
