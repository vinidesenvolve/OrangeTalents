package br.com.orangetalents.carmanager.services;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

import org.springframework.stereotype.Service;

@Service
public class NoDriveDayService {
    public String getNoDriveDay(String year) {

        String lastNumber = String.valueOf(year.charAt(year.length() - 1));
        String dayOfWeek;

        switch(lastNumber){
            case "0":
            case "1":
                dayOfWeek = "segunda-feira";
                break;
            case "2":
            case "3":
                dayOfWeek = "terça-feira";
                break;
            case "4":
            case "5":
                dayOfWeek = "quarta-feira";
                break;
            case "6":
            case "7":
                dayOfWeek = "quinta-feira";
                break;
            default:
                dayOfWeek = "sexta-feira";
        }

        return dayOfWeek;   
    }

    public Boolean isDriveDayActive(String noDriveDay){
        
        LocalDate date = LocalDate.now();

        DayOfWeek today = date.getDayOfWeek();
        
        Locale br = new Locale("pt","BR");

        String todayBR = today.getDisplayName(TextStyle.FULL, br);

        if(noDriveDay.equals(todayBR)){
            return true;
        }else{
            return false;
        }
    }
}
