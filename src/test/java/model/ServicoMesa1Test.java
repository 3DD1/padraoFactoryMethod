package model;

import factory.ServicoFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoMesa1Test {

    @Test
    void deveAnotarPedidoDoCliente(){
        ISERVICO servico = ServicoFactory.obterServico("Mesa1");
        assertEquals("X-burgue com fritas", servico.pedido());
    }
    @Test
    void deveReceberPedidoDoCliente(){
        ISERVICO servico = ServicoFactory.obterServico("Mesa1");
        assertEquals("Recebido na cozinha", servico.receber());
    }

    @Test
    void devePrepararPedidoDoCliente(){
        ISERVICO servico = ServicoFactory.obterServico("Mesa1");
        assertEquals("Pedido em preparo", servico.preprarar());
    }
    @Test
    void deveEntregarPedidoDoCliente(){
        ISERVICO servico = ServicoFactory.obterServico("Mesa1");
        assertEquals("Pedido Mesa 1 Entregue", servico.entregar());
    }
}