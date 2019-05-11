import java.util.Scanner;
//NAMA : ISMAIL UMAR
//NIM  : D0217308
//KELAS: INFORMATIKA. A 2017

public class STARWARS0015 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("INPUT");
		int a = sc.nextInt();
		System.out.println("OUTPUT");
		System.out.print("+");
		for (int i = 0; i < a; i++)
			System.out.print("---+");
		System.out.println();
	}
}
