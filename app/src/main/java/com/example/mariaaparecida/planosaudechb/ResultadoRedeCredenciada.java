package com.example.mariaaparecida.planosaudechb;

import android.app.Activity;
import android.database.Cursor;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mariaaparecida.planosaudechb.R;

import java.util.ArrayList;
import java.util.List;

import Dao.HasRedeCredenciadaDAO;
import Dao.RedecredenciadaDAO;
import Entidades.HasRedeCredenciada;
import Entidades.RedeCredenciada;
import Entidades.Singleton;

/**
 * Created by Maria Aparecida on 01/02/2018.
 */

public class ResultadoRedeCredenciada extends Activity {


    private ListView listView;
    private TextView textplano;
    private ImageView imageoperadora;

    private ArrayList<TextView> todosPlanos = new ArrayList<>();
    private ArrayList<ImageView> todasoperadoras = new ArrayList<>();
    private ArrayList<ListView> todasredecredenciada = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resultadoredecredenciada);

        ListView listview = (ListView) findViewById(R.id.redecredenciada);
        TextView textView = (TextView) findViewById(R.id.textplano);
        ImageView imageView = (ImageView) findViewById(R.id.imageoperadora);



        int idPlano = Singleton.getInstance().getIdPlano();

        switch (idPlano) {
            case 1:
                textView.setText("Adesão Affix");
                break;
            case 2:
                textView.setText("Adesão Alcare");
                break;
            case 3:
                textView.setText("Adesão Bem Benefícios");
                break;
            case 4:
                textView.setText("Adesão Qualicorp");
                break;
            case 5:
                textView.setText("Ambulatorial");
                break;
            case 6:
                textView.setText("Empresarial I");
                break;
            case 7:
                textView.setText("Empresarial II");
                break;
            case 8:
                textView.setText("Individual");
                break;
            case 9:
                textView.setText("Odontológico");
                break;
        }
         todosPlanos.add(textplano);



        int idOperadora = Singleton.getInstance().getIdOperadora();

        switch (idOperadora)
        {
            case 1:
                imageView.setImageResource(R.drawable.samp);
                break;
            case 2:
                imageView.setImageResource(R.drawable.saudesistema);
                break;
            case 3:
                imageView.setImageResource(R.drawable.vivamed);
                break;
            case 4:
                imageView.setImageResource(R.drawable.bradescosaude);
                break;
            case 5:
                imageView.setImageResource(R.drawable.vitallis);
                break;
            case 6:
                imageView.setImageResource(R.drawable.amil);
                break;
            case 7:
                imageView.setImageResource(R.drawable.amil);
                break;
            case 8:
            imageView.setImageResource(R.drawable.bradescoseguros);
            break;
            case 9:
                imageView.setImageResource(R.drawable.bradescoseguros);
                break;
            case 10:
                imageView.setImageResource(R.drawable.caixa);
                break;
            case 11:
                imageView.setImageResource(R.drawable.caixa);
                break;
            case 12:
                imageView.setImageResource(R.drawable.sulamerica);
                break;
            case 13:
                imageView.setImageResource(R.drawable.sulamerica);
                break;
            case 14:
                imageView.setImageResource(R.drawable.premium);
                break;
            case 15:
                imageView.setImageResource(R.drawable.premium);
                break;
            case 16:
                imageView.setImageResource(R.drawable.goodlife);
                break;
            case 17:
                imageView.setImageResource(R.drawable.amil);
                break;
            case 19:
                imageView.setImageResource(R.drawable.onehealth);
                break;
            case 20:
                imageView.setImageResource(R.drawable.unimed);
                break;
            case 21:
                imageView.setImageResource(R.drawable.promed);
                break;
            case 22:
                imageView.setImageResource(R.drawable.goodlife);
                break;
            case 23:
                imageView.setImageResource(R.drawable.samp);
                break;
            case 24:
                imageView.setImageResource(R.drawable.saudesistema);
                break;
            case 25:
                imageView.setImageResource(R.drawable.vitallis);
                break;
            case 26:
                imageView.setImageResource(R.drawable.vitallisinterior);
                break;
            case 44:
                imageView.setImageResource(R.drawable.vivamed);
                break;
            case 42:
                imageView.setImageResource(R.drawable.unimed);
                break;
            case 41:
                imageView.setImageResource(R.drawable.medsenior);
                break;
            case 43:
                imageView.setImageResource(R.drawable.goldencross);
                break;
            case 45:
                imageView.setImageResource(R.drawable.amil);
                break;
            case 46:
                imageView.setImageResource(R.drawable.onehealth);
                break;
            case 47:
                imageView.setImageResource(R.drawable.promed);
                break;
            case 48:
                imageView.setImageResource(R.drawable.saudesistema);
                break;
            case 49:
                imageView.setImageResource(R.drawable.unimed);
                break;
            case 50:
                imageView.setImageResource(R.drawable.goodlife);
                break;
            case 51:
                imageView.setImageResource(R.drawable.unimed);
                break;
            case 52:
                imageView.setImageResource(R.drawable.vitallis);
                break;
            case 54:
                imageView.setImageResource(R.drawable.amildental);
                break;
            case 55:
                imageView.setImageResource(R.drawable.prevident);
                break;
            case 56:
                imageView.setImageResource(R.drawable.samp);
                break;
            case 57:
                imageView.setImageResource(R.drawable.vivamed);
                break;
            case 58:
                imageView.setImageResource(R.drawable.saudesistema);
                break;
            case 60:
                imageView.setImageResource(R.drawable.onehealth);
                break;
            case 62:
                imageView.setImageResource(R.drawable.sulamericahosputala);
                break;
            case 64:
                imageView.setImageResource(R.drawable.vivamed);
                break;
            case 65:
                imageView.setImageResource(R.drawable.premium);
                break;
        }

        todasoperadoras.add(imageoperadora);



        List<RedeCredenciada> todasRedes = new ArrayList<>();
        HasRedeCredenciadaDAO dao = new HasRedeCredenciadaDAO(this);


        //List<Preco> precos = dao.recuperarTodos();
        String query = "SELECT * FROM  Operadora_has_rede_credenciada where Operadora_idPlano1 = "+idOperadora;
        //String query = "SELECT * FROM  operadora_has_rede_credenciada";
        List<HasRedeCredenciada> redes = dao.recuperarPorQuery(query);
        for(HasRedeCredenciada ra:redes)
        {
            Log.d("log_tag_query_hasred", ra.toString());
        }
        Log.d("log_tag_query",redes.size()+" <-tam, query-> "+ query);
        if(redes.size()==0)
        {
            Toast.makeText(this,"Erro ao executar query = "+query, Toast.LENGTH_LONG);
            return;
        }
        for(HasRedeCredenciada r : redes)
        {
            Log.d("log_tag","Rede = "+r.toString());

            RedecredenciadaDAO daoCred = new RedecredenciadaDAO(this);
            String queryCred = "SELECT * FROM  rede_credenciada where idrede_credenciada = "+r.getRede_credenciada_idrede_credenciada()+ " ORDER BY Cidade ;";
            List<RedeCredenciada> redescred = daoCred.recuperarPorQuery(queryCred);
            Log.d("log_tag_query", queryCred);

            todasRedes.addAll(redescred);

        }

        final ArrayList<String> nomes = new ArrayList<>();
        final ArrayList<String> cidades = new ArrayList<>();
        final ArrayList<String> mesclado = new ArrayList<>();

        for(int i=0;i<todasRedes.size();i++)
        {
            for(int j=0;j<todasRedes.size();j++)
            {
                if(todasRedes.get(i).getCidade().compareTo(todasRedes.get(j).getCidade())<0)
                {
                    RedeCredenciada r = todasRedes.get(i);
                    todasRedes.set(i,todasRedes.get(j));
                    todasRedes.set(j,r);
                }
            }
        }


        for(RedeCredenciada cred:todasRedes)
        {
            Log.d("log_tag","Todas  = "+cred.toString());
            String nome = cred.getNome_rede();
            String cidade = cred.getCidade();

            nomes.add(nome);
            cidades.add(cidade);

            mesclado.add(nome+" ("+cidade+")");
        }



        ArrayAdapter<String> arrayAdapter =
                new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,mesclado);
        // Set The Adapter
        listview.setAdapter(arrayAdapter);


        listview.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            // argument position gives the index of item which is clicked
            public void onItemClick(AdapterView<?> arg0, View v, int position, long arg3)
            {
                String selectedmovie=mesclado.get(position);
                Toast.makeText(getApplicationContext(), "Nome Selected : "+selectedmovie,   Toast.LENGTH_SHORT).show();
            }
        });


    }
}
