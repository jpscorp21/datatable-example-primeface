/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;


/**
 *
 * @author dell
 */
public class BasicPhaseListener implements PhaseListener {
    
    public void beforePhase(PhaseEvent pe) {
        FacesContext context = FacesContext.getCurrentInstance();        
        if (pe.getPhaseId() == PhaseId.RESTORE_VIEW)
            context.addMessage(null, new FacesMessage("Procesando una nueva peticion!"));
        context.addMessage(null, new FacesMessage("Antes de - " + pe.getPhaseId().toString()));
    }
    
    public void afterPhase(PhaseEvent pe) {
        FacesContext context = FacesContext.getCurrentInstance();
    context.addMessage(
      null, 
      new FacesMessage("despues de - " + pe.getPhaseId().toString())
    );
     
    if (pe.getPhaseId() == PhaseId.RENDER_RESPONSE)
      context.addMessage(
        null, 
        new FacesMessage("Peticion terminada!")
      );
    }
    
    public PhaseId getPhaseId() {
        return PhaseId.ANY_PHASE;
    }
}
