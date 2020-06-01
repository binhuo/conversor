/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unisantos.conversor.model;

/**
 *
 * @author Kleber Costa
 */
public class Conversor  {

    private Float reais;
    private Float dollar;
    private Float convertida;

    public Conversor() {
    }

    public Float getReais() {
        return reais;
    }

    public void setReais(Float reais) {
        this.reais = reais;
    }
    
    public Float getDollar() {
        return dollar;
    }

    public void setDollar(Float dollar) {
        this.dollar = dollar;
    }

	public Float getConvertida() {
		return convertida;
	}

	public void setConvertida(Float convertida) {
		this.convertida = convertida;
	}
    
}
