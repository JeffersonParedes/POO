
package proyectofinal;

public class Persona {
    private int codigo;
    private String nombre;
    private int edad;
    // Constructor
    public Persona(int codigo, String nombre, int edad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }




    // Método abstracto
    public abstract void mostrarInformacion();
    //Aca escribimos
    public static void main(String[] args) {
     Alumno alumno = new Alumno(1,"Yemmi",17,20);
     alumno.mostrarInformacion();
     
     Profesor profesor = new Profesor(2,"Heiner",50,"Ingeniero","Lunes a Viernes");
     profesor.mostrarInformacion();
     
     Administracion administracion = new Administracion(3,"Jose",30,"2024-09-25","Gestion de Redes","Sistemas");
     administracion.mostrarInformacion();
     
        
    }
}
