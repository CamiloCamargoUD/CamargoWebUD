package dto;

//<!-- CAMILO ANDRES CAMARGO GOMEZ -->

import java.io.Serializable;

public class Persona implements Serializable {

    private long identificacion;
    private String nombres;
    private String apellidos;
    private String telefono;
    private String correo;

    // getters y setters
    public long getIdentificacion() { return identificacion; }
    public void setIdentificacion(long identificacion) { this.identificacion = identificacion; }

    public String getNombres() { return nombres; }
    public void setNombres(String nombres) { this.nombres = nombres; }

    public String getApellidos() { return apellidos; }
    public void setApellidos(String apellidos) { this.apellidos = apellidos; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }
}