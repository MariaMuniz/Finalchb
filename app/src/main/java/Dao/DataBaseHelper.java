package Dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;


public class DataBaseHelper extends SQLiteOpenHelper {

        private static final String NOME_BANCO_DADOS = "CadastroPlano";
        private static final int VERSAO_BANCO_DADOS = 1;

        private static DataBaseHelper instance;

        public static DataBaseHelper getInstance(Context context) {
            if(instance == null)
                instance = new DataBaseHelper(context);

            return instance;
        }

        public DataBaseHelper(Context context) {
            super(context, NOME_BANCO_DADOS, null, VERSAO_BANCO_DADOS);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            db.execSQL(OperadoraDAO.SCRIPT_CRIACAO_TABELA_OPERADORA);
            db.execSQL(PlanoDAO.SCRIPT_CRIACAO_TABELA_PLANO);
            db.execSQL(IdadesDAO.SCRIPT_CRIACAO_TABELA_IDADES);
            db.execSQL(ProdutoDAO.SCRIPT_CRIACAO_TABELA_PRODUTO);
            db.execSQL(FaixaetariaDAO.SCRIPT_CRIACAO_TABELA_Faixaetaria);
            db.execSQL(PrecoDAO.SCRIPT_CRIACAO_TABELA_PRECO);
            db.execSQL(RedecredenciadaDAO.SCRIPT_CRIACAO_TABELA_REDE);
            db.execSQL(HasRedeCredenciadaDAO.SCRIPT_CRIACAO_TABELA_HASREDE);
            Log.i("DATABASE", "CRIANDO TABELA");
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            Log.i("DATABASE", "ATUALIZANDO TABELA");
            db.execSQL(PlanoDAO.SCRIPT_DELECAO_TABELA);
            db.execSQL(OperadoraDAO.SCRIPT_DELECAO_TABELA);
            onCreate(db);
        }

    }




