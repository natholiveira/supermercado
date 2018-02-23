package com.nathalia.supermercado.api;

import com.nathalia.supermercado.domain.Cliente;
import com.nathalia.supermercado.domain.ItemVenda;
import com.nathalia.supermercado.domain.Produto;
import com.nathalia.supermercado.domain.Venda;
import com.nathalia.supermercado.input.CompraInput;
import com.nathalia.supermercado.input.ItemInput;
import com.nathalia.supermercado.input.wrapper.CompraInputWrapper;
import com.nathalia.supermercado.repository.ClienteRepository;
import com.nathalia.supermercado.repository.ItemVendaRepository;
import com.nathalia.supermercado.repository.MercadoriaRepository;
import com.nathalia.supermercado.repository.ProdutoRepository;
import com.nathalia.supermercado.validation.MercadoExists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompraAPI {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private ItemVendaRepository itemVendaRepository;

    @Autowired
    private MercadoriaRepository mercadoriaRepository;

    @PostMapping("/compras")
    public ResponseEntity<?> comprar(@RequestBody @Validated CompraInputWrapper compraInputWrapper, BindingResult bindingResult) {

        if(bindingResult.hasErrors()){
            return new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);
        }

        for (ItemInput itemInput : compraInputWrapper.getCompra().getItens()) {
            boolean mercadoriaExiste = mercadoriaRepository.existsByProduto_idAndMercado_id(itemInput.getProduto(), itemInput.getMercado());

            if (!mercadoriaExiste) {
                return new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);
            }
        }

        Cliente cliente = new Cliente();
        cliente.setNome(compraInputWrapper.getCompra().getCliente());

        cliente = clienteRepository.save(cliente);

        Venda venda = new Venda();
        venda.


        return new ResponseEntity<Void>(HttpStatus.OK);
    }


}
