
public class App {
//variables globales de la clase
   static String nombre_estudiante = "Sebastian";
   static int edad = 17;
   static float peso = 64.5f;
   static boolean estudiante_activo = true;
   static String texto_estudiante_activo = "";
public static void main(String[] args) {
    if(estudiante_activo){
        texto_estudiante_activo="si";
    }else{
        texto_estudiante_activo="no";
    }
    System.out.println(nombre_estudiante);
    System.out.println(texto_estudiante_activo+"\n\n"+"Mi nombre es: "+nombre_estudiante+"\n"+"Mi edad es: "+edad+"\n"+"Mi peso: "+peso);
    App app = new App();   
}   


}