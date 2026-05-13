

public class Vehiculo {
    /*
        Atributos:marca, velocidad, encendido
        Metodos: encender(), apagar(),acelerar(),Frenar(), mostrarEstado
        */
        static String marca = "toyota";
        static int velocidad = 15;
        static boolean encendido  = false;

        static void mostrarEstado(){
            // Si la velocidad es mayor a 0, el carro debe estar encendido
            if (velocidad > 0) {
                encendido = true;
            } else {
                encendido = false;
            }
            
            System.out.println("Marca: " + marca);
            System.out.println("Velocidad: " + velocidad + " km/h");
            System.out.println("Estado: " + (encendido ? "Encendido" : "Apagado"));
        }
        
        static void encender(){
            encendido = true;
            velocidad = 15;
            System.out.println("Vehículo encendido");
        }
        
        static void acelerar(){
            if (encendido) {
                velocidad += 10;
                System.out.println("Acelerando... Nueva velocidad: " + velocidad + " km/h");
            } else {
                System.out.println("No se puede acelerar. El vehículo está apagado.");
            }
        }
        
        static void apagar(){
            encendido = false;
            velocidad = 0;
            System.out.println("Vehículo apagado");
        }
        
        public static void main(String[] args) {
            System.out.println("=== ESTADO INICIAL ===");
            mostrarEstado();
            
            System.out.println("\n=== ENCENDIENDO ===");
            encender();
            mostrarEstado();
            
            System.out.println("\n=== ACELERANDO ===");
            acelerar();
            mostrarEstado();
            
            System.out.println("\n=== ACELERANDO DE NUEVO ===");
            acelerar();
            mostrarEstado();
        }
    }