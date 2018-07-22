package Entidades;

/**
 * Created by alexs on 10/01/2018.
 */

public class Produto implements EntidadePersistivel {

    private int idProduto;
    private String nomeProdutol;
    private int idPlano;
    private int idOperadora;
    private int idIdades;

    public Produto() {
}

    public Produto(int idProduto, String nomeProdutol, int idPlano, int idOperadora, int idIdades) {
        super();
        this.idProduto = idProduto;
        this.nomeProdutol = nomeProdutol;
        this.idPlano = idPlano;
        this.idOperadora = idOperadora;
        this.idIdades = idIdades;

    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getNomeProdutol() {
        return nomeProdutol;
    }

    public void setNomeProdutol(String nomeProdutol) {
        this.nomeProdutol = nomeProdutol;
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
    }

    public int getIdIdades() {
        return idIdades;
    }

    public void setIdIdades(int idIdades) {
        this.idIdades = idIdades;
    }

    @Override
    public String toString() {
        return  " idProduto: "+idProduto  + nomeProdutol +  "idPlano:" + idPlano + " idOperadora:" + idOperadora ;
    }

    @Override
    public int getId() {
        return getIdProduto();
    }

    @Override
    public void setId(int id) {

    }
}
