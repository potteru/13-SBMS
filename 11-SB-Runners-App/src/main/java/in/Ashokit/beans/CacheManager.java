package in.Ashokit.beans;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
@Component
public class CacheManager implements ApplicationRunner {

	public CacheManager() {
		System.out.println("-----Cache Manager----");
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println(" ApplicationRunner Method ");
	}
	
	/*
	 * @Override // implements CpmmandLineRunner public void run(String... args)
	 * throws Exception { System.out.println("--Run Method--"); }
	 */

}
