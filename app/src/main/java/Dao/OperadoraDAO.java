package Dao;

import android.content.ContentValues;
import android.content.Context;

import Entidades.Operadora;


public class OperadoraDAO extends DAOBasico<Operadora> {

        public static final String NOME_TABELA = "Operadora";
        public static final String COLUNA_ID = "id";
        public static final String COLUNA_NOME = "nome";
        public static final String COLUNA_ID_PLANO = "id_plano";
        public static final String COLUNA_ID_IDADES = "id_idades";


        public static final String SCRIPT_CRIACAO_TABELA_OPERADORA = "CREATE TABLE " + NOME_TABELA + "("
                + COLUNA_ID + " INTEGER PRIMARY KEY,"  + COLUNA_NOME + " TEXT,"  + COLUNA_ID_PLANO + " INTEGER,"  + COLUNA_ID_IDADES + " INTEGER"+ ") ";

        public static final String SCRIPT_DELECAO_TABELA =  "DROP TABLE IF EXISTS " + NOME_TABELA;

        private static OperadoraDAO instance;


        public static OperadoraDAO getInstance(Context context) {
            if(instance == null)
                instance = new OperadoraDAO(context);
            return instance;
        }



        public OperadoraDAO(Context context) {
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

        public ContentValues entidadeParacontentValues(Operadora operadora) {
            ContentValues values = new ContentValues();
            if(operadora.getId() > 0) {
                values.put(COLUNA_ID, operadora.getId());
            }

            values.put(COLUNA_NOME, operadora.getNome());
            values.put(COLUNA_ID_PLANO, operadora.getIdPlano());
            values.put(COLUNA_ID_IDADES, operadora.getIdIdades());




            return values;
        }


        @Override
        public Operadora contentValuesParaEntidade(ContentValues contentValues) {
            Operadora operadora = new Operadora();
            operadora.setId(contentValues.getAsInteger(COLUNA_ID));
            operadora.setNome(contentValues.getAsString(COLUNA_NOME));
            operadora.setIdPlano(contentValues.getAsInteger(COLUNA_ID_PLANO));
            operadora.setIdIdades(contentValues.getAsInteger(COLUNA_ID_IDADES));


            return operadora;
        }

    }





