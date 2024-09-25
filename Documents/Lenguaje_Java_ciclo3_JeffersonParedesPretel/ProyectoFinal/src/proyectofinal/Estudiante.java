
package proyectofinal;

public class Estudiante extends Persona {
    private int tutoriasTomadas;

    public Estudiante(int codigo, String nombre, int edad, int tutoriasTomadas) {
        super(codigo, nombre,edad);
        this.tutoriasTomadas = tutoriasTomadas;
    }

    public int getTutoriasTomadas() {
        return tutoriasTomadas;
    }

    public void setTutoriasTomadas(int TutoriasTomadas) {
        this.tutoriasTomadas = TutoriasTomadas;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Alumno: " + getNombre() + ", Código: " + getCodigo() + ", edad : " + getEdad() +  " ,TutoriasTomadas: " + tutoriasTomadas);
    }
}
    
}
