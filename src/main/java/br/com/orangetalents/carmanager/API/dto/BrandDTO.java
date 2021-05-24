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
public class BrandDTO {

    @JsonProperty("nome")
    private String name;

    @JsonProperty("codigo")
    private String code;
    
}
