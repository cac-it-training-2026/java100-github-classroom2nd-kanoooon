/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題6  在庫を減らす
 *
 * [問題5]までの表示を行った後で
 * 3種のマカロンそれぞれの在庫を減らす処理を追記し
 * 以下の実行例と同じものを最後に表示してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り22個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り24個
 *
 */

package lesson01.challenge06;

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

		//		問題6は以下から始まる
		int restcit = (int) (cit - cit1);
		int restcho = (int) (cho - cho1);
		int restpis = (int) (pis - pis1);

		System.out.println("\n本日のおすすめ商品です。");
		System.out.println("\nシトロン　　　\\250・・・残り" + restcit + "個");
		System.out.println("ショコラ　　　\\280・・・残り" + restcho + "個");
		System.out.println("ピスタージュ　\\320・・・残り" + restpis + "個");

	}

}
