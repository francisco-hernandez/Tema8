class Persona {
    private int Edad;
    private String Nombre;
    private String Telefono;

    /*Set y Get de todas las variables*/
    public void setEdad(int Edad){
        this.Edad = Edad;
    }

    public int getEdad(){
        return(this.Edad);
    }
    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }
    public String getNombre(){
        return (this.Nombre);
    }
    public void setTelefono(String Telefono){
        this.Telefono = Telefono;
    }
    public String getTelefono(){
        return (this.Telefono);
    }



}
public class Main {
    public static void main(String[] args) {
        Persona persona; //Declaramos una variable de la clase Persona;
        persona = new Persona(); //Instanciamos la clase persona;
        persona.setEdad(20);
        persona.setNombre("Francisco");
        persona.setTelefono("6325585");
        System.out.println(persona.getEdad());
        System.out.println(persona.getNombre());
        System.out.println(persona.getTelefono());
    }
}
