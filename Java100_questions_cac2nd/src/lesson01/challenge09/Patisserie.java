/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題9 新商品の開発
 *
 * 翌日から新商品を発売することにしました。
 * 新商品の名前は「三色マカロン」です。
 * シトロン、ショコラ、ピスターシュの３つの味が
 * 1個のマカロンに集約されているのが特徴で、
 * その配合率は前日の売上比で決まり、
 * 価格はマカロン１個あたりの平均売上価格に準じて
 * 自動的に決定されます。（ただし、1の位は切り捨て）
 *
 * 以下の実行例を参考に処理を追記、改変してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
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
 * 明日の三色マカロンの配合率が決まりました！
 *
 * シトロンの味    ・・・ 50%
 * ショコラの味    ・・・ 17%
 * ピスターシュの味・・・ 32%
 *
 * が楽しめます！
 *
 * 値段は\270です。
 *
 */

package lesson01.challenge09;

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

		//		問題9は以下から
		System.out.println("\n明日の三色マカロンの配合率が決まりました！");
		System.out.println("シトロンの味　　　・・・" + citPer + "%");
		System.out.println("ショコラの味　　　・・・" + choPer + "%");
		System.out.println("ピスタージュの味　・・・" + pisPer + "%");

		System.out.println("\nが楽しめます！");
		System.out.println("\n値段は\\" + (totalPrice / (int) total / 10 * 10) + "です。");

	}

}
