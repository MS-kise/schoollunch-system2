package org.example.schoollunch2.inflastructure;

import org.example.schoollunch2.domain.使う鍋;
import org.example.schoollunch2.domain.使う鍋に対応する炊飯時間表;
import org.example.schoollunch2.domain.炊飯時間;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class 鍋テーブル implements 使う鍋に対応する炊飯時間表 {

    private final List<PotData> データベース = List.of(
            new PotData("小さい鍋", 25),
            new PotData("浅い鍋", 22),
            new PotData("深い鍋", 40),
            new PotData("特大の鍋", 20)
    );

    @Override
    public 炊飯時間 取得する(使う鍋 使う鍋) {
        for (var potData : データベース) {
            if (使う鍋.get使う鍋().equals(potData.name)) {
                return new 炊飯時間(potData.timeMinutes);
            }
        }
        throw new IllegalArgumentException("Unknown pot: " + 使う鍋.get使う鍋());
    }
    public record PotData(String name, int timeMinutes) { }
}