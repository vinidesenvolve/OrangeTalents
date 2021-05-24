package br.com.orangetalents.carmanager.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.orangetalents.carmanager.dto.CarDTO;
import br.com.orangetalents.carmanager.model.Car;
import br.com.orangetalents.carmanager.model.User;
import br.com.orangetalents.carmanager.repository.CarRepository;
import br.com.orangetalents.carmanager.repository.UserRepository;
 
@Service
public class CarService {
    
    @Autowired
    public CarRepository carRepo;

    @Autowired
    public UserRepository userRepo;

    @Autowired
    public NoDriveDayService noDriveDayService;

    @Autowired
    public CarPriceService carPriceService;

    public ResponseEntity<?> create(CarDTO carDTO, Long userId){

        if(userRepo.findById(userId).isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body("Usuário não encontrado, verifique se o id é válido.");
        }

        User user = userRepo.findById(userId).get();

        Car car = new Car();

        String year = carDTO.getYear();
        String brand = carDTO.getBrand();
        String model = carDTO.getModel();
        
        String noDriveDay = noDriveDayService.getNoDriveDay(year);

        Boolean noDriveDayActive = noDriveDayService.isDriveDayActive(noDriveDay);

        String price = carPriceService.getPriceFIPE(brand, model, year);

        car.setBrand(brand);
        car.setModel(model);
        car.setYear(year);
        car.setNoDriveDay(noDriveDay);
        car.setNoDriveDayActive(noDriveDayActive);
        car.setPrice(price);
        car.setUser(user);

        carRepo.save(car);
           
        CarDTO showCarDTO = new CarDTO(car);

        return ResponseEntity.status(HttpStatus.CREATED).body(showCarDTO);
    }
}
