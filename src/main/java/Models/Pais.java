/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.List;

/**
 *
 * @author dell
 */
public class Pais {
    
    private int idPais;
    private String pais;
    private String capital;
    private List<Ciudad> ciudades;

    public Pais() {
    }

    public Pais(int idPais, String pais, String capital, List<Ciudad> ciudades) {
        this.idPais = idPais;
        this.pais = pais;
        this.capital = capital;
        this.ciudades = ciudades;
    }

    public int getIdPais() {
        return idPais;
    }

    public void setIdPais(int idPais) {
        this.idPais = idPais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }
    
    public List<Ciudad> getCiudades() {
        return ciudades;
    }
    
    public void setCiudades(List<Ciudad> ciudades) {
        this.ciudades = ciudades;
    }
    
    
}

