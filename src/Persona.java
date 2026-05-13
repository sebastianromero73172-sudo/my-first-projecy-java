//estudiante y asi
public class Persona{
    static String nombre_persona = "Sebastian";
    static String apellidos_persona = "Romero Ramos";
    static int edad = 17;
    char genero= 'F';
    static float promedio_semestre=0f;
    boolean vive_manizales=true;

    static void imprimirNombre(){
        System.out.println("Informacion del estudiante:\nNombre completo: " + nombre_persona + " " + apellidos_persona );
    }
    static void imprimirEdad(){
        System.out.println("Edad: "+ edad);
    }
    static void imprimirPromedio(){
        System.out.println("Promedio del semestre: "+ promedio_semestre);
    }
    static void imprimirCiudad(){
        if(vive_manizales){
            System.out.println("vive en Manizales");
        }else{
            System.out.println("no vive en Manizales");
        }
    }
    public static void main(String[]args){
        imprimirNombre();
        imprimirEdad();
        imprimirPromedio();
    }
}