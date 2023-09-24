package baekjoon;
import java.util.*;

public class M1181 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<String> set = new HashSet<String>();
		int N = sc.nextInt();
		String[] word = new String[N];
		
		for(int i = 0; i < N ; i++) {
			word[i] = sc.next();
		}
		String[] words = Arrays.stream(word).distinct().toArray(String[]::new); //배열 > stream > 중복제거 > 배열
		
		Arrays.sort(words, Comparator.comparingInt(String::length)); //글자수 정렬
		
		for(int i = 0; i < words.length ; i++) {
			System.out.println(words[i]);
		}
		
		
		
		sc.close();
	}
}
