package javaStudy;

import java.util.ArrayList;
import java.util.List;

public class BookTest {

	public static void main(String[] args) {
	    List<BookDTO> list = new ArrayList<>();
	    list.add(new BookDTO(21424, "Java Basic", "김하나", "Jaen.kr", 15000,"Java 기본 문법"));
	    list.add(new BookDTO(33455, "JDBC Pro", "김철수", "Jaen.kr", 23000," "));
	    list.add(new BookDTO(55355, "Servlet/JSP", "박자바", "Jaen.kr", 41000,"Model2 기반"));
	    list.add(new BookDTO(35332, "Android App", "홍길동", "Jaen.kr", 25000,"Lightweight Freamework"));
	    list.add(new BookDTO(35355, "OOAD 분석, 설계", "소나무", "Jaen.kr", 30000," "));
	    
	    for(int i=0; i<5; i++) {
	    	int isbn = list.get(i).getIsbn();
	    	String title = list.get(i).getTitle();
	    	String author = list.get(i).getAuthor();
	    	String publisher = list.get(i).getPublisher();
	    	int price = list.get(i).getPrice();
	    	String desc = list.get(i).getDesc();
	    	
	    	System.out.printf("%d\t | %s\t | %s\t | %s\t | %d\t | %s\t\r\n",isbn, title, author, publisher, price, desc );
	    }
	    
	    
	    /*
	    System.out.println(b1.toString()); 
	    System.out.println(b2.toString()); 
	    System.out.println(b3.toString()); 
	    System.out.println(b4.toString()); 
	    System.out.println(b5.toString()); 
	    */
	}

}
