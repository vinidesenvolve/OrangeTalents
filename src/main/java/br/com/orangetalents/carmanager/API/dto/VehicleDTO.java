package br.com.orangetalents.carmanager.API.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class VehicleDTO {
    
    @JsonProperty("Valor")
    private String price;
    
    @JsonProperty("Marca")
    private String brand;
    
    @JsonProperty("Modelo")
    private String model;
    
    @JsonProperty("AnoModelo")
    private String year;
    
    @JsonProperty("Combustivel")
    private String fuel;
    
    @JsonProperty("CodigoFipe")
    private String fipeCode;
    
    @JsonProperty("MesReferencia")
    private String referenceMonth;
    
    @JsonProperty("TipoVeiculo")
    private String type;
    
    @JsonProperty("SiglaCombustivel")
    private String fuelInitial;
}
