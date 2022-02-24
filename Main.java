import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.print("数値を入力してください：");
		//ここでは数値入力の変数としてnumを使用。
		int num = new java.util.Scanner(System.in).nextInt();
		System.out.print("数値の確認のため、数値を出力します：");
		System.out.println(num);

		System.out.print("名前を入力してください：");
		//名前入力のために、strを使用。
		String str = new Scanner(System.in).next();
		System.out.print("名前確認のために、名前を出力します：");
		System.out.println(str);
	}

}
