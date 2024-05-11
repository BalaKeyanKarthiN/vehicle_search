package com.example.vehicleapi.vehicle_search.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity
@Data
@Table(name="manufature")
@AllArgsConstructor
@NoArgsConstructor
public class Manfacturer {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private  int id;
   @Column(name="manufacture_name")
   private  String manufacturerName;
   @Column(name="country_of_orign")
   private  String  countryOfOrgin;


}
