package baekjoon;
import java.util.*;

/*class change_w{
	public String[][] white;
	change_w(String white[][]) {
		
	}
}*/

public class M1018 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt(); //N*M
		sc.nextLine();
		if(N != M) {sc.close(); return;} 
		
		String[][] word = new String[M][M]; //비교
		
		String[][] white = new String[8][8]; //화이트 스타트
		//change_w w = new change_w(white);
		for(int i=0; i<8; i++) {
			for(int j=0; j<8; j++) {
				if(j%2 == 0) white[i][j] = "W";
				else white[i][j] = "B";
			}
		}
		for(int i=0; i<8; i++) {
			for(int j=0; j<8; j++) {
				System.out.print(white[i][j]);
			}
		}
		
		String[][] black = new String[N][M]; //블랙 스타트
		
		for(int i = 0; i<N; i++) {
			word[i] = sc.nextLine().split(""); //입력받음
		}
		
		sc.close();
	}
}