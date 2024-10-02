package com.example.ULID.repository;

import com.example.ULID.ULIDEntity;
import com.example.ULID.UUIDEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface UUIDRepository extends JpaRepository<UUIDEntity, UUID> {

    @Query(value = "SELECT * FROM uuidentity ORDER BY RANDOM() LIMIT 1", nativeQuery = true)
    Optional<UUIDEntity> findRandom();
}
