package org.example.schoollunch2.infla;

import org.example.schoollunch2.domain.使う鍋;
import org.example.schoollunch2.domain.使う鍋に対応する炊飯時間表;
import org.example.schoollunch2.domain.炊飯時間;
import org.springframework.stereotype.Repository;

@Repository
public class 鍋テーブル implements 使う鍋に対応する炊飯時間表 {

    @Override
    public 炊飯時間 取得する(使う鍋 使う鍋) {
        return new 炊飯時間();
    }
}
