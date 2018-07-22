package Entidades;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by alexs on 27/01/2018.
 */

public class Singleton {
    private static Singleton instance;
    public int idPlano = -1;
    public int idOperadora = -1;
    public int idProduto = -1;
    public String acomodacao = "Apartamento";
    public boolean cooparticipacao=false;

    private int qtds;
    private double resultados;
    private int qtdMaximaDePessoas;
    private boolean empresaGrande;

    public Singleton(){

    }

    public static Singleton getInstance()
    {
        if(instance==null)
            instance = new Singleton();

        return instance;
    }

    public int getIdPlano() {
        return idPlano;
    }

    public void setIdPlano(int idPlano) {
        this.idPlano = idPlano;
    }

    public int getIdOperadora() {
        return idOperadora;
    }

    public void setIdOperadora(int idOperadora) {
        this.idOperadora = idOperadora;
        setAcomodacao("Enfermaria");
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getAcomodacao() {
        return acomodacao;
    }

    public void setAcomodacao(String acomodacao) {
        this.acomodacao = acomodacao;
    }

    public boolean isCooparticipacao() {
        return cooparticipacao;
    }

    public void setCooparticipacao(boolean cooparticipacao) {
        this.cooparticipacao = cooparticipacao;
    }

    public void escolheIdApartamentoOuIdEnfermaria(Context context,int idEnfermaria,int idApartamento) {
        if(Singleton.getInstance().getAcomodacao().equals("Enfermaria"))
        {
            Singleton.getInstance().setIdProduto(idEnfermaria);
        }
        else if(Singleton.getInstance().getAcomodacao().equals("Apartamento"))
        {
            Singleton.getInstance().setIdProduto(idApartamento);
        }
        else{
            toastMeu(context);
            return;
        }
    }
    public void toastMeu(Context context)
    {
        Toast.makeText(context,"Erro : tem que setar singleton Apartamento ou Enfermaria",Toast.LENGTH_LONG);
    }
    public void escolheIdCooparticipacaoOuIdNormal(Context context,int coop,int semcoop) {
        if(Singleton.getInstance().isCooparticipacao())
        {
            Singleton.getInstance().setIdProduto(coop);
        }
        else
        {
            Singleton.getInstance().setIdProduto(semcoop);
        }
        boolean erro = false;
        if(erro){
            toastMeu2(context);
            return;
        }
    }
    public void escolheIdCooparticipacaoAcomodacao(Context context,int aptcoop, int aptsem,int enfcoop,int enfsem) {
        if(Singleton.getInstance().isCooparticipacao())
        {
            if(Singleton.getInstance().getAcomodacao().equals("Enfermaria"))
            {
                Singleton.getInstance().setIdProduto(enfcoop);
            }
            else if(Singleton.getInstance().getAcomodacao().equals("Apartamento"))
            {
                Singleton.getInstance().setIdProduto(aptcoop);
            }
        }
        else
        {
            if(Singleton.getInstance().getAcomodacao().equals("Enfermaria"))
            {
                Singleton.getInstance().setIdProduto(enfsem);
            }
            else if(Singleton.getInstance().getAcomodacao().equals("Apartamento"))
            {
                Singleton.getInstance().setIdProduto(aptsem);
            }
        }
        boolean erro = false;
        if(erro){
            toastMeu2(context);
            return;
        }
    }

    public void toastMeu2(Context context)
    {
        Toast.makeText(context,"Erro : tem que setar cooparticapacao",Toast.LENGTH_LONG);
    }

    public void setQtds(int qtds) {
        this.qtds = qtds;
    }

    public void setResultados(double resultados) {
        this.resultados = resultados;
    }

    public int getQtds() {
        return qtds;
    }

    public double getResultados() {
        return resultados;
    }

    public void setQtdMaximaDePessoas(int qtd) {
        qtdMaximaDePessoas = qtd;
    }

    public int getQtdMaximaDePessoas() {
        return qtdMaximaDePessoas;
    }

    public void setEmpresaGrande(boolean empresaGrande) {
        this.empresaGrande = empresaGrande;
    }

    public boolean isEmpresaGrande() {
        return empresaGrande;
    }
}
