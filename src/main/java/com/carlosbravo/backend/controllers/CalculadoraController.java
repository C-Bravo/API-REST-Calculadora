package com.carlosbravo.backend.controllers;

import com.carlosbravo.backend.models.CalculadoraModel;
import com.carlosbravo.backend.services.CalculadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
public class CalculadoraController {

    @Autowired
    CalculadoraService calculadoraService;

    // Métodos

    @GetMapping("/suma")
    public CalculadoraModel sumar(@RequestParam(value = "op1", defaultValue = "0") float op1, @RequestParam(value = "op2", defaultValue = "0") float op2 ){
        float res = op1 + op2;
        String type = "Suma";
        calculadoraService.saveOperation(new CalculadoraModel(type, op1, op2, res));
        return new CalculadoraModel(type, op1, op2, res);
    }


    @GetMapping("/resta")
    public CalculadoraModel restar(@RequestParam(value = "op1", defaultValue = "0") float op1, @RequestParam(value = "op2", defaultValue = "0") float op2 ){
        float res = op1 - op2;
        String type = "Resta";
        calculadoraService.saveOperation(new CalculadoraModel(type, op1, op2, res));
        return new CalculadoraModel(type, op1, op2, res);
    }

    @GetMapping("/multiplicacion")
    public CalculadoraModel multiplicar(@RequestParam(value = "op1", defaultValue = "0") float op1, @RequestParam(value = "op2", defaultValue = "0") float op2 ){
        float res = op1 * op2;
        String type = "Multiplicación";
        calculadoraService.saveOperation(new CalculadoraModel(type, op1, op2, res));
        return new CalculadoraModel(type, op1, op2, res);
    }

    @GetMapping("/division")
    public CalculadoraModel dividir(@RequestParam(value = "op1", defaultValue = "0") float op1, @RequestParam(value = "op2", defaultValue = "1") float op2 ){
        float res = op1/op2;
        String type = "División";
        calculadoraService.saveOperation(new CalculadoraModel(type, op1, op2, res));
        return new CalculadoraModel(type, op1, op2, res);
    }
}
