package Entidades;

/**
 * Created by alexs on 10/01/2018.
 */

public class HasRedeCredenciada  implements EntidadePersistivel {

    private int Operadora_idOperadora;
    private int rede_credenciada_idrede_credenciada;
    private int Operadora_idPlano;
    private int Operadora_idPlano1;
    private int Operadora_idIdades;

    public HasRedeCredenciada  () {
    }

    public HasRedeCredenciada(int operadora_idOperadora, int rede_credenciada_idrede_credenciada, int operadora_idPlano, int operadora_idPlano1, int operadora_idIdades) {
        Operadora_idOperadora = operadora_idOperadora;
        this.rede_credenciada_idrede_credenciada = rede_credenciada_idrede_credenciada;
        Operadora_idPlano = operadora_idPlano;
        Operadora_idPlano1 = operadora_idOperadora;
        Operadora_idIdades = operadora_idIdades;
    }

    public int getOperadora_idOperadora() {
        return Operadora_idOperadora;
    }

    public void setOperadora_idOperadora(int operadora_idOperadora) {
        Operadora_idOperadora = operadora_idOperadora;
    }

    public int getRede_credenciada_idrede_credenciada() {
        return rede_credenciada_idrede_credenciada;
    }

    public void setRede_credenciada_idrede_credenciada(int rede_credenciada_idrede_credenciada) {
        this.rede_credenciada_idrede_credenciada = rede_credenciada_idrede_credenciada;
    }

    public int getOperadora_idPlano() {
        return Operadora_idPlano;
    }

    public void setOperadora_idPlano(int operadora_idPlano) {
        Operadora_idPlano = operadora_idPlano;
    }

    public int getOperadora_idPlano1() {
        return Operadora_idPlano1;
    }

    public void setOperadora_idPlano1(int operadora_idPlano1) {
        Operadora_idPlano1 = operadora_idPlano1;
    }

    public int getOperadora_idIdades() {
        return Operadora_idIdades;
    }

    public void setOperadora_idIdades(int operadora_idIdades) {
        Operadora_idIdades = operadora_idIdades;
    }

    @Override
    public int getId() {
        return getOperadora_idOperadora();
    }

    @Override
    public void setId(int id) {

    }

    @Override
    public String toString() {
        return "HasRedeCredenciada{" +
                "Operadora_idOperadora=" + Operadora_idOperadora +
                ", rede_credenciada_idrede_credenciada=" + rede_credenciada_idrede_credenciada +
                ", Operadora_idPlano=" + Operadora_idPlano +
                ", Operadora_idPlano1=" + Operadora_idPlano1 +
                ", Operadora_idIdades=" + Operadora_idIdades +
                '}';
    }
}
