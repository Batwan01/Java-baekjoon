package baekjoon;
import java.util.*;

class Book_Mangement{
	Scanner sc = new Scanner(System.in);
	
	public Book_Mangement() {
		System.out.println("==========도서관리 프로그램==========");
		input();
		find();
	}
	
	public void input(){ //책 입력
		
		System.out.println("책 ( 책 제목, 저자, 책 가격 )");
		System.out.print("책 제목 : ");
		String title = sc.next();
		title = remove_space(title);
		System.out.print("저자 : ");
		String writer = sc.next();
		writer = remove_space(writer);
		System.out.print("가격 : ");
		int price = sc.nextInt();
		
		Book book = new Book(title, writer, price);
		
	/*	System.out.println("책 ( 책 제목, 저자, 책 가격, 보안키 )");
		title = sc.next();
		title = remove_space(title);
		System.out.print("저자 : ");
		writer = sc.next();
		writer = remove_space(writer);
		System.out.print("가격 : ");
		price = sc.nextInt();
		System.out.println("보안키 : ");
		String key = sc.next();
		Ebook ebook = new Ebook(title, writer, price, key); */

		//Magazine magazine = new Magazine(sc);
	}
	
	public void find() { //책 찾기
		
		int choice;
		String title, writer;

		while(true) {
			System.out.println("키워드 검색( 3 입력시 종료\n1. 도서명 2. 저자명");
			choice = sc.nextInt();
			switch (choice) {
				case 1:
					System.out.println("도서 명 : ");
					title = sc.next();
					book.show();
					break;
				case 2:
					System.out.println("저자 : ");
					writer = sc.next();
					break;
				case 3:
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
			}
		}

	}
	
	String remove_space(String str) {
		return str.replaceAll(" ","");
	}
	sc.close();
}

class Book{ 
	private String title;
	private String writer;
	private int price;
	
	public Book(String title, String writer, int price) {
		settitle(title);
		setwriter(writer);
		setprice(price);
	}
	
	public String gettitle(String tile) { //찾기
		return title;
	}
	
	public String getwriter(String writer) {
		return writer;
	}
	
	public void settitle(String title) { //책 설정하기
		this.title = title;
	}
	public void setwriter(String writer) {
		this.writer = writer;
	}
	public void setprice(int price) {
		this.price = price;
	}
	
	public void show() { //출력하기
		System.out.println("-----------");
		System.out.println("책 제목 : " + title);
		System.out.println("저자 : " + writer);
		System.out.println("가격 : " + price);
		System.out.println("-----------");
	}
	
}

/* class Ebook extends Book{
	private String key;
	
	public Ebook(String title, String writer, int price, String key) {
		
	}
}

class Magazine extends Book{
	private String date;
	
	public Magazine(String title, String writer, int price, String date) {
		
	}
} */

public class codesilver {
	public static void main(String[] args) {
		Book_Mangement bm = new Book_Mangement();
	}
}
