package com.utn.gocella.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.OneToMany;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Printer {

    private String brand;
    private String model;
    private String operativesistem;


    //@OneToMany(mappedBy = "printer")
    List<Impression> impressions;

}
