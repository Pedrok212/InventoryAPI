package dev.pedrok.inventoryapi.Estoque;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstoqueService {
    
    private EstoqueRepository estoqueRepository;

    public EstoqueService(EstoqueRepository estoqueRepository) {
        this.estoqueRepository = estoqueRepository;
    }

    //Listar todos produtos

    public List<EstoqueModel> listarProdutos(){

        return estoqueRepository.findAll();

    }


}
