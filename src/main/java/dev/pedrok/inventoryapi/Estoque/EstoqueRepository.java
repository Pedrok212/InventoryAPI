package dev.pedrok.inventoryapi.Estoque;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EstoqueRepository extends JpaRepository<EstoqueModel, Long> {
}
