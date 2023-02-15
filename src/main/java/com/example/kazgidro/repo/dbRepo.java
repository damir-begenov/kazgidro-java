package com.example.kazgidro.repo;

import com.example.kazgidro.entity.DbEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface dbRepo extends JpaRepository<DbEntity,Long> {
}
