package Dao;

import android.content.ContentValues;
import android.content.Context;

import Entidades.Plano;


public class PlanoDAO extends DAOBasico<Plano> {

        public static final String NOME_TABELA = "Plano";
        public static final String COLUNA_ID = "id";
        public static final String COLUNA_NOME = "nome";


        public static final String SCRIPT_CRIACAO_TABELA_PLANO = "CREATE TABLE " + NOME_TABELA + "("
                + COLUNA_ID + " INTEGER PRIMARY KEY,"  + COLUNA_NOME + " TEXT " + ") ";

        public static final String SCRIPT_DELECAO_TABELA =  "DROP TABLE IF EXISTS " + NOME_TABELA;

        private static PlanoDAO instance;


        public static PlanoDAO getInstance(Context context) {
            if(instance == null)
                instance = new PlanoDAO(context);
            return instance;
        }



        public PlanoDAO(Context context) {
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

        public ContentValues entidadeParacontentValues(Plano plano) {
            ContentValues values = new ContentValues();
            if(plano.getId() > 0) {
                values.put(COLUNA_ID, plano.getId());
            }

            values.put(COLUNA_NOME, plano.getnome_plano());


            return values;
        }


        @Override
        public Plano contentValuesParaEntidade(ContentValues contentValues) {
            Plano plano = new Plano();
            plano.setId(contentValues.getAsInteger(COLUNA_ID));
            plano.setnome_plano(contentValues.getAsString(COLUNA_NOME));

            return plano;
        }

    }




