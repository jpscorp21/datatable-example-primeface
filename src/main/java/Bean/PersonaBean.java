
package Bean;

import Models.Persona;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class PersonaBean {
    
    public static List<Persona> lista = new ArrayList<Persona>();
    

    public List<Persona> getLista() {
        return lista;
    }

    public void setLista(List<Persona> lista) {
        this.lista = lista;
    }
    
    //Poblar datos
    public void listar() {
        Persona p1 = new Persona("Jean", 23);          
        lista.add(p1);
        p1 = new Persona("Paul", 17);
        lista.add(p1);
        p1 = new Persona("Diego", 18);
        lista.add(p1);        
        
    }
    
}
