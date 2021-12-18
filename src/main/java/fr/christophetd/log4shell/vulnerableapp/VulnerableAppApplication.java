package fr.christophetd.log4shell.vulnerableapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VulnerableAppApplication {

	public static void main(String[] args) {
        System.setProperty("sun.net.spi.nameservice.provider.1", "dns,sun");
        System.setProperty("log4j2.allowedLdapHosts", "1.2.3.4");
		SpringApplication.run(VulnerableAppApplication.class, args);
	}

}
