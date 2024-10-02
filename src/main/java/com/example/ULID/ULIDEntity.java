package com.example.ULID;

import de.huxhorn.sulky.ulid.ULID;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class ULIDEntity {

    @Id
    private String id;
    private String nome;
    private String descricao;

    public ULIDEntity() {
        this.id = new ULID().nextULID();
    }
}
