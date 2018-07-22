package Dao;

import android.content.ContentValues;
import android.content.Context;

import Entidades.Produto;

/**
 * Created by alexs on 10/01/2018.
 */

public class ProdutoDAO extends DAOBasico<Produto> {
    public static final String NOME_TABELA = "Produto";
    public static final String COLUNA_ID = "idProduto";
    public static final String COLUNA_NOME = "nomeProdutol";
    public static final String COLUNA_ID_PLANO = "idplano";
    public static final String COLUNA_ID_OPERADORA = "idoperadora";
    public static final String COLUNA_ID_IDADES = "ididades";


    public static final String SCRIPT_CRIACAO_TABELA_PRODUTO = "CREATE TABLE " + NOME_TABELA + "("
            + COLUNA_ID + " INTEGER PRIMARY KEY," + COLUNA_NOME + " TEXT," + COLUNA_ID_PLANO + " INTEGER," + COLUNA_ID_OPERADORA + " INTEGER,"+COLUNA_ID_IDADES+" INTEGER) ";

    public static final String SCRIPT_DELECAO_TABELA = "DROP TABLE IF EXISTS " + NOME_TABELA;

    private static ProdutoDAO instance;


    public static ProdutoDAO getInstance(Context context) {
        if (instance == null)
            instance = new ProdutoDAO(context);
        return instance;

    }

    public ProdutoDAO(Context context) {
        super(context);
    }

    @Override
    public String getNomeTabela() {
        return NOME_TABELA;
    }

    @Override
    public String getNomeColunaPrimaryKey() {
        return COLUNA_ID;
    }

    public ContentValues entidadeParacontentValues(Produto Produto) {
        ContentValues values = new ContentValues();
        if (Produto.getId() > 0) {
            values.put(COLUNA_ID, Produto.getId());
        }

        values.put(COLUNA_NOME, Produto.getNomeProdutol());
        values.put(COLUNA_ID_PLANO, Produto.getIdPlano());
        values.put(COLUNA_ID_OPERADORA, Produto.getIdOperadora());


        return values;
    }

    @Override
    public Produto contentValuesParaEntidade(ContentValues contentValues) {
        Produto Produto = new Produto();
        Produto.setId(contentValues.getAsInteger(COLUNA_ID));
        Produto.setNomeProdutol(contentValues.getAsString(COLUNA_NOME));
        Produto.setIdPlano(contentValues.getAsInteger(COLUNA_ID_PLANO));
        Produto.setIdOperadora(contentValues.getAsInteger(COLUNA_ID_OPERADORA));


        return Produto;
    }
}
