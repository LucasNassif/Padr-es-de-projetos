package subsistema2.cep;

public class CepApi {
    private static CepApi instancia = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstancia() {
        return instancia;
    }
    public String recurperarCidade (String cep){
        return "Araraquara";
    }
    public String recurperarEstado (String cep){
        return "SP";
    }
}
