package baekjoon;
import java.util.*;

class Book_Mangement extends Book {
	public Book_Mangement() {
		System.out.println("==========도서관리 프로그램==========");
		input();
		find();
	}
	
	public void input(){ //책 입력
		Book book = new Book();
		Ebook ebook = new Ebook();
		Magazine magazine = new Magazine();
	}
	
	public void find() { //책 찾기
		
	}
	
}

class Book { 
	private String title;
	private String writer;
	private int price;
	public Book(String title, String writer, int price) {
		
	}
	
}

class Ebook extends Book{
	private int key;
}

class Magazine extends Book{
	private int date;
}

public class codesilver {
	public static void main(String[] args) {
		Book_Mangement bm = new Book_Mangement();
	}
}
