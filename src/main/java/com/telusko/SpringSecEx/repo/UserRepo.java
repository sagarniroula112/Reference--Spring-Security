package com.telusko.SpringSecEx.repo;

import com.telusko.SpringSecEx.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<Users, Integer> {
    Users findByUsername(String username);
}

// plain -> cipher -> plain (using key)
// what if the key is leaked?

// so what if I do hashing, instead of creating cipher text?
// run some algorithms like SHA or MD5,
// plain -> hash is possible
// hash -> plain is NOT possible

// plain -> hash1 -> hash2 -> ...

