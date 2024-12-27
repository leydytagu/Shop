package com.tienda.productos;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProductoRepository {
    private List<Producto> productos = new ArrayList<>();

    public void insertar(Producto producto) {
        productos.add(producto);
    }

    public List<Producto> listar() {
        return productos;
    }

    public Optional<Producto> actualizar(int id, Producto nuevoProducto) {
        for (Producto producto : productos) {
            if (producto.getId() == id) {
                producto.setNombre(nuevoProducto.getNombre());
                producto.setPrecio(nuevoProducto.getPrecio());
                return Optional.of(producto);
            }
        }
        return Optional.empty();
    }

    public boolean borrar(int id) {
        return productos.removeIf(producto -> producto.getId() == id);
    }
}
