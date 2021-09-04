package model;

public class ServicoMesa1 implements ISERVICO{
    public String pedido(){
        return("X-burgue com fritas");
    }

    public String receber(){
        return("Recebido na cozinha");
    }
    public String preprarar(){
        return("Pedido em preparo");
    }

    public String entregar(){
        return("Pedido Mesa 1 Entregue");
    }
}
