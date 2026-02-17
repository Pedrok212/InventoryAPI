package dev.pedrok.inventoryapi.Estoque;

import org.springframework.web.bind.annotation.*;

@RequestMapping
@RestController
public class EstoqueController {

    @GetMapping("/boasVindas")
    @PostMapping
    @PutMapping
    @DeleteMapping
    public String boasVindas() {
        return "Primeira mensagem na rota";
    }

}
