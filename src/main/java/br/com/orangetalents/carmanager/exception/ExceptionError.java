package br.com.orangetalents.carmanager.exception;

import java.time.LocalDateTime;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExceptionError {
    
    private Integer status;
    private LocalDateTime dataHora;
    private String mensagem;
    private List<Field> campos;

    @AllArgsConstructor
    @Getter
    public static class Field{
        private String campo;
        private String problema;
    }
}
