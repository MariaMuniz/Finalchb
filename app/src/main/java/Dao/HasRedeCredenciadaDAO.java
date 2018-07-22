package Dao;

import android.content.ContentValues;
import android.content.Context;

import Entidades.HasRedeCredenciada;


public class HasRedeCredenciadaDAO extends DAOBasico<HasRedeCredenciada> {


    public static final String NOME_TABELA = "operadora_has_rede_credenciada";
    public static final String COLUNA_REDE_CREDENCIADA_IDREDE_CREDENCIADA = "rede_credenciada_idrede_credenciada";
    public static final String COLUNA_OPERADORA_IDOPERADORA = "Operadora_idOperadora";
    public static final String COLUNA_OPERADORA_IDPLANO = "Operadora_idPlano";
    public static final String COLUNA_OPERADORA_IDPLANO1 = "Operadora_idPlano1";
    public static final String COLUNA_OPERADORA_IDIDADES = "Operadora_idIdades";


    //public static final String SCRIPT_CRIACAO_TABELA_HASREDE = "CREATE TABLE " + NOME_TABELA + "("
     //       + COLUNA_REDE_CREDENCIADA_IDREDE_CREDENCIADA + " INTEGER," + COLUNA_OPERADORA_IDOPERADORA + " INTEGER," + COLUNA_OPERADORA_IDPLANO + " INTEGER," + COLUNA_OPERADORA_IDPLANO1 + " INTEGER," + COLUNA_OPERADORA_IDIDADES + " INTEGER" + ") ";


    public static final String SCRIPT_CRIACAO_TABELA_HASREDE = "CREATE TABLE " + NOME_TABELA + "("
            + COLUNA_REDE_CREDENCIADA_IDREDE_CREDENCIADA + " INTEGER," + COLUNA_OPERADORA_IDPLANO + " INTEGER," + COLUNA_OPERADORA_IDPLANO1 + " INTEGER," + COLUNA_OPERADORA_IDIDADES + " INTEGER" + ") ";



    public static final String SCRIPT_DELECAO_TABELA = "DROP TABLE IF EXISTS " + NOME_TABELA;

    private static HasRedeCredenciadaDAO instance;


    public static HasRedeCredenciadaDAO getInstance(Context context) {
        if (instance == null)
            instance = new HasRedeCredenciadaDAO(context);
        return instance;

    }

    public HasRedeCredenciadaDAO(Context context) {
        super(context);
    }

    @Override
    public String getNomeTabela() {
        return NOME_TABELA;
    }

    @Override
    public String getNomeColunaPrimaryKey() {
        return COLUNA_REDE_CREDENCIADA_IDREDE_CREDENCIADA;
    }

    public ContentValues entidadeParacontentValues(HasRedeCredenciada hasRedeCredenciada) {
        ContentValues values = new ContentValues();
        if (hasRedeCredenciada.getId() > 0) {
            values.put(COLUNA_REDE_CREDENCIADA_IDREDE_CREDENCIADA, hasRedeCredenciada.getRede_credenciada_idrede_credenciada());
        }
        //values.put(COLUNA_OPERADORA_IDOPERADORA, hasRedeCredenciada.getOperadora_idOperadora());
        values.put(COLUNA_OPERADORA_IDPLANO, hasRedeCredenciada.getOperadora_idPlano());
        values.put(COLUNA_OPERADORA_IDPLANO1, hasRedeCredenciada.getOperadora_idPlano1());
        values.put(COLUNA_OPERADORA_IDIDADES, hasRedeCredenciada.getOperadora_idIdades());


        return values;
    }


    @Override
    public HasRedeCredenciada contentValuesParaEntidade(ContentValues contentValues) {
        HasRedeCredenciada Operadora_has_rede_credenciada = new HasRedeCredenciada();

        Operadora_has_rede_credenciada.setRede_credenciada_idrede_credenciada(contentValues.getAsInteger(COLUNA_REDE_CREDENCIADA_IDREDE_CREDENCIADA));
        //Operadora_has_rede_credenciada.setOperadora_idOperadora(contentValues.getAsInteger(COLUNA_OPERADORA_IDOPERADORA));
        Operadora_has_rede_credenciada.setOperadora_idPlano(contentValues.getAsInteger(COLUNA_OPERADORA_IDPLANO ));
        Operadora_has_rede_credenciada.setOperadora_idPlano1(contentValues.getAsInteger(COLUNA_OPERADORA_IDPLANO1));
        Operadora_has_rede_credenciada.setOperadora_idIdades(contentValues.getAsInteger(COLUNA_OPERADORA_IDIDADES));


        return Operadora_has_rede_credenciada;
    }

}