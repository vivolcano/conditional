package ru.netology.conditional.config;

import ru.netology.conditional.profile.DevProfile;
import ru.netology.conditional.profile.ProductionProfile;
import ru.netology.conditional.profile.SystemProfile;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Viktor_Loskutov
 */
@Configuration
public class ConditionalConfig {

	@ConditionalOnProperty(value = "netology.profile.dev", havingValue = "true")
	@Bean
	public SystemProfile devProfile() {
		return new DevProfile();
	}

	@ConditionalOnProperty(value = "netology.profile.dev", havingValue = "false")
	@Bean
	public SystemProfile prodProfile() {
		return new ProductionProfile();
	}
}