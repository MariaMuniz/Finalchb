package Dao;

import android.content.ContentValues;
import android.content.Context;

import Entidades.RedeCredenciada;


public class RedecredenciadaDAO extends DAOBasico<RedeCredenciada> {


        public static final String NOME_TABELA = "rede_credenciada";
        public static final String COLUNA_IDREDE_CREDENCIADA = "idrede_credenciada";
        public static final String COLUNA_NOME_REDE = "Nome_rede";
        public static final String COLUNA_CIDADE = "Cidade";
        


        public static final String SCRIPT_CRIACAO_TABELA_REDE= "CREATE TABLE " + NOME_TABELA + "("
                + COLUNA_IDREDE_CREDENCIADA + " INTEGER PRIMARY KEY," + COLUNA_NOME_REDE + " TEXT," + COLUNA_CIDADE + " TEXT" + ") ";

        public static final String SCRIPT_DELECAO_TABELA = "DROP TABLE IF EXISTS " + NOME_TABELA;

        private static RedecredenciadaDAO instance;


        public static RedecredenciadaDAO getInstance(Context context) {
            if (instance == null)
                instance = new RedecredenciadaDAO(context);
            return instance;

        }

        public RedecredenciadaDAO(Context context) {
            super(context);
        }

        @Override
        public String getNomeTabela() {
            return NOME_TABELA;
        }

        @Override
        public String getNomeColunaPrimaryKey() {
            return COLUNA_IDREDE_CREDENCIADA;
        }

        public ContentValues entidadeParacontentValues(RedeCredenciada rede_credenciada) {
            ContentValues values = new ContentValues();
            if (rede_credenciada.getId()> 0) {
                values.put(COLUNA_IDREDE_CREDENCIADA, rede_credenciada.getIdrede_credenciada());
            }

            values.put(COLUNA_NOME_REDE, rede_credenciada.getNome_rede());
            values.put(COLUNA_CIDADE, rede_credenciada.getCidade());
           
            return values;
        }


        @Override
        public RedeCredenciada contentValuesParaEntidade(ContentValues contentValues) {
            RedeCredenciada rede_credenciada= new RedeCredenciada();
            rede_credenciada.setIdrede_credenciada(contentValues.getAsInteger(COLUNA_IDREDE_CREDENCIADA));
            rede_credenciada.setNome_rede(contentValues.getAsString(COLUNA_NOME_REDE));
            rede_credenciada.setCidade(contentValues.getAsString(COLUNA_CIDADE));
            
            return rede_credenciada;
        }

    }



