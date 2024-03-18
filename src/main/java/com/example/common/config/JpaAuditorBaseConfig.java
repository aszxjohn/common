package com.example.common.config;

import java.util.Optional;

import org.springframework.data.domain.AuditorAware;


public class JpaAuditorBaseConfig implements AuditorAware<String> {
	
	@Override
	public Optional<String> getCurrentAuditor() {
		return Optional.empty();
	}
}
