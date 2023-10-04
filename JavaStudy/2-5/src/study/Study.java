package study;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class Study {

    public static final String SHOP_SHOHIN_00 = "バナナ";
    public static final String SHOP_SHOHIN_01 = "牛乳";
    public static final String SHOP_SHOHIN_02 = "豚肉";
    public static final String SHOP_SHOHIN_03 = "コロッケ";

    public static void main(String args[]) {

        // ① 定数を全て使って、String型のListを記述してください。
        List<String> shohinList = new ArrayList<>();
        shohinList.add(SHOP_SHOHIN_00);
        shohinList.add(SHOP_SHOHIN_01);
        shohinList.add(SHOP_SHOHIN_02);
        shohinList.add(SHOP_SHOHIN_03);

        // ② 以下の「shopMap.put(shohinList.get(1), 180);」の処理について、コメントを記述してください。
        /*
         * 「shopMap.put(shohinList.get(1), 180);」は、
         * shohinListのインデックス1にある要素（この場合"牛乳"）をキーとして、
         * それに対応する値として180をshopMapに追加しています。
         */
        LinkedHashMap<String, Integer> shopMap = new LinkedHashMap<String, Integer>();
        shopMap.put(shohinList.get(0), 125);
        shopMap.put(shohinList.get(1), 180);
        shopMap.put(shohinList.get(2), 350);
        shopMap.put(shohinList.get(3), 100);

        // ③ カリキュラムを参考に拡張for文を使って、課題の画像と同じ表示になるよう記述してください。
        for (String shohin : shohinList) {
            System.out.println(shohin + "は" + shopMap.get(shohin) + "円なり！");
        }
    }
}