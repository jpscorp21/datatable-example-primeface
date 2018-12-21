
package Bean;

import Models.Ciudad;
import Models.Pais;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import org.primefaces.event.SelectEvent;
import org.primefaces.event.UnselectEvent;

@ManagedBean
@ViewScoped
public class PaisBean {

    public static List<Pais> paises = new ArrayList<Pais>(); 
    public static List<Ciudad> ciudades = new ArrayList<Ciudad>();              
    private Pais selectedPais;
    
    private boolean ocultarDetalle = false;               

    public boolean isOcultarDetalle() {
        return ocultarDetalle;
    }

    public void setOcultarDetalle(boolean ocultarDetalle) {
        this.ocultarDetalle = ocultarDetalle;
    }

    public Pais getSelectedPais() {
        return selectedPais;
    }

    public void setSelectedPais(Pais selectedPais) {
        this.selectedPais = selectedPais;
    }

    public List<Pais> getPaises() {
        return paises;
    }   

    public static void setPaises(List<Pais> paises) {
        PaisBean.paises = paises;
    }    
    
    public List<Ciudad> getCiudades() {
        return ciudades;
    }
    
    public static void setCiudades(List<Ciudad> ciudades) {
        PaisBean.ciudades = ciudades;
    }               
        
    public void listar() {                        
        
        List<Ciudad> ciudades2 = new ArrayList();
        ciudades2.add(new Ciudad(1, "Asunción", 1));
        ciudades2.add(new Ciudad(2, "Caacupe", 1));
        ciudades2.add(new Ciudad(3, "Piribebuy", 1));                
        paises.add(new Pais(1, "Paraguay", "Asuncion", ciudades2));                                
        ciudades2 = new ArrayList();
        ciudades2.add(new Ciudad(1, "Formosa", 1));
        ciudades2.add(new Ciudad(2, "Buenos Aires", 1));
        ciudades2.add(new Ciudad(3, "Tigre", 1));              
        paises.add(new Pais(2, "Argentina", "Buenos Aires", ciudades2));        
        ciudades2 = new ArrayList();
        ciudades2.add(new Ciudad(1, "Lyon", 1));
        ciudades2.add(new Ciudad(2, "Marsella", 1));
        ciudades2.add(new Ciudad(3, "Paris", 1));             
        paises.add(new Pais(3, "Francia", "Paris", ciudades2));        
        ciudades2 = new ArrayList();
        ciudades2.add(new Ciudad(1, "Cork", 1));
        ciudades2.add(new Ciudad(2, "Dublin", 1));
        ciudades2.add(new Ciudad(3, "Galway", 1));  
        paises.add(new Pais(4, "Irlanda", "Dublin", ciudades2));        
        ciudades2 = new ArrayList();
        ciudades2.add(new Ciudad(1, "Vancouver", 1));
        ciudades2.add(new Ciudad(2, "Toronto", 1));
        ciudades2.add(new Ciudad(3, "Montreal", 1));  
        paises.add(new Pais(5, "Canada", "Otawa", ciudades2));        
        ciudades2 = new ArrayList();
        ciudades2.add(new Ciudad(1, "Caracas", 1));
        ciudades2.add(new Ciudad(2, "Maracaibo", 1));
        ciudades2.add(new Ciudad(3, "Valencia", 1));  
        paises.add(new Pais(6, "Venezuela", "Caracas", ciudades2));        
        ciudades2 = new ArrayList();
        ciudades2.add(new Ciudad(1, "Venecia", 1));
        ciudades2.add(new Ciudad(2, "Florencia", 1));
        ciudades2.add(new Ciudad(3, "Milan", 1));  
        paises.add(new Pais(7, "Italia", "Roma", ciudades2));
        ciudades2 = new ArrayList();
        ciudades2.add(new Ciudad(1, "La Haya", 1));
        ciudades2.add(new Ciudad(2, "Roterdam", 1));
        ciudades2.add(new Ciudad(3, "Amsterdam", 1));  
        paises.add(new Pais(8, "Holanda", "Amsterdam", ciudades2));                
        
    }
    
    public void vaciar() {
        paises.removeAll(paises);
    }
    
    public void onRowSelect(SelectEvent event) {   
        this.ocultarDetalle = true;           
        FacesMessage msg = new FacesMessage("Pais Seleccionado", ((Pais) event.getObject()).getPais());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
    
    public void mostrarMensaje(SelectEvent event, String texto) {
        FacesMessage msg = new FacesMessage(texto, ((Pais) event.getObject()).getPais());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
    
    public void onRowUnselect(UnselectEvent event) {
        FacesMessage msg = new FacesMessage("Pais Unselected", ((Pais) event.getObject()).getPais());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
    
}
