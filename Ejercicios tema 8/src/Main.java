public class Main {
    public static void main(String[] args) {
        Persona nuevaPersona = new Persona();

        nuevaPersona.setEdad(22);

        nuevaPersona.setNombre("Federico");

        nuevaPersona.setTelefono(294931693);

        System.out.println(nuevaPersona.getEdad());

        System.out.println(nuevaPersona.getNombre());
        
        System.out.println(nuevaPersona.getTelefono());
    }
    static class Persona{
        private int edad;
        private String nombre;
        private int telefono;

        public void setEdad(int edad){
            this.edad = edad;
        }
        public void setNombre(String nombre){
            this.nombre = nombre;
        }
        public void setTelefono(int telefono){
            this.telefono = telefono;
        }

        public int getEdad() {
            return this.edad;
        }
        public String getNombre(){
            return this.nombre;
        }

        public int getTelefono() {
            return this.telefono;
        }
    }
}
/*Para practicar la encapsulación:

Crear clase Persona.

Crear variables las privadas edad, nombre y telefono de la clase Persona.

Crear gets y sets de cada propiedad.

Crear un objeto persona en el main.

Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, por último muéstralas por consola.*/