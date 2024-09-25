/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal;

/**
 *
 * @author cliente
 */
class MaterialDeEstudio {
    private String titulo;
    private String descripcion;
    private String tipo;
    private String rutaArchivo;
    private Date fechaSubida;
    
public MaterialDeEstudio(String titulo, String descripcion, String tipo, String rutaArchivo, Date fechaSubida){
    this.titulo = titulo;
    this.descripcion = descripcion;
    this.tipo = tipo;
    this.rutaArchivo = rutaArchivo;
    this.fechaSubida = fechaSubida;
}
            
 public void subirMaterial() {
        System.out.println("Subiendo material: " + titulo + " del tipo " + tipo + " a la ruta " + rutaArchivo);
    }

    public void actualizarMaterial() {
        System.out.println("Actualizando material: " + titulo + " con nueva información.");
    }

    public void eliminarMaterial() {
        System.out.println("Eliminando material: " + titulo);
    }

    public void descargarMaterial() {
        System.out.println("Descargando material: " + titulo + " desde la ruta " + rutaArchivo);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getRutaArchivo() {
        return rutaArchivo;
    }

    public void setRutaArchivo(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
    }

    public Date getFechaSubida() {
        return fechaSubida;
    }

    public void setFechaSubida(Date fechaSubida) {
        this.fechaSubida = fechaSubida;
    }

}
