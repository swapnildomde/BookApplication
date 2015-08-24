package com.techwalnut.book.vo;

public class Book {
//	git remote add origin https://github.com/swapnildomde/BookApplication.git
//		git push -u origin master
	
	
	private String bookName;
	private String id;
	
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
		bookName="c lang ";
		id="101";
	}


	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", id=" + id + "]";
	}
	

}
