package com.example.demo.entities;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "t_PhysicalHealth")
public class PhysicalHealth extends BaseEntity implements Serializable{
	 //@Column(name = "p_HealthProblem", length = 50)
     private String physicalHealthProblem;
     private String diet;
     private String exerciseLink;
     @ManyToOne(cascade=CascadeType.REMOVE)
     @JoinColumn(name = "healthTypeId", nullable = false)
     private UserHealthType healthTypeId;
}
