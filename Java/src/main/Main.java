package main;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int sum,max;
		max = a > b ? a:b;
		max = max > c ? max:c;
		if(a==b) {
			if(b==c) sum = 10000+a*1000;
			else sum = 1000+a*100;
		}
		else if(b==c) sum = 1000+b*100;
		else if(a==c) sum = 1000+a*100;
		else sum = max*100;
		System.out.print(sum);
	}
}
 