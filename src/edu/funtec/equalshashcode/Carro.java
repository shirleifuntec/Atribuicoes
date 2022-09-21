package edu.funtec.equalshashcode;

import java.util.Objects;

public class Carro {

    private String marca; //atributo

    public Carro(String marca) {//contrutor
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override //metodo equals
    public boolean equals(Object o) {
        if (this == o) return true;//esta se a referencia de memoria do objeto é igual a outra
        if (!(o instanceof Carro)) return false;//testa se é nulo, ou se o objeto é diferente
        Carro carro = (Carro) o;
        return Objects.equals(getMarca(), carro.getMarca());//retrona se for igua
    }

    @Override //metodo hashcode
    public int hashCode() {
        return Objects.hash(getMarca());//retorna um número, um hash gerado através do atributo marca.
    }
}
