package factory;

import model.ISERVICO;

public class ServicoFactory {
    public static ISERVICO obterServico(String servico){
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("model.Servico" + servico);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Serviço inexistente");
        }
        if (!(objeto instanceof ISERVICO)) {
            throw new IllegalArgumentException("Serviço inválido");
        }
        return (ISERVICO) objeto;
    }
}
