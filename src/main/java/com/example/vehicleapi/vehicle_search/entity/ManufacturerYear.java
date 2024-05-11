package com.example.vehicleapi.vehicle_search.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="manufacture_year")
@AllArgsConstructor
@NoArgsConstructor
public class ManufacturerYear {
  @Id
  @GeneratedValue(strategy= GenerationType.AUTO)
   private int id;
   @Column(name="year")
   private String year;
}
