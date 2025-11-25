//VINICIO RUIZ Y ANDRES SIGCHA

import java.util.ArrayList;
import java.util.List;

public class Inventario{

    List<Producto> inventario;

    public Inventario() {
        inventario = new ArrayList<Producto>();
        predefinir();
    }

    public void predefinir() {
        Producto p1 = new Producto(4, "TECLADO MECANICO", "TECLADO", 1);
        Producto p2 = new Producto(1, "TARJETA GRAFICA", "GRAFICA", 6);
        Producto p3 = new Producto(7, "MONITOR GAMER", "MONITOR", 3);
        Producto p4 = new Producto(3, "PROCESADOR I7", "PROCESADOR", 2);
        Producto p5 = new Producto(2, "TECLADO OFICINA", "TECLADO", 5);
        Producto p6 = new Producto(9, "MONITOR OFFICE", "MONITOR", 4);

        inventario.add(p1);
        inventario.add(p2);
        inventario.add(p3);
        inventario.add(p4);
        inventario.add(p5);
        inventario.add(p6);
    }

    public List<Producto> todos() {
        return inventario;
    }

    public boolean agregar(Producto producto) {
        if (buscarLinealPorId(producto.getId()) != null) {
            return false;
        }
        inventario.add(producto);
        return true;
    }

    public Producto buscarLinealPorId(int id) {
        for (Producto p : inventario) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public List<Producto> buscarPorCategoria(String categoria) {
        List<Producto> lista = new ArrayList<Producto>();
        for (Producto p : inventario) {
            if (p.getCategoria().equalsIgnoreCase(categoria)) {
                lista.add(p);
            }
        }
        return lista;
    }

    public void ordenarPorId() {
        Producto aux;
        for (int i = 0; i < inventario.size() - 1; i++) {
            for (int j = i + 1; j < inventario.size(); j++) {
                if (inventario.get(i).getId() > inventario.get(j).getId()) {
                    aux = inventario.get(i);
                    inventario.set(i, inventario.get(j));
                    inventario.set(j, aux);
                }
            }
        }
    }

    public List<Producto> ordenarPorCantidadCategoria(String categoria) {
        List<Producto> lista = buscarPorCategoria(categoria);
        Producto aux;
        for (int i = 0; i < lista.size() - 1; i++) {
            for (int j = i + 1; j < lista.size(); j++) {
                if (lista.get(i).getCantidad() < lista.get(j).getCantidad()) {
                    aux = lista.get(i);
                    lista.set(i, lista.get(j));
                    lista.set(j, aux);
                }
            }
        }
        return lista;
    }

    public Producto buscarMayorCantidad() {
        if (inventario.isEmpty()) {
            return null;
        }
        Producto mayor = inventario.get(0);
        for (int i = 1; i < inventario.size(); i++) {
            if (inventario.get(i).getCantidad() > mayor.getCantidad()) {
                mayor = inventario.get(i);
            }
        }
        return mayor;
    }
}