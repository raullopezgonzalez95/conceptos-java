public class Persona {
    
    private String nombre;
    private Stirng apellido;
    private int edad;

    public Persona(String nombre, String apellido, int edad) {
        
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    
    }

    public Stirng getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public int getEdad() { return edad; } 

}