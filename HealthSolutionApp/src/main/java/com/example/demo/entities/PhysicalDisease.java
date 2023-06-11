package com.example.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "t_PhysicalDisease")
public class PhysicalDisease extends BaseEntity{
   @Column(name = "Disease")
   private String disease;
}
