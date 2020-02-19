package com.uabc.edu.app.practica1.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculadoraController {
    public double x, y;
    public double res;
    public CalculadoraController(){

    }
    @GetMapping("/")
    public String saliduto(){
        return "<b> HOLIS </b>  BIenvenido al mundo del sida";
    }
    @GetMapping("/resta")
    public double Resta(@RequestParam(value="numX") double x,@RequestParam(value="numY") double y){

        return x-y;
    }
    @GetMapping("/suma")
    public double Suma(@RequestParam(value="numX") double x,@RequestParam(value="numY") double y){


        return x+y;
    }
    @GetMapping("/multiplicacion")
    public double Multiplicacion(@RequestParam(value="numX") double x,@RequestParam(value="numY") double y){

        return x*y;
    }
    @GetMapping("/division")
    public double Division(@RequestParam(value="numX") double x,@RequestParam(value="numY") double y){

        return x%y;
    }
    @GetMapping("/cuadrado")
    public double AlCuadrado(@RequestParam(value="numX")double x){
     return x*x;
    }

    @GetMapping("/porcentaje")
    public double porcentaje(@RequestParam(value="numX") double x,@RequestParam(value="numY") double y){
        return (x*y)/100;
    }
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getRes() {
        return res;
    }

    public void setRes(double res) {
        this.res = res;
    }
}
