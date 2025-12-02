package org.example.schoollunch2.domain;

import org.springframework.stereotype.Component;

@Component
public class 研ぐ人数計算式 {
    public お米を研ぐ人数 計算する(お米の量 お米の量, 洗米時間 洗米時間, 炊飯時間 炊飯時間) {
        int お米を研ぐ人数 = (int) Math.ceil(お米の量.getお米の量() / (18 * (180 - 洗米時間.get洗米時間() - 炊飯時間.get炊飯時間())));
        return new お米を研ぐ人数(お米を研ぐ人数);
    }
}
