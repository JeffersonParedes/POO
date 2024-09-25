
package proyectofinal;

public class Profesor extends Persona{
     
    private String asignatura;
    private String disponibilidad;
    
    public Profesor(int codigo, String nombre, int edad, String asignatura, String disponibilidad) {
        super(codigo, nombre, edad);
       
        this.disponibilidad =disponibilidad;
        this.asignatura = asignatura;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public String getdisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }



    @Override
    public void mostrarInformacion() {
        System.out.println("Profesor: " + getNombre() + ", Código: " + getCodigo() + ", edad : " + getEdad() + ", Asignatura: " + asignatura + ", Disponibilidad:  " + disponibilidad );
    }
}
