package in.Ashokit.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class ConnectionPoolManager implements InitializingBean,DisposableBean {
	
	public ConnectionPoolManager() {
		System.out.println("*** Connection pool Manager :: constructor ***");
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println(" Connection pool got created ");
	}
	public void getConnection() {
		System.out.println(" Got connection from pool ");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println(" Connection pool Destroyed ");
	}

}
