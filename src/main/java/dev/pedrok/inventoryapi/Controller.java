package dev.pedrok.inventoryapi;

import org.springframework.web.bind.annotation.*;

@RequestMapping
@RestController
public class Controller {

    @GetMapping("/boasVindas")
    @PostMapping
    @PutMapping
    @DeleteMapping
    public String boasVindas() {
        return "Primeira mensagem na rota";
    }

}
