package org.example.appgestionfct;

public class Empresa {
    private Integer codEmpresa;
    private String cif;
    private String nombreEmpresa;
    private String direccion;
    private String codPostal;
    private String localidad;
    private Integer jornada;
    private Integer modalidad;
    private String email;
    private String dniResponsable;
    private String nombreResponsable;
    private String apellidosResponsable;
    private String dniTl;
    private String nombreTl;
    private String apellidosTl;
    private String tlfTl;

    public Empresa(Integer codEmpresa, String cif, String nombreEmpresa, String direccion, String codPostal, String localidad, Integer jornada, Integer modalidad, String email, String dniResponsable, String nombreResponsable, String apellidosResponsable, String dniTl, String nombreTl, String apellidosTl, String tlfTl) {
        this.codEmpresa = codEmpresa;
        this.cif = cif;
        this.nombreEmpresa = nombreEmpresa;
        this.direccion = direccion;
        this.codPostal = codPostal;
        this.localidad = localidad;
        this.jornada = jornada;
        this.modalidad = modalidad;
        this.email = email;
        this.dniResponsable = dniResponsable;
        this.nombreResponsable = nombreResponsable;
        this.apellidosResponsable = apellidosResponsable;
        this.dniTl = dniTl;
        this.nombreTl = nombreTl;
        this.apellidosTl = apellidosTl;
        this.tlfTl = tlfTl;
    }

    public Empresa() {
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public Integer getCodEmpresa() {return codEmpresa; }

    public void setCodEmpresa(Integer codEmpresa) {
        this.codEmpresa = codEmpresa;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(String cod_postal) {
        this.codPostal = cod_postal;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public Integer getJornada() {
        return jornada;
    }

    public void setJornada(Integer jornada) {
        this.jornada = jornada;
    }

    public Integer getModalidad() {
        return modalidad;
    }

    public void setModalidad(Integer modalidad) {
        this.modalidad = modalidad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDniResponsable() {
        return dniResponsable;
    }

    public void setDniResponsable(String dniResponsable) {
        this.dniResponsable = dniResponsable;
    }

    public String getNombreResponsable() {
        return nombreResponsable;
    }

    public void setNombreResponsable(String nombreResponsable) {
        this.nombreResponsable = nombreResponsable;
    }
    public String getApellidosResponsable() {
        return apellidosResponsable;
    }

    public void setApellidosResponsable(String apellidosResponsable) {
        this.apellidosResponsable = apellidosResponsable;
    }

    public String getDniTl() {
        return dniTl;
    }

    public void setDniTl(String dniTl) {
        this.dniTl = dniTl;
    }

    public String getNombreTl() {
        return nombreTl;
    }

    public void setNombreTl(String nombreTl) {
        this.nombreTl = nombreTl;
    }

    public String getApellidosTl() {
        return apellidosTl;
    }

    public void setApellidosTl(String apellidosTl) {
        this.apellidosTl = apellidosTl;
    }

    public String getTlfTl() {
        return tlfTl;
    }

    public void setTlfTl(String tlfTl) {
        this.tlfTl = tlfTl;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nombreEmpresa='" + nombreEmpresa + '\'' +
                ", codEmpresa=" + codEmpresa +
                ", cif='" + cif + '\'' +
                ", direccion='" + direccion + '\'' +
                ", codPostal='" + codPostal + '\'' +
                ", localidad='" + localidad + '\'' +
                ", jornada=" + jornada +
                ", modalidad=" + modalidad +
                ", email='" + email + '\'' +
                ", dniResponsable='" + dniResponsable + '\'' +
                ", nombreResponsable='" + nombreResponsable + '\'' +
                ", nombreTl='" + nombreTl + '\'' +
                ", dniTl='" + dniTl + '\'' +
                ", apellidosResponsable='" + apellidosResponsable + '\'' +
                ", apellidosTl='" + apellidosTl + '\'' +
                ", tlfTl='" + tlfTl + '\'' +
                '}';
    }

}
