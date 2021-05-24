package br.com.orangetalents.carmanager.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.orangetalents.carmanager.API.FipeClient;
import br.com.orangetalents.carmanager.API.dto.BrandDTO;
import br.com.orangetalents.carmanager.API.dto.ModelListDTO;
import br.com.orangetalents.carmanager.API.dto.YearDTO;

@Service
public class CarPriceService {
    
    @Autowired
    private FipeClient fipeClient;
   
    private String brandCode;
    private String modelCode;
    private String yearCode;

    public String getPriceFIPE(String brand, String model, String year){
        
        getBrandCode(brand);
        getModelCode(model);
        getyearCode(year);
        
        return fipeClient.getVehicle(brandCode, modelCode, yearCode).getPrice();
    }

    public String getBrandCode(String brandName){

        brandCode = null;

        List<BrandDTO> brands = fipeClient.getBrandsList();

        brands.forEach(brand -> {
            if(brand.getName().contains(brandName)){
                brandCode = brand.getCode();
            }
        });

        return brandCode;
    }

    public String getModelCode(String modelName){

        modelCode = null;

        ModelListDTO modelsResponse = fipeClient.getModelsResponse(brandCode);

        modelsResponse.getModels().forEach(model -> {
            if(model.getName().contains(modelName)){
                modelCode = model.getCode().toString();
            }
        });

        return modelCode;
    }

    public String getyearCode(String yearName){

        yearCode = null;

        List<YearDTO> years = fipeClient.getYears(brandCode, modelCode);
        
        years.forEach(year -> {
            if(year.getName().contains(yearName)){
                yearCode = year.getCode().toString();
            }
        });

        return yearCode;
    }
    
}
