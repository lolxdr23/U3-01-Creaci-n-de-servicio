package com.example.Trabajo.service;

import com.example.Trabajo.model.Producto;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductoService {

    private List<Producto> productos = Arrays.asList(
            new Producto(1, "Laptop", 1500),
            new Producto(2, "Mouse", 300),
            new Producto(3, "Teclado", 800),
            new Producto(4, "Monitor", 1200)
    );

    public List<Producto> obtenerTodos() {
        return productos;
    }

    public Producto obtenerPorId(int id) {
        return productos.stream()
                .filter(p -> p.getId()==id)
                .findFirst()
                .orElse(null);
    }
}