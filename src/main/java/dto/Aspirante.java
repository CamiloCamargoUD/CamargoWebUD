//<!-- CAMILO ANDRES CAMARGO GOMEZ -->

package dto;

// Autor: Camilo Camargo

import java.time.LocalDate;

public class Aspirante extends Persona {

    private LocalDate fechaRegistro;
    private String programa;

    public LocalDate getFechaRegistro() { return fechaRegistro; }
    public void setFechaRegistro(LocalDate fechaRegistro) { this.fechaRegistro = fechaRegistro; }

    public String getPrograma() { return programa; }
    public void setPrograma(String programa) { this.programa = programa; }
}