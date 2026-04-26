/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題4 注文を受ける
 *
 * 3種類のマカロンを任意の個数購入できるようにします。
 * [問題3]までの表示を行った後で
 * 実行例を参考に処理を追記してください。
 * （ >8 は >を表示した後で入力待ち状態になり、
 *   ユーザーがキーボードから8を入力したイメージです。）
 *
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
 * をお買いあげですね。
 * 承りました。
 */

package lesson01.challenge04;

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

		System.out.println("\nをお買いあげですね。");
		System.out.println("承りました。");

	}

}
