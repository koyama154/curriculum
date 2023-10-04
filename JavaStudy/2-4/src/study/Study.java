package study;

// ①FruitsConstants.javaをインポートしなさい。
import constants.FruitsConstants;
// ②Fruits.javaをインポートしなさい。
import fruits.Fruits;

public class Study {

    public static void main(String[] args) {

        // ③ Fruits.javaのprintFruitsメソッドを呼び出しなさい。
        // また、課題の画像と同じ表示になるように
        // printFruitsの引数にはFruitsConstantsに指定されている定数を設定してください。
        Fruits.printFruits(FruitsConstants.FRUITS_LEMON_04, FruitsConstants.FRUITS_COUNT_20);

    }
}