/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題5 合計金額を求める
 *
 * 入力されたマカロンの個数から合計購入数、合計金額を求めます。
 * 合計購入数、合計金額を求める処理を追記した後で
 * [問題4]の表示を実行例を参考にして改変してください。
 *
 * <実行例>
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >8
 * ショコラ      >2
 * ピスターシュ  >6
 *
 * シトロン     8個
 * ショコラ     2個
 * ピスターシュ 6個
 *
 * 合計個数    16個
 * 合計金額  4480円
 *
 * をお買いあげですね。
 * 承りました。
 *
 */

package lesson01.challenge05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {
		System.out.println("たいへんお待たせしました。");
		System.out.println("【ポエール・ネルメ】");
		System.out.println("ただいまより開店です！！");

		System.out.println("\n本日のおすすめ商品です。\n");

		int cit = 30;
		int cho = 30;
		int pis = 30;
		System.out.println("シトロン　　　\\250・・・残り" + cit + "個");
		System.out.println("ショコラ　　　\\280・・・残り" + cho + "個");
		System.out.println("ピスタージュ　\\320・・・残り" + pis + "個");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("\nそれぞれ何個ずつ買いますか？\n");

		System.out.println("シトロン　　　>");
		String cit1strString = reader.readLine();
		int cit1 = Integer.parseInt(cit1strString);

		System.out.println("ショコラ　　　>");
		String cho1strString = reader.readLine();
		int cho1 = Integer.parseInt(cho1strString);

		System.out.println("ピスタージュ　>");
		String pis1strString = reader.readLine();
		int pis1 = Integer.parseInt(pis1strString);

		System.out.println("\nシトロン　　　" + cit1 + "個");
		System.out.println("ショコラ　　　" + cho1 + "個");
		System.out.println("ピスタージュ　" + pis1 + "個");

		int total = (int) (cit1 + cho1 + pis1);
		int totalPrice = (int) (250 * cit1 + 280 * cho1 + 320 * pis1);
		System.out.println("\n合計個数　" + total + "個");
		System.out.println("合計金額　" + totalPrice + "円");

		System.out.println("\nをお買いあげですね。");
		System.out.println("承りました。");

	}

}
