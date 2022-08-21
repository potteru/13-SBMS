package in.Ashokit.response;

import lombok.Data;

@Data
public class Covid19Response {
	
	private String country;
	private String code;
	private Long confirmed;
	private Long recovered;
	private Long deaths;
	private Double latitude;
	private Double longitude;
	private String lastchange;
	private String lastupdated;

}
