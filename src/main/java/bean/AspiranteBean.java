//<!-- CAMILO ANDRES CAMARGO GOMEZ -->
package bean;


import java.io.Serializable;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import dao.AspiranteDAO;
import dto.Aspirante;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;

@Named("asp")
@SessionScoped
public class AspiranteBean implements Serializable {

    private Aspirante aspirante = new Aspirante();
    private AspiranteDAO dao = new AspiranteDAO();

    private List<String> programas = Arrays.asList(
        "Ingeniería de Sistemas",
        "Ingeniería Industrial",
        "Matemática",
        "Administración de empresas",
        "Derecho",
        "Ingeniería Telemática"
    );

    public void registrar() {
        // Validar si ya existe un aspirante con la misma identificación
        if (dao.existe(aspirante.getIdentificacion())) {
            // Agregar mensaje de error
            FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage(FacesMessage.SEVERITY_ERROR,
                                 "Identificación duplicada",
                                 "Ya existe un aspirante registrado con la identificación " + aspirante.getIdentificacion()));
            return;  // No guardar
        }

        // Si no existe, proceder con el registro
        aspirante.setFechaRegistro(LocalDate.now());
        dao.guardar(aspirante);
        
        // Mensaje de éxito
        FacesContext.getCurrentInstance().addMessage(null,
            new FacesMessage(FacesMessage.SEVERITY_INFO,
                             "Registro exitoso",
                             "El aspirante ha sido registrado correctamente."));
        
        // Limpiar el formulario
        aspirante = new Aspirante();
    }

    public Aspirante getAspirante() { return aspirante; }
    public void setAspirante(Aspirante aspirante) { this.aspirante = aspirante; }

    public List<Aspirante> getLista(){
        return dao.listar();
    }

    public List<String> getProgramas() {
        return programas;
    }
}