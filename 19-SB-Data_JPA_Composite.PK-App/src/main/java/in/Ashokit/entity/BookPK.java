package in.Ashokit.entity;

import java.io.Serializable;


public class BookPK implements Serializable{
	
	private Integer bId;
	
	private String isbn;
	
	public BookPK() {

	}
	public BookPK(Integer bId, String isbn) {
		super();
		this.bId = bId;
		this.isbn = isbn;
	}
	
	
	
}
