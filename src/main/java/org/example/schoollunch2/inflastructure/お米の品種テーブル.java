package org.example.schoollunch2.inflastructure;

import org.example.schoollunch2.domain.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class お米の品種テーブル implements 品種に対応するお米の係数表 {

    private final List<RiceData> データベース = List.of(
            new RiceData("ななつぼし", 1.0f),
            new RiceData("コシヒカリ", 1.1f),
            new RiceData("ゆめぴりか", 0.85f),
            new RiceData("きらら３９７", 1.3f)
    );

    @Override
    public お米の係数 取得する(お米の品種 お米の品種) {
        for (var riceData : データベース) {
            if (お米の品種.getお米の品種().equals(riceData.name)) {
                return new お米の係数(riceData.coefficient);
            }
        }
        throw new IllegalArgumentException("Unknown rice: " + お米の品種.getお米の品種());
    }

    public record RiceData(String name, float coefficient) { }
}



//
//    @Override
//    public 炊飯時間 取得する(使う鍋 使う鍋) {
//        for (var potData : データベース) {
//            if (使う鍋.get使う鍋().equals(potData.name)) {
//                return new 炊飯時間(potData.timeMinutes);
//            }
//        }
//        throw new IllegalArgumentException("Unknown pot: " + 使う鍋.get使う鍋());
//    }
//}
