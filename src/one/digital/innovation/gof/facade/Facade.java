package one.digital.innovation.gof.facade;

import subsistema1.crm.CrmService;
import subsistema2.cep.CepApi;

public class Facade {
    public void migrarCliente(String nome, String cep){
        String cidade = CepApi.getInstancia().recurperarCidade(cep);
        String estado = CepApi.getInstancia().recurperarEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);
    }

}
