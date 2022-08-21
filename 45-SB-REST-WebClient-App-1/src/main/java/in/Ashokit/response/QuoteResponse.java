package in.Ashokit.response;
//@Data
public class QuoteResponse {
	
	private String type;
	private Value value;
	public QuoteResponse() {
		// TODO Auto-generated constructor stub
	}
	
	public QuoteResponse(String type, Value value) {
		super();
		this.type = type;
		this.value = value;
	}

	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Value getValue() {
		return value;
	}
	public void setValue(Value value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "QuoteResponse [type=" + type + ", value=" + value + "]";
	}
	
	

}
