package org.example.schoollunch2.domain;

import org.springframework.stereotype.Component;

@Component
public class 米量計算式 {
    public お米の量 計算する(給食を食べる人数 給食を食べる人数) {
        int 米量;
        米量 = 給食を食べる人数.get人数() * 75;
        return new お米の量(米量);
    }
}
