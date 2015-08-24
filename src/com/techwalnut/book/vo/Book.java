package com.techwalnut.book.vo;

import java.util.List;
import java.util.UUID;

public class Book {
	private UUID bookId;
	private String bookName;
	private List<Author> listAutor;

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", listAutor=" + listAutor + "]";
	}

	public Book(UUID bookId, String bookName, List<Author> listAutor) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.listAutor = listAutor;
	}

	public UUID getBookId() {
		return bookId;
	}

	public void setBookId(UUID bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public List<Author> getListAutor() {
		return listAutor;
	}

	public void setListAutor(List<Author> listAutor) {
		this.listAutor = listAutor;
	}

}
