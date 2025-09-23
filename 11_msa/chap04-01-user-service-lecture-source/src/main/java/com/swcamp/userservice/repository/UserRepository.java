package com.swcamp.userservice.repository;

import com.swcamp.userservice.aggregate.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity,Long>
{
}
