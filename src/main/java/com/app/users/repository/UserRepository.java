package com.app.users.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.app.userscommons.models.User;

@RepositoryRestResource(path = "users")
public interface UserRepository extends PagingAndSortingRepository<User, Long> {
	
	@RestResource(path = "find-username")
	public User findByUsername(String username);
	

}
