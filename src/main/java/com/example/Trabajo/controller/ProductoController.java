package com.example.Trabajo.controller;

import com.example.Trabajo.model.Producto;
import com.example.Trabajo.service.ProductoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {

    private final ProductoService productoService;

    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }


    @GetMapping
    public List<Producto> listarProductos() {
        return productoService.obtenerTodos();
    }


    @GetMapping("/{id}")
    public Producto obtenerProducto(@PathVariable int id) {
        return productoService.obtenerPorId(id);
    }
}