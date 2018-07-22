package com.example.mariaaparecida.planosaudechb;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import Dao.DAOBasico;
import Dao.FaixaetariaDAO;
import Dao.HasRedeCredenciadaDAO;
import Dao.IdadesDAO;
import Dao.OperadoraDAO;
import Dao.PlanoDAO;
import Dao.PrecoDAO;
import Dao.ProdutoDAO;
import Dao.RedecredenciadaDAO;
import Entidades.EntidadePersistivel;
import Entidades.Faixaetaria;
import Entidades.HasRedeCredenciada;
import Entidades.Idades;
import Entidades.Operadora;
import Entidades.Plano;
import Entidades.Preco;
import Entidades.Produto;
import Entidades.RedeCredenciada;

/**
 * Created by Alexsander on 04/07/2016.
 */
public     class DownloadTask extends AsyncTask<String, Void, String> {
        Context context;
        public DownloadTask(Context context)
        {
            this.context = context;
        }
        protected String doInBackground(String... urls) {
            //Put your getServerData-logic here
            //return serverData
            String result = connect("idades");
            decodeJsonIdades(result);
            result = connect("faixaetaria");
            decodeJsonFaixa(result);
            result = connect("plano");
            decodeJsonPlano(result);
            result = connect("operadora");
            decodeJsonOperadora(result);
            result = connect("produto");
            decodeJsonProduto(result);
            result = connect("preco");
            decodeJsonPreco(result);
            result = connect("rede_credenciada");
            decodeJsonRede(result);
            result = connect("operadora_has_rede_credenciada");
            decodeJsonOpHas(result);

            return "";
        }

    private void decodeJsonOpHas(String result) {
        //parse json data
        try{
            Log.d("log_tag", "String size= " +result.length());
            Log.d("log_tag", "String = " +result);
            JSONArray jArray = new JSONArray(result);

            HasRedeCredenciadaDAO dao = new HasRedeCredenciadaDAO(context);
            for(int i=0;i<jArray.length();i++){

                JSONObject json_data = jArray.getJSONObject(i);
                int id=json_data.getInt("Operadora_idOperadora");
                int idPlano=json_data.getInt("Operadora_Plano_idPlano");
                int idIdades=json_data.getInt("Operadora_Idades_idIdades");
                int idPlano1=json_data.getInt("Operadora_Plano_idPlano1");
                int idRede=json_data.getInt("Rede_credenciada_idrede_credenciada");

                Log.d("log_tag","id = "+id+" val = "+idRede);
                HasRedeCredenciada p = new HasRedeCredenciada(id,idRede,idPlano,idPlano1,idIdades);
                saveDao(dao,p);

                Log.d("log_tag2","ophas = "+p.toString());

            }
            dao.fecharConexao();


            Log.d("log_tag", "Deu tudo certo jArray = " + jArray.length());
        }
        catch(JSONException e){
            Log.d("log_tag", "Error parsing data "+e.toString());
        }
    }

    private void decodeJsonRede(String result) {
        //parse json data
        try{
            Log.d("log_tag", "String size= " +result.length());
            Log.d("log_tag", "String = " +result);
            JSONArray jArray = new JSONArray(result);

            RedecredenciadaDAO dao = new RedecredenciadaDAO(context);
            for(int i=0;i<jArray.length();i++){

                JSONObject json_data = jArray.getJSONObject(i);
                int id=json_data.getInt("idrede_credenciada");
                String nome = json_data.getString("Nome_rede");
                String cidade = json_data.getString("Cidade");


                Log.d("log_tag","id = "+id+" nome = "+nome);
                RedeCredenciada p = new RedeCredenciada(id,nome,cidade);
                saveDao(dao,p);

                Log.d("log_tag2","rede = "+p.toString());

            }
            dao.fecharConexao();

            Log.d("log_tag", "Deu tudo certo jArray = " + jArray.length());
        }
        catch(JSONException e){
            Log.d("log_tag", "Error parsing data "+e.toString());
        }
    }

