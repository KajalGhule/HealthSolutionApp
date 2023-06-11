package com.example.demo.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "t_MentalHealth")

public class MentalHealth extends BaseEntity{
	private String link;
	private String linkType;
	@ManyToOne(cascade=CascadeType.REMOVE)
    @JoinColumn(name = "healthTypeId", nullable = false)
    private UserHealthType healthTypeId;
}
