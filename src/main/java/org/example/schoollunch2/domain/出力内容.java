package org.example.schoollunch2.domain;

import java.util.Objects;

public class 出力内容 {
    private final お米の量 お米の量;
    private final 洗米時間 洗米時間;
    private final 注水量 注水量;
    private final 使う鍋 使う鍋;
    private final 炊飯時間 炊飯時間;
    private final お米を研ぐ人数 お米を研ぐ人数;

    public 出力内容(お米の量 お米の量, 洗米時間 洗米時間, 注水量 注水量, 使う鍋 使う鍋, 炊飯時間 炊飯時間, お米を研ぐ人数 お米を研ぐ人数) {
        this.お米の量 = お米の量;
        this.洗米時間 = 洗米時間;
        this.注水量 = 注水量;
        this.使う鍋 = 使う鍋;
        this.炊飯時間 = 炊飯時間;
        this.お米を研ぐ人数 = お米を研ぐ人数;
    }

    public お米の量 getお米の量() {
        return お米の量;
    }

    public 洗米時間 get洗米時間() {
        return 洗米時間;
    }

    public 注水量 get注水量() {
        return 注水量;
    }

    public 使う鍋 get使う鍋() {
        return 使う鍋;
    }

    public 炊飯時間 get炊飯時間() {
        return 炊飯時間;
    }

    public お米を研ぐ人数 getお米を研ぐ人数() {
        return お米を研ぐ人数;
    }
}