    private void decodeJsonFaixa(String result) {
        //parse json data
        try{
            Log.d("log_tag", "String size= " +result.length());
            Log.d("log_tag", "String = " +result);
            JSONArray jArray = new JSONArray(result);

            FaixaetariaDAO dao = new FaixaetariaDAO(context);
            for(int i=0;i<jArray.length();i++){

                JSONObject json_data = jArray.getJSONObject(i);
                int id=json_data.getInt("idFaixaetaria");
                int idIdade=json_data.getInt("Idades_idIdades");
                int inicial=json_data.getInt("inicial");
                int fim =json_data.getInt("final");


                Log.d("log_tag","id = "+id+" val = "+inicial+" - "+fim);

                Faixaetaria p = new Faixaetaria(id,idIdade,inicial,fim);
                saveDao(dao,p);

                Log.d("log_tag2","faixa = "+p.toString());

            }
            dao.fecharConexao();

            Log.d("log_tag", "Deu tudo certo jArray = " + jArray.length());
        }
        catch(JSONException e){
            Log.d("log_tag", "Error parsing data "+e.toString());
        }
    }

    private void decodeJsonIdades(String result) {
        //parse json data
        try{
            Log.d("log_tag", "String size= " +result.length());
            Log.d("log_tag", "String = " +result);
            JSONArray jArray = new JSONArray(result);

            IdadesDAO dao = new IdadesDAO(context);
            for(int i=0;i<jArray.length();i++){

                JSONObject json_data = jArray.getJSONObject(i);
                int id=json_data.getInt("idIdades");

                Idades p = new Idades(id);
                saveDao(dao,p);

                Log.d("log_tag2","idades = "+p.toString());

                Log.d("log_tag","id = "+id);
            }
            dao.fecharConexao();

            Log.d("log_tag", "Deu tudo certo jArray = " + jArray.length());
        }
        catch(JSONException e){
            Log.d("log_tag", "Error parsing data "+e.toString());
        }
    }

    private void decodeJsonPreco(String result) {
        //parse json data
        try{
            Log.d("log_tag", "String size= " +result.length());
            Log.d("log_tag", "String = " +result);
            JSONArray jArray = new JSONArray(result);

            PrecoDAO dao = new PrecoDAO(context);
            for(int i=0;i<jArray.length();i++){

                JSONObject json_data = jArray.getJSONObject(i);
                int id=json_data.getInt("idPreco");
                double valor=json_data.getDouble("valor");
                int idProd=json_data.getInt("Produto_idProduto");
                int idOp=json_data.getInt("Produto_Operadora_idOperadora");
                int idPlano=json_data.getInt("Produto_Operadora_Plano_idPlano");
                int idIdades=json_data.getInt("Produto_Operadora_Idades_idIdades");

                Log.d("log_tag","id = "+id+" val = "+valor + " idProd = "+idProd);

                Preco p = new Preco(id,valor,idPlano,idOp,idProd,idIdades);

                Log.d("log_tag2","preco = "+p.toString());
                saveDao(dao,p);
            }
            dao.fecharConexao();

            Log.d("log_tag", "Deu tudo certo jArray = " + jArray.length());
        }
        catch(JSONException e){
            Log.d("log_tag", "Error parsing data "+e.toString());
        }
    }

    private void decodeJsonProduto(String result) {
        //parse json data
        try{
            Log.d("log_tag", "String size= " +result.length());
            Log.d("log_tag", "String = " +result);
            JSONArray jArray = new JSONArray(result);

            ProdutoDAO dao = new ProdutoDAO(context);
            for(int i=0;i<jArray.length();i++){

                JSONObject json_data = jArray.getJSONObject(i);
                int id=json_data.getInt("idProduto");
                String nome = json_data.getString("nomeProdutol");
                int idOp=json_data.getInt("Operadora_idOperadora");
                int idPlano=json_data.getInt("Operadora_Plano_idPlano");
                int idIdades=json_data.getInt("Operadora_Idades_idIdades");

                Log.d("log_tag","id = "+id+" nome = "+nome);


                Produto p = new Produto(id,nome,idOp,idPlano,idIdades);
                saveDao(dao,p);

                Log.d("log_tag2","produto = "+p.toString());

            }
            dao.fecharConexao();

            Log.d("log_tag", "Deu tudo certo jArray = " + jArray.length());
        }
        catch(JSONException e){
            Log.d("log_tag", "Error parsing data "+e.toString());
        }
    }

