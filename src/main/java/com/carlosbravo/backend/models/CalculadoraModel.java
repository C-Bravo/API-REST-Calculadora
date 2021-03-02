package com.carlosbravo.backend.models;

import javax.persistence.*;

@Entity
@Table(name = "operation")
public class CalculadoraModel {
    // Variables
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private  Long id;

    private String type;
    private final float op1;
    private final float op2;
    private final float res;

    // Constructor

    public CalculadoraModel( String type, float op1, float op2, float res){
        this.type = type;
        this.op1 = op1;
        this.op2 = op2;
        this.res = res;
    }

    // Métodos

    public Long getId() {
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getType(){
        return type;
    }

    public float getOp1() {
        return op1;
    }

    public float getOp2() {
        return op2;
    }

    public float getRes() {
        return res;
    }
}
