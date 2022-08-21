package in.Ashokit.rest;

import java.time.Duration;
import java.util.Date;
import java.util.stream.Stream;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.Ashokit.bindings.CustomerEvent;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.util.function.Tuple2;

@RestController
public class CustomerRestController {
	@GetMapping("/event")
	public ResponseEntity<Mono<CustomerEvent>> getCustomerEvent() {
		
		CustomerEvent event =new CustomerEvent("aadi",new Date());
		Mono<CustomerEvent> monoObject = Mono.just(event);
		return new ResponseEntity<>(monoObject,HttpStatus.OK);
	}
	
	@GetMapping(value = "/events", produces = MediaType.TEXT_EVENT_STREAM_VALUE )
	public ResponseEntity<Flux<CustomerEvent>> getCustomerEvents() {
		// creating customer data in the form of object
		CustomerEvent customerEvent = new CustomerEvent("aadi",new Date());
		
		// create stream object to send data
		Stream<CustomerEvent> customerstream = Stream.generate(() -> customerEvent); 
		
		// create flux object with stream 
		Flux <CustomerEvent> customerFlux = Flux.fromStream(customerstream);
		
		//setting response interval
		Flux <Long> interval = Flux.interval(Duration.ofSeconds(5));
		
		//combine interval and customer flux
		Flux<Tuple2<Long, CustomerEvent>> zip = Flux.zip(interval, customerFlux);
		
		// Getting the flux value from the zip
		Flux<CustomerEvent> fluxmap = zip.map(Tuple2 :: getT2);
		
		//returning flux response
		return new ResponseEntity<>(fluxmap,HttpStatus.OK);
	}
	

}
