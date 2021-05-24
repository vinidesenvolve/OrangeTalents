package br.com.orangetalents.carmanager.dto;

import javax.validation.constraints.NotBlank;

import br.com.orangetalents.carmanager.model.Car;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CarDTO {

    private Long id;

    @NotBlank(message = "{NotBlank}")
    private String brand;

    @NotBlank(message = "{NotBlank}")
    private String model;

    @NotBlank(message = "{NotBlank}")
    private String year;

    private String price;
    private String noDriveDay;
    private Boolean noDriveDayActive;

    public CarDTO(Car entity) {
        id = entity.getId();
        brand = entity.getBrand();
        model = entity.getModel();
        year = entity.getYear();
        noDriveDay = entity.getNoDriveDay();
        noDriveDayActive = entity.getNoDriveDayActive();
        price = entity.getPrice();
    }

} 