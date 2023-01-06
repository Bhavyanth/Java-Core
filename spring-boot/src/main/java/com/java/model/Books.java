package com.java.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * Class is an entity which is mapped to the database
 */

@Entity
/*
 * @Table annotation declares class name as the table name
 */
@Table
public class Books {
	/*
	 * @Id declares the variable as a primary key
	 */
	@Id
	@Column
	private int bookId;
	@Column
	private String bookName;
	@Column
	private String author;
	@Column
	private int price;

	public int getBookid() {
		return bookId;
	}

	public void setBookid(int bookid) {
		this.bookId = bookid;
	}

	public String getBookname() {
		return bookName;
	}

	public void setBookname(String bookname) {
		this.bookName = bookname;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}