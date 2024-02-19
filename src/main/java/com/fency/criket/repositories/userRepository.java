package com.fency.criket.repositories;

import com.fency.criket.entities.loginUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface userRepository extends CrudRepository<loginUser,String> {
}
