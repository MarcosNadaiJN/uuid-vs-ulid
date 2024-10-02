package com.example.ULID.service;

import com.example.ULID.ULIDEntity;
import com.example.ULID.UUIDEntity;
import com.example.ULID.repository.ULIDRepository;
import com.example.ULID.repository.UUIDRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
import java.util.UUID;
import java.util.stream.IntStream;

@Service
public class DataLoadService {

    private final UUIDRepository uuidRepo;
    private final ULIDRepository ulidRepo;

    public DataLoadService(UUIDRepository uuidRepo, ULIDRepository ulidRepo) {
        this.uuidRepo = uuidRepo;
        this.ulidRepo = ulidRepo;
    }

    @Transactional
    public void loadUUID(int count) {
        IntStream.range(0, count).forEach(i -> {
            UUIDEntity uuidEntity = new UUIDEntity();
            uuidEntity.setId(UUID.randomUUID());
            uuidEntity.setNome("Nome UUID " + i);
            uuidEntity.setDescricao("Descricao UUID " + i);
            uuidRepo.save(uuidEntity);
        });
    }

    @Transactional
    public void loadUlid(int count) {
        IntStream.range(0, count).forEach(i -> {
            ULIDEntity ulidEntity = new ULIDEntity();
            ulidEntity.setNome("Nome ULID " + i);
            ulidEntity.setDescricao("Descricao ULID " + i);
            ulidRepo.save(ulidEntity);
        });
    }

   @Transactional
   public void deleteRandomULID(int count) {
       IntStream.range(0, count).forEach(i -> {
          Optional<ULIDEntity> ulidEntity = ulidRepo.findRandom();
          if(ulidEntity.isPresent()) {
              ulidRepo.delete(ulidEntity.get());
          }
       });
   }

    @Transactional
    public void deleteRandomUUID(int count) {
        IntStream.range(0, count).forEach(i -> {
            Optional<UUIDEntity> uuidEntity= uuidRepo.findRandom();
            if(uuidEntity.isPresent()) {
                uuidRepo.delete(uuidEntity.get());
            }
        });
    }

}
