import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Metodos {
    Scanner sc = new Scanner(System.in);
    int contadorturno = 1;

    public void tomarturno(Queue<objCliente> colacliente2) {
        Queue<objCliente> colacliente = new LinkedList<>();
        objCliente oc = new objCliente();
        System.out.println("Ingrese su Cedula");
        oc.setCedula(sc.nextInt());
        System.out.println("Ingrese su nombre");
        oc.setNom_Cliente(sc.next());
        oc.setTurno(contadorturno);
        contadorturno++;
        colacliente.offer(oc);

    }

    public void verturnos(Queue<objCliente> colacliente) {
        for (objCliente o : colacliente) {
            System.out.println("Nombre del Cliente: " + o.getNom_Cliente());
            System.out.println("Cedula del Cliente: " + o.getCedula());
            System.out.println("Turno#" + o.getTurno());

        }

    }

    public Queue<objArticulo> agregararticulo() {
        objArticulo oa = new objArticulo();
        Queue<objArticulo> colaproductos = new LinkedList<>();
        System.out.println("Ingrese el ID del Articulo");
        int idingresado = sc.nextInt();
        System.out.println("Ingrese las existencias a añadir");
        int cantidadañadir = sc.nextInt();
        for (objArticulo o : colaproductos) {
            if (idingresado == o.getIdArticulo()) {
                int nuevaexistencia = o.getExistencias() + cantidadañadir;
                o.setExistencias(nuevaexistencia);
                System.out.println("Stock de Articulo " + idingresado + " actualizado a " + nuevaexistencia);
                break;
            }
        }
        oa.setExistencias(cantidadañadir);
        System.out.println("Ingrese el nombre del Articulo");
        oa.setNomArticulo(sc.next());
        System.out.println("Ingrese la categoria en letras\n1. Carnicos\n2. Legumbre\n3. Otros");
        while (!sc.hasNextInt()) {
            System.out.println("Ingrese un numero\\n1. Carnicos\\n2. Legumbre\\n3. Otros");
            sc.next();
        }
        System.out.println("Ingrese el precio del Articulo");
        oa.setPrecio(sc.nextDouble());
        oa.setCategoria(sc.next());
        oa.setEstado(0);
        colaproductos.offer(oa);
        return colaproductos;
    }

    public void verinventario(Queue<objArticulo> colaproductos) {
        for (objArticulo o : colaproductos) {
            System.out.println("ID del Articulo: " + o.getIdArticulo());
            System.out.println("Nombre del Articulo: " + o.getNomArticulo());
            System.out.println("Categoria del Articulo" + o.getCategoria());
            System.out.println("Existencias del Articulo" + o.getExistencias());
            if (o.getEstado() == 0) {
                System.out.println("Estado: Activo");
            } else {
                System.out.println("Estado: Inactivo");
            }

        }
    }

    public void eliminararticulo(Queue<objArticulo> colaproductos) {
        System.out.println("Ingrese el ID del Articulo a eliminar");
        int ideliminar = sc.nextInt();
        for (objArticulo o : colaproductos) {
            if (ideliminar == o.getIdArticulo()) {
                o.setEstado(1);
                System.out.println("Articulo " + ideliminar + " eliminado");
                break;
            }
        }
    }

    public void despacharturno(Queue<objCliente> colacliente, Queue<objArticulo> colaproductos) {
        objArticulo ca = new objArticulo();
        if (colacliente.isEmpty()) {
            System.out.println("No hay clientes en la cola");
        } else {
            System.out.println("Elija  ID del articulo");
            verinventario(colaproductos);
            int idarticulo = sc.nextInt();
            System.out.println("Elija la cantidad a comprar");
            while (sc.nextInt() > ca.getExistencias()) {
                System.out.println("No hay suficientes existencias");
                sc.next();
            }
            for (objArticulo o : colaproductos) {
                if (idarticulo == o.getIdArticulo()) {
                    Double total = ca.getPrecio() * sc.nextInt();
                    System.out.println("Total a pagar: " + total);
                    break;
                }
                
            }
            
            colacliente.poll();
        }
        
    }

}
