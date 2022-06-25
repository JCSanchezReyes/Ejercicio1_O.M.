package com.example.calculadora10.tablas;

public class Suma {

    private Integer num1;
    private Integer num2;
    private Integer resultado;

    public Suma(Integer num1, Integer num2, Integer resultado) {
        this.num1 = num1;
        this.num2 = num2;
        this.resultado = resultado;
    }

    public Suma() {
        //Contructor vacio
    }

    public void setNum1(Integer num1) {
        this.num1 = num1;
    }

    public void setNum2(Integer num2) {
        this.num2 = num2;
    }

    public void setResultado(Integer resultado) {
        this.resultado = resultado;
    }


    public Integer getNum1() {
        return num1;
    }

    public Integer getNum2() {
        return num2;
    }

    public Integer getResultado() {
        return resultado;
    }


}
