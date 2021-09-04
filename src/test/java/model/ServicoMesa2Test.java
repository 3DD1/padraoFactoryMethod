package model;

import factory.ServicoFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoMesa2Test {
    @Test
    void deveAnotarPedidoDoCliente(){
        ISERVICO servico = ServicoFactory.obterServico("Mesa2");
        assertEquals("X-Egg sem tomate, com coca-cola lata", servico.pedido());
    }
    @Test
    void deveReceberPedidoDoCliente(){
        ISERVICO servico = ServicoFactory.obterServico("Mesa2");
        assertEquals("Recebido na cozinha", servico.receber());
    }

    @Test
    void devePrepararPedidoDoCliente(){
        ISERVICO servico = ServicoFactory.obterServico("Mesa2");
        assertEquals("Pedido em preparo", servico.preprarar());
    }
    @Test
    void deveEntregarPedidoDoCliente(){
        ISERVICO servico = ServicoFactory.obterServico("Mesa2");
        assertEquals("Pedido Mesa 2 Entregue", servico.entregar());
    }

}