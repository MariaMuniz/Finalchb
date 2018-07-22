package Entidades;
public class RedeCredenciada implements EntidadePersistivel {

    private int idrede_credenciada;
    private String nome_rede;
    private String cidade;


    public RedeCredenciada() {
    }

    public RedeCredenciada(int idrede_credenciada, String nome_rede, String cidade) {
        this.idrede_credenciada = idrede_credenciada;
        this.nome_rede = nome_rede;
        this.cidade = cidade;
    }

    public int getIdrede_credenciada() {
        return idrede_credenciada;
    }

    public void setIdrede_credenciada(int idrede_credenciada) {
        this.idrede_credenciada = idrede_credenciada;
    }

    public String getNome_rede() {
        return nome_rede;
    }

    public void setNome_rede(String nome_rede) {
        this.nome_rede = nome_rede;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public int getId() {
        return getIdrede_credenciada();
    }

    @Override
    public void setId(int id) {

    }

    @Override
    public String toString() {
        return "RedeCredenciada{" +
                "idrede_credenciada=" + idrede_credenciada +
                ", nome_rede='" + nome_rede + '\'' +
                ", cidade='" + cidade + '\'' +
                '}';
    }
}





