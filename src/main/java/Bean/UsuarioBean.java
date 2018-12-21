/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import Models.Usuario;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author dell
 */
@ManagedBean
@RequestScoped
public class UsuarioBean {
    
    private Usuario user;
    
    public UsuarioBean() {
        user = new Usuario();
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }
    
    public void registrar() {
        System.out.println("Usuario Registrado : "+ this.user.getFirstName());
        String msg = "Usuario agregado correctamente";
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, msg, msg));
        FacesContext.getCurrentInstance().getExternalContext().getFlash().setKeepMessages(true);        
    }
    
}
