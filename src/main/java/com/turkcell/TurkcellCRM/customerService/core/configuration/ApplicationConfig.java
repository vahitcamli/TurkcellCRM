package com.turkcell.TurkcellCRM.customerService.core.configuration;

import java.util.Locale;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver;

import com.turkcell.TurkcellCRM.CoreService.configuration.BaseSecurityService;

import lombok.RequiredArgsConstructor;

@Configuration
@RequiredArgsConstructor
public class ApplicationConfig {
	private final BaseSecurityService baseSecurityService;

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		baseSecurityService.configureCoreSecurity(http);
		http.authorizeHttpRequests(
				req -> req.requestMatchers("/swagger-ui/**","/v3/api-docs/**","/api/v1/customers/{id}").permitAll().anyRequest().authenticated());
		return http.build();
	}

	@Bean
	public ResourceBundleMessageSource bundleMessageSource() {
		ResourceBundleMessageSource source = new ResourceBundleMessageSource();
		source.setBasename("messages");
		return source;
	}

	@Bean
	public LocaleResolver localeResolver() {
		AcceptHeaderLocaleResolver acceptHeaderLocaleResolver = new AcceptHeaderLocaleResolver();
		acceptHeaderLocaleResolver.setDefaultLocale(new Locale("tr"));
		return acceptHeaderLocaleResolver;
	}

	@Bean
	public ModelMapper getModelMapper() {
		return new ModelMapper();
	}

}