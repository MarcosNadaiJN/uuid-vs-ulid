package com.example.ULID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
public class UUIDEntity {
    @Id
    private UUID id;
    private String nome;
    private String descricao;
}
