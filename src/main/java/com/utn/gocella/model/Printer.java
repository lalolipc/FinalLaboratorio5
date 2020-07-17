package com.utn.gocella.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Printer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String brand;
    private String model;
    private String operativesistem;

    @OneToMany(mappedBy = "printer")
    List<Impression> impressions;



   // @JsonIgnore
    public Integer getId() {
        return id;
    }
  //  @JsonProperty("Printer")
    public String getBrand() {
        return brand.concat(" ").concat(model);
    }
//    @JsonIgnore
    public String getModel() {
        return model;
    }
   // @JsonIgnore
    public String getOperativesistem() {
        return operativesistem;
    }

    public List<Impression> getImpressions() {
        return impressions;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setOperativesistem(String operativesistem) {
        this.operativesistem = operativesistem;
    }

    public void setImpressions(List<Impression> impressions) {
        this.impressions = impressions;
    }
}
