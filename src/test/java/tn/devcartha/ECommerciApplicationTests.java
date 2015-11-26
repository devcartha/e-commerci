package tn.devcartha;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import tn.devcartha.ecommerci.configuration.ECommerciApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ECommerciApplication.class)
@WebAppConfiguration
public class ECommerciApplicationTests {

	@Test
	public void contextLoads() {
	}

}
