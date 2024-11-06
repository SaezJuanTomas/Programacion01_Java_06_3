import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Ejercicio 1");
            System.out.println("2. Ejercicio 2");
            System.out.println("3. Salir");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ejercicio 1...");
                    HashMap<String, Long> agenda = new HashMap<String, Long>();
                    boolean continuar = true;
                    while (continuar) {
                        System.out.println("Seleccione una opción para la agenda:");
                        System.out.println("1. Agregar contacto");
                        System.out.println("2. Buscar contacto");
                        System.out.println("3. Listar agenda");
                        System.out.println("4. Volver al menú principal");
                        System.out.print("Opción: ");
                        int opcionAgenda = scanner.nextInt();

                        switch (opcionAgenda) {
                            case 1:
                                System.out.print("Ingrese el nombre del contacto: ");
                                String nombre = scanner.nextLine();
                                System.out.print("Ingrese el número del contacto: ");
                                Long numero = scanner.nextLong();
                                agenda.put(nombre, numero);
                                System.out.println("Contacto agregado.");
                                break;

                            case 2:
                                System.out.print("Ingrese el nombre del contacto a buscar: ");
                                nombre = scanner.nextLine();
                                if (agenda.containsKey(nombre)) {
                                    System.out.println("Número: " + agenda.get(nombre));
                                } else {
                                    System.out.println("Contacto no encontrado.");
                                }
                                break;

                            case 3:
                                System.out.print("Agenda listada: ");
                                for (String key : agenda.keySet()) {
                                    System.out.println(key + ": " + agenda.get(key));
                                }
                                break;

                            case 4:
                                continuar = false;
                                break;

                            default:
                                System.out.println("Opción no válida. Intente nuevamente.");
                                break;
                        }
                    }
                    break;

                case 2:
                    System.out.println("Ejercicio 2...");
                    
                    boolean cargarComputadora = true;

                    while (cargarComputadora) {
                        System.out.print("Ingrese la marca de la computadora: ");
                        String marca = scanner.next();
                        System.out.print("Ingrese el modelo de la computadora: ");
                        String modelo = scanner.next();

                        System.out.print("Ingrese la cantidad de componentes: ");
                        int cantidadComponentes = scanner.nextInt();
                        scanner.nextLine(); // Consume newline

                        
                        double totalPrecio = 0;
                        for (int i = 0; i < cantidadComponentes; i++) {
                            System.out.print("Ingrese el nombre del componente: ");
                            String componente = scanner.nextLine();
                            System.out.print("Ingrese la marca del componente: ");
                            String marcaComponente = scanner.nextLine();
                            System.out.print("Ingrese la cantidad del componente: ");
                            int cantidad = scanner.nextInt();
                            System.out.print("Ingrese el precio del componente: ");
                            double precio = scanner.nextDouble();
                            scanner.nextLine(); // Consume newline

                            totalPrecio += cantidad * precio;
                            System.out.println("Componente: " + componente + ", Marca: " + marcaComponente + ", Cantidad: " + cantidad + ", Precio: " + precio);
                        }

                        System.out.println("Precio total de la computadora " + marca + " " + modelo + ": " + totalPrecio);
                        

                        double precioVentaSugerido;
                        if (totalPrecio < 50000) {
                            precioVentaSugerido = totalPrecio + (totalPrecio * 0.40);
                        } else {
                            precioVentaSugerido = totalPrecio + (totalPrecio * 0.30);
                        }
                        System.out.println("Precio de venta sugerido para la computadora " + marca + " " + modelo + ": " + precioVentaSugerido);
                        
                        
                        System.out.print("¿Desea cotizar una nueva computadora? (SI/NO): ");
                        String respuesta = scanner.next();
                        cargarComputadora = respuesta.equalsIgnoreCase("SI");
                    }
                    break;

                case 3:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    break;
            }
        } while (opcion != 3);

        scanner.close();
    }
}
