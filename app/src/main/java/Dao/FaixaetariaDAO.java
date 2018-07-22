package Dao;

import android.content.ContentValues;
import android.content.Context;

import Entidades.Faixaetaria;


public class FaixaetariaDAO extends DAOBasico<Faixaetaria> {

        public static final String NOME_TABELA = "Faixaetaria";
        public static final String COLUNA_ID = "id";
        public static final String COLUNA_ID_IDADES = "id_Idades";
        public static final String COLUNA_INICIO = "inicio";
        public static final String COLUNA_FIM = "fim";


        public static final String SCRIPT_CRIACAO_TABELA_Faixaetaria = "CREATE TABLE " + NOME_TABELA + "("
                + COLUNA_ID + " INTEGER PRIMARY KEY," + COLUNA_ID_IDADES + " INTEGER," + COLUNA_INICIO + " INTEGER, " + COLUNA_FIM + " INTEGER " + ") ";

        public static final String SCRIPT_DELECAO_TABELA = "DROP TABLE IF EXISTS " + NOME_TABELA;

        private static FaixaetariaDAO instance;


        public static FaixaetariaDAO getInstance(Context context) {
            if (instance == null)
                instance = new FaixaetariaDAO(context);
            return instance;
        }

        public FaixaetariaDAO(Context context) {
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

        public ContentValues entidadeParacontentValues(Faixaetaria faixaetaria) {
            ContentValues values = new ContentValues();
            if (faixaetaria.getId() > 0) {
                values.put(COLUNA_ID, faixaetaria.getId());
            }
            values.put(COLUNA_ID_IDADES, faixaetaria.getIdIdades());
            values.put(COLUNA_INICIO, faixaetaria.getInicio());
            values.put(COLUNA_FIM, faixaetaria.getFim());
            return values;
        }

        @Override
        public Faixaetaria contentValuesParaEntidade(ContentValues contentValues) {
            Faixaetaria faixaetaria = new Faixaetaria();
            faixaetaria.setId(contentValues.getAsInteger(COLUNA_ID));
            faixaetaria.setIdIdades(contentValues.getAsInteger(COLUNA_ID_IDADES));
            faixaetaria.setInicio(contentValues.getAsInteger(COLUNA_INICIO));
            faixaetaria.setFim(contentValues.getAsInteger(COLUNA_FIM));

            return faixaetaria;
        }

    }



