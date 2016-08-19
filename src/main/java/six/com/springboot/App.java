package six.com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Hello world!
 *
 */
@ComponentScan
@Configuration
@EnableAutoConfiguration
public class App extends WebMvcConfigurerAdapter {

	/**
	 * test
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}


}
