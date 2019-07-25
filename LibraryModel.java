package com.library.model;

public class LibraryModel 
{
	private int bookId;
	private String bookName;
	private String authorName;
    private double bookPrice;
    
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}
	@Override
	public String toString() {
		return "libraryService [bookId=" + bookId + ", bookName=" + bookName + ", authorName=" + authorName
				+ ", bookPrice=" + bookPrice + "]";
	}

}
