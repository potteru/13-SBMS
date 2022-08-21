package in.Ashokit.response;
//@Data
public class Value {
	
	private Integer Id;
	private String quote;
	
	public Value() {

	}
	
	public Value(Integer id, String quote) {
		super();
		Id = id;
		this.quote = quote;
	}

	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getQuote() {
		return quote;
	}
	public void setQuote(String quote) {
		this.quote = quote;
	}
	@Override
	public String toString() {
		return "Value [Id=" + Id + ", quote=" + quote + "]";
	}
	

}
