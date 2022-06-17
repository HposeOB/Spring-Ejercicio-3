package com.example.springEjercicio3;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Telefono {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String marca;
    private float pulgadas;
    private int camaras;

    public Telefono(Long id, String marca, float pulgadas, int camaras) {
        this.id = id;
        this.marca = marca;
        this.pulgadas = pulgadas;
        this.camaras = camaras;
    }

    public Telefono() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(float pulgadas) {
        this.pulgadas = pulgadas;
    }

    public int getCamaras() {
        return camaras;
    }

    public void setCamaras(int camaras) {
        this.camaras = camaras;
    }

    @Override
    public String toString() {
        return "Telefono{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                ", pulgadas=" + pulgadas +
                ", camaras=" + camaras +
                '}';
    }
}
