package baekjoon;
import java.util.*;

public class M1181 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] word = new String[N];
		
		for(int i = 0; i < N ; i++) {
			word[i] = sc.nextLine();
		}
		for(int i = 0; i < N ; i++) {
			System.out.println(word[i]);
		}
		
		
		sc.close();
	}
}
