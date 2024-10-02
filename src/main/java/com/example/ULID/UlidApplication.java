package com.example.ULID;

import com.example.ULID.repository.ULIDRepository;
import com.example.ULID.repository.UUIDRepository;
import com.example.ULID.service.DataLoadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UlidApplication implements CommandLineRunner {

    @Autowired
    private DataLoadService dataLoadService;

    @Autowired
    private ULIDRepository ulidRepository;

    @Autowired
    private UUIDRepository uuidRepository;

    public static void main(String[] args) {
        SpringApplication.run(UlidApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        uuidRepository.deleteAll();
//        ulidRepository.deleteAll();

//        long startTimeUUID = System.nanoTime();
//        dataLoadService.loadUUID(1000000);
//        long endTimeUUID = System.nanoTime();
//        long diferencaUUID = endTimeUUID - startTimeUUID;
//        double emSegundosUUID = diferencaUUID / 1_000_000_000.0;
//        System.out.println("Tempo de execução insert UUID: " + emSegundosUUID);
//
//        long startTime = System.nanoTime();
//        dataLoadService.loadUlid(1000000);
//        long endTime = System.nanoTime();
//        long diferenca = endTime - startTime;
//        double emSegundos = diferenca / 1_000_000_000.0;
//        System.out.println("Tempo de execução insert ULID: " + emSegundos);

//         ulidRepository.findRandom();

//        long st = System.nanoTime();
//        dataLoadService.deleteRandomULID(100);
//        ulidRepository.findRandom();
//        long et = System.nanoTime();
//        long diferenca = et - st;
//        double emSegundos = diferenca / 1_000_000_000.0;
//        System.out.println("Tempo de execução  ULID: " + emSegundos);
//
//        long st2 = System.nanoTime();
//        dataLoadService.deleteRandomUUID(100);
//        uuidRepository.findRandom();
//        long et2 = System.nanoTime();
//        long diferenca2 = et2 - st2;
//        double emSegundos2 = diferenca2 / 1_000_000_000.0;
//        System.out.println("Tempo de execução  UUID: " + emSegundos2);

    }
}
