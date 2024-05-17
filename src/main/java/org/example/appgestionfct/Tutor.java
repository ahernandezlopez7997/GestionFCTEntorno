package org.example.appgestionfct;

public class Tutor {
    private String nombre;
    private String apellidos;
    private String dni;
    private String email;
    private String tlf;
    private String codTutor;

    public Tutor(String nombre, String apellidos, String dni, String email, String tlf, String codTutor) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.email = email;
        this.tlf = tlf;
        this.codTutor = codTutor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTlf() {
        return tlf;
    }

    public void setTlf(String tlf) {
        this.tlf = tlf;
    }

    public String getCodTutor() {
        return codTutor;
    }

    public void setCodTutor(String codTutor) {
        this.codTutor = codTutor;
    }

    public String toString() {
        return "Tutor{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", dni='" + dni + '\'' +
                ", email='" + email + '\'' +
                ", tlf='" + tlf + '\'' +
                ", codTutor='" + codTutor + '\'' +
                '}';
    }
}
