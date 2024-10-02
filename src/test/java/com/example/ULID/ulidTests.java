package com.example.ULID;


import com.example.ULID.repository.ULIDRepository;
import com.example.ULID.repository.UUIDRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

@DataJpaTest
@ActiveProfiles("test")
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class ulidTests {

    @Autowired
    private ULIDRepository ulidRepository;

    @Autowired
    private UUIDRepository uuidRepository;


    @Test
    public void testInsertUuid() {

//        long startTimeUUID = System.nanoTime();
//        dataLoadService.loadUUID(1000000);
//        long endTimeUUID = System.nanoTime();
//        long diferencaUUID = endTimeUUID - startTimeUUID;
//        double emSegundosUUID = diferencaUUID / 1_000_000_000.0;
//        System.out.println("Tempo de execução insert UUID: " + emSegundosUUID);
        uuidRepository.findRandom();
    }
//
//    @Test
//    public void testInsertUlid() {
//
//        long startTime = System.nanoTime();
//        dataLoadService.loadUlid(1000000);
//        long endTime = System.nanoTime();
//        long diferenca = endTime - startTime;
//        double emSegundos = diferenca / 1_000_000_000.0;
//        System.out.println("Tempo de execução insert ULID: " + emSegundos);
//    }
}
