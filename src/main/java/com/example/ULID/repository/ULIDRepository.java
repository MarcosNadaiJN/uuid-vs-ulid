package com.example.ULID.repository;

import com.example.ULID.ULIDEntity;
import de.huxhorn.sulky.ulid.ULID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ULIDRepository extends JpaRepository<ULIDEntity, ULID> {

    @Query(value = "SELECT * FROM ulidentity ORDER BY RANDOM() LIMIT 1", nativeQuery = true)
    Optional<ULIDEntity> findRandom();
}
