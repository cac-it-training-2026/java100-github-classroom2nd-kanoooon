/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題8 閉店作業を行う
 *
 * 閉店時間となったため、閉店メッセージを表示し
 * 売上の割合を確認します。
 * 以下の実行例を参考に処理を追記、改変してください。
 * （%の表示は小数第一位切り捨てで行います。）
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * をお買いあげですね。
 * 承りました。
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り25個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り27個
 *
 * 閉店時間となりました。
 * またのお越しをお待ちしております。
 *
 * 売上の割合
 * 売上合計      \2470
 *
 * 内訳
 * シトロン      \1250・・・ 50%
 * ショコラ      \420・・・ 17%
 * ピスターシュ  \800・・・ 32%
 *
 */

package lesson01.challenge08;

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
		double cit1 = Double.parseDouble(cit1strString);

		System.out.println("ショコラ　　　>");
		String cho1strString = reader.readLine();
		double cho1 = Double.parseDouble(cho1strString);

		System.out.println("ピスタージュ　>");
		String pis1strString = reader.readLine();
		double pis1 = Double.parseDouble(pis1strString);

		System.out.println("\nシトロン　　　" + cit1 + "個");
		System.out.println("ショコラ　　　" + cho1 + "個");
		System.out.println("ピスタージュ　" + pis1 + "個");

		double total = (double) (cit1 + cho1 + pis1);
		int totalPrice = (int) ((250 * cit1) + (280 * cho1) + (320 * pis1));
		System.out.println("\n合計個数　" + total + "個");
		System.out.println("合計金額　" + totalPrice + "円");

		System.out.println("\nをお買いあげですね。");
		System.out.println("承りました。");

		int restcit = (int) (cit - cit1);
		int restcho = (int) (cho - cho1);
		int restpis = (int) (pis - pis1);
		System.out.println("\n本日のおすすめ商品です。");
		System.out.println("\nシトロン　　　\\250・・・残り" + restcit + "個");
		System.out.println("ショコラ　　　\\280・・・残り" + restcho + "個");
		System.out.println("ピスタージュ　\\320・・・残り" + restpis + "個");

		//		問題8は以下から始まる
		System.out.println("\n閉店時間となりました。");
		System.out.println("またのお越しをお待ちしております。");

		System.out.println("\n売上の割合");
		System.out.println("売上合計　　　\" + totalPrice +");

		int citPrice = (int) (250 * cit1);
		int choPrice = (int) (280 * cho1);
		int pisPrice = (int) (320 * pis1);

		int citPer = (int) (citPrice * 100 / totalPrice);
		int choPer = (int) (choPrice * 100 / totalPrice);
		int pisPer = (int) (pisPrice * 100 / totalPrice);

		System.out.println("\n内訳");
		System.out.println("シトロン　　　\\" + citPrice + "・・・" + citPer + "%");
		System.out.println("ショコラ　　　\\" + choPrice + "・・・" + choPer + "%");
		System.out.println("ピスタージュ　\\" + pisPrice + "・・・" + pisPer + "%");

	}

}
