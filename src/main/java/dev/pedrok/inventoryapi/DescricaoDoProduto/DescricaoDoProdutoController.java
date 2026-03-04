package dev.pedrok.inventoryapi.DescricaoDoProduto;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("descricao")
public class DescricaoDoProdutoController {


}

//POST -- mandar requisição pra criar uma descrição
    @PostMapping("/criar")
    public String criarDescricao() {
        return "Descrição criada com sucesso";
    }

    // PUT -- Mandar uma requisição para alterar
        @PutMapping("/alterar")
        public String alterarDescricao() {
            return "Descrição alterada com sucesso";
        }

        //DELETE -- mandar uma requisição para deletar a descrição atual

        @DeleteMapping("/delete")
        public String deletarDescricao() {
            return "Descrição deletar com sucesso";
        }


        //GET - mandar requisição pra mostrar as descrições, nao faz muito sentido, refatore
        @GetMapping("/listar")

        public String listarDescricao(){
            return "Descrição listada com sucesso";
}
