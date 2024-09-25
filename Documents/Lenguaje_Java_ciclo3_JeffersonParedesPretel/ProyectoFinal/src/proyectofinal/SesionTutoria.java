
package proyectofinal;

class SesionTutoria {
    private String materia;
    private Date fechaHora;
    private String estado;
    private String detalles;
    
 public SesiondeTutoria(String materia, Date fechaHora, String estado, String detalles) {
        this.materia = materia;
        this.fechaHora = fechaHora;
        this.estado = estado;
        this.detalles = detalles;
    }

  public void programarSesion() {
        System.out.println("Programando sesión de tutoría para " + materia + " el " + fechaHora);
    }

    public void cancelarSesion() {
        System.out.println("Cancelando sesión de tutoría para " + materia);
        estado = "Cancelada";
    }

    public void completarSesion() {
        System.out.println("Sesión de tutoría para " + materia + " completada.");
        estado = "Completada";
    }

    public void actualizarDetalles() {
        System.out.println("Actualizando detalles de la sesión de tutoría para " + materia);
    }

     @Override
    public void mostrarInformacion() {
        System.out.println("Sesión de Tutoría: Materia: " + materia + ", Fecha y Hora: " + fechaHora + ", Estado: " + estado + ", Detalles: " + detalles);
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }
        
}
