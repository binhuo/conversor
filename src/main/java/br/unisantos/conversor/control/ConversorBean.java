/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unisantos.conversor.control;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import br.unisantos.conversor.model.Conversor;

/**
 * @author Kleber Costa 
 */
@ManagedBean
@RequestScoped
public class ConversorBean {
	
	  private Conversor conversor = new Conversor();
	  
	  
	   public ConversorBean() {
	    }


	public Conversor getConversor() {
		return conversor;
	}
	
	public Conversor setConversor() {
		return conversor;
	}

	  
    public String converterdollar() {
    	conversor.setConvertida((conversor.getReais() * conversor.getDollar()));
        return "/convertida";
    }
	
}
