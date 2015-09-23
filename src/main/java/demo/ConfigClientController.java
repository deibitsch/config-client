package demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@EnableAutoConfiguration
@RestController
@RefreshScope
public class ConfigClientController {

	@Value("${greeting.message}")
	private String message;

	@RequestMapping("/")
	public String greeting() {
		return this.message;
	}
}
