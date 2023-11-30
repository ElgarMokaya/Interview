package com.example.example.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.example.model.UserInfo;

@Repository
public interface UserInfoRepository  extends JpaRepository<UserInfo,Integer>{
   Optional<UserInfo> findByName(String username);
}