    private void decodeJsonPlano(String result) {
        //parse json data
        try{
            Log.d("log_tag", "String size= " +result.length());
            Log.d("log_tag", "String = " +result);
            JSONArray jArray = new JSONArray(result);

            PlanoDAO dao = new PlanoDAO(context);
            for(int i=0;i<jArray.length();i++){

                JSONObject json_data = jArray.getJSONObject(i);
                int id=json_data.getInt("idPlano");
                String nome = json_data.getString("nome_plano");

                Log.d("log_tag","id = "+id+" nome = "+nome);



                Plano p = new Plano(id,nome);
                saveDao(dao,p);

                Log.d("log_tag2","plano = "+p.toString());

            }
            dao.fecharConexao();

            Log.d("log_tag", "Deu tudo certo jArray = " + jArray.length());
        }
        catch(JSONException e){
            Log.d("log_tag", "Error parsing data "+e.toString());
        }
    }
    private void decodeJsonOperadora(String result) {
        //parse json data
        try{
            Log.d("log_tag", "String size= " +result.length());
            Log.d("log_tag", "String = " +result);
            JSONArray jArray = new JSONArray(result);

            OperadoraDAO dao= new OperadoraDAO(context);
            for(int i=0;i<jArray.length();i++){

                JSONObject json_data = jArray.getJSONObject(i);
                int id=json_data.getInt("idOperadora");
                String nome = json_data.getString("nome_operadora");
                int idPlano=json_data.getInt("Plano_idPlano");
                int idPlano1=json_data.getInt("Plano_idPlano1"); //Dado replicado, nao utilizado
                int idIdades=json_data.getInt("Idades_idIdades");

                Log.d("log_tag","id = "+id+" nome = "+nome);

                Operadora p = new Operadora(id,nome,idPlano,idIdades);
                saveDao(dao,p);

                Log.d("log_tag2","operadora = "+p.toString());
            }
            dao.fecharConexao();

            Log.d("log_tag", "Deu tudo certo jArray = " + jArray.length());
        }
        catch(JSONException e){
            Log.d("log_tag", "Error parsing data "+e.toString());
        }
    }

    private void saveDao(DAOBasico dao, EntidadePersistivel p)
    {
        dao.salvar(p);
    }

    //This Method is called when Network-Request finished
        protected void onPostExecute(String serverData) {

            MainActivity.progress.dismiss();
        }

    public String connect(String tabela)
    {
        String result = "";
        //http post
        InputStream is=null;
        ArrayList<NameValuePair> nameValuePairs = new ArrayList<>();
        nameValuePairs.add(new BasicNameValuePair("message",""+tabela));
        try{
            HttpClient httpclient = new DefaultHttpClient();
                HttpPost httppost;
            boolean alexsander = false;
            if(alexsander)
            {
                httppost = new HttpPost("http://192.168.1.11:80/zprojetos/ChbSaudePhp/dadosTabela.php");
            }
            else{
                httppost = new HttpPost("http://192.168.120.107/CHBSAUDE/dadosTabela.php");
            }


            //HttpPost httppost = new HttpPost("http://semapensinomilitar.com.br/private/incontroll/conexaomysqlretrievedata.php");
            Log.d("log_tag", "chegou aki0 ");
            httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
            HttpResponse response = httpclient.execute(httppost);
            HttpEntity entity = response.getEntity();
            is = entity.getContent();


            Log.d("log_tag", "chegou aki ");
        }catch(Exception e){
            Log.d("log_tag", "Error in http connection " + e.toString());
        }
        //convert response to string
        try{

            BufferedReader reader = new BufferedReader(new InputStreamReader(is,"iso-8859-1"),8);
            StringBuilder sb = new StringBuilder();
            String line = null;
            while ((line = reader.readLine()) != null) {
                sb.append(line + "\n");
            }
            is.close();

            result=sb.toString();


            Log.d("log_tag", "chegou aki 2 : "+result);
        }catch(Exception e){
            Log.d("log_tag", "Error converting result "+e.toString());
        }

        return result;


    }


}
