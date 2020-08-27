package com.app.users;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

import com.app.userscommons.models.User;
import com.app.userscommons.models.Role;

@Configuration
public class RepositoryConfig implements RepositoryRestConfigurer{

	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		config.exposeIdsFor(User.class, Role.class);
	}

}
