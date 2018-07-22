package Dao;

import android.content.ContentValues;
import android.content.Context;

import Entidades.Idades;

public class IdadesDAO extends DAOBasico<Idades> {

        public static final String NOME_TABELA = "Idades";
        public static final String COLUNA_ID = "id";
        public static final String SCRIPT_CRIACAO_TABELA_IDADES = "CREATE TABLE " + NOME_TABELA + "("
                + COLUNA_ID + " INTEGER PRIMARY KEY " +") ";

        public static final String SCRIPT_DELECAO_TABELA =  "DROP TABLE IF EXISTS " + NOME_TABELA;

        private static IdadesDAO instance;

        public static IdadesDAO getInstance(Context context) {
            if(instance == null)
                instance = new IdadesDAO(context);
            return instance;
        }

        public IdadesDAO(Context context) {
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

        public ContentValues entidadeParacontentValues(Idades idades) {
            ContentValues values = new ContentValues();
            if(idades.getId() > 0) {
                values.put(COLUNA_ID, idades.getIdIdades());
            }




            return values;
        }

        @Override
        public Idades contentValuesParaEntidade(ContentValues contentValues) {
            Idades idades = new Idades();
            idades.setId(contentValues.getAsInteger(COLUNA_ID));

            //idades.setNome(contentValues.getAsString(COLUMA_NOME));
            return idades;
        }


    }



