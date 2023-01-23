package com.bilgeadam.ecommerce.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
public class Deneme {

    private Long ID;
    private String name;

    public Deneme(long l, String hamit) {
        this.ID=l;
        this.name=hamit;
    }
}
