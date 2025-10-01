
import java.util.Queue;
import java.util.Scanner;
public static void main(String[] args) {

    Metodos m = new Metodos();
    Queue<objArticulo> colaproductos = new LinkedList<>();
    Scanner sc = new Scanner(System.in);
    int opcion = 0;

    System.out.println("Menu de Opciones");
    System.out.println("1. Agregar Articulo");
    System.out.println("2. Ver Inventario");
    System.out.println("3. Eliminar Articulo");
    System.out.println("4. Comprar Articulo");
    System.out.println("5. Salir");
    opcion = sc.nextInt();
    switch (opcion) {
        case 1:
            colaproductos = m.agregararticulo();
            break;
        case 2:
            m.verinventario(colaproductos);
            break;
        case 3:
            m.eliminararticulo(colaproductos);
            break;
        case 5:
            System.out.println("Saliendo del programa");
            break;
        default:
            System.out.println("Opcion no valida");
    }
}
