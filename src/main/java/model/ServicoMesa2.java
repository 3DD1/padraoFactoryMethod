package model;

public class ServicoMesa2 implements ISERVICO{
    public String pedido(){
        return("X-Egg sem tomate, com coca-cola lata");
    }

    public String receber(){
        return("Recebido na cozinha");
    }
    public String preprarar(){
        return("Pedido em preparo");
    }

    public String entregar(){
        return("Pedido Mesa 2 Entregue");
    }
}
