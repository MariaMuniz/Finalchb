package Dao;

import android.content.ContentValues;
import android.content.Context;

import Entidades.Preco;


public class PrecoDAO extends DAOBasico<Preco> {

    public static final String NOME_TABELA = "Preco";
    public static final String COLUNA_ID = "id";
    public static final String COLUNA_VALOR = "valor";
    public static final String COLUNA_ID_PLANO = "id_plano";
    public static final String COLUNA_ID_OPERADORA = "id_operadora";
    public static final String COLUNA_ID_PRODUTO = "id_produto";
    public static final String COLUNA_ID_IDADES = "id_idades";


    public static final String SCRIPT_CRIACAO_TABELA_PRECO = "CREATE TABLE " + NOME_TABELA + "(" + COLUNA_ID + " INTEGER PRIMARY KEY,"
            + COLUNA_VALOR + " DOUBLE," + COLUNA_ID_PLANO + " INTEGER," + COLUNA_ID_OPERADORA + " INTEGER," + COLUNA_ID_PRODUTO + " INTEGER,"  + COLUNA_ID_IDADES + " INTEGER) ";

    public static final String SCRIPT_DELECAO_TABELA = "DROP TABLE IF EXISTS " + NOME_TABELA;

    private static PrecoDAO instance;

    public static PrecoDAO getInstance(Context context) {
        if (instance == null)
            instance = new PrecoDAO(context);
        return instance;

    }

    public PrecoDAO(Context context) {
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

    public ContentValues entidadeParacontentValues(Preco preco) {
        ContentValues values = new ContentValues();
        if (preco.getId() > 0) {
            values.put(COLUNA_ID, preco.getId());
        }

        values.put(COLUNA_VALOR, preco.getValor());
        values.put(COLUNA_ID_PLANO, preco.getIdPlano());
        values.put(COLUNA_ID_OPERADORA, preco.getIdOperadora());
        values.put(COLUNA_ID_PRODUTO, preco.getIdProduto());
        values.put(COLUNA_ID_IDADES, preco.getIdIdades());

        return values;
    }

    @Override
    public Preco contentValuesParaEntidade(ContentValues contentValues) {
        Preco preco = new Preco();
        preco.setId(contentValues.getAsInteger(COLUNA_ID));
        preco.setValor(contentValues.getAsDouble(COLUNA_VALOR));
        preco.setIdPlano(contentValues.getAsInteger(COLUNA_ID_PLANO));
        preco.setIdOperadora(contentValues.getAsInteger(COLUNA_ID_OPERADORA));
        preco.setIdProduto(contentValues.getAsInteger(COLUNA_ID_PRODUTO));
        preco.setIdIdades(contentValues.getAsInteger(COLUNA_ID_IDADES));


        return preco;
    }

}




