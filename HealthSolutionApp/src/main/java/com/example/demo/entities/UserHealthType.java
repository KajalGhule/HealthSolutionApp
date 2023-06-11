package com.example.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotNull;

@Entity
public class UserHealthType extends BaseEntity{
	@NotNull
    private String healthType;
}
