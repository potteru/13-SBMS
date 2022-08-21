package in.Ashokit.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "BOOK_DTLS_TBL")
@Data
@NoArgsConstructor
@AllArgsConstructor
@IdClass(value=BookPK.class)	
public class Book {
	@Id 
	private Integer bId;
	
	@Id
	private String isbn;
	
	@Column(name ="Book_Price")
	private Double price;
	
		
}
