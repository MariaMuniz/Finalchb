package com.example.mariaaparecida.planosaudechb;

import android.Manifest;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.StrictMode;
import android.provider.MediaStore;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.telephony.PhoneNumberUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

import Dao.PrecoDAO;
import Dao.ProdutoDAO;
import Entidades.Preco;
import Entidades.Produto;
import Entidades.Singleton;

/**
 * Created by Maria Aparecida on 12/01/2018.
 */

public class Totalsimulado extends Activity {
    private View main;
    private ImageView imageView1;

    private TextView textplano;
    private ImageView imagemoperadora;
    private TextView textproduto;
    private TextView texttotal;
    private TextView textQtd;
    private TextView textacomodacao;

    private ArrayList<TextView> todosPlanos = new ArrayList<>();
    private ArrayList<ImageView> todasoperadoras = new ArrayList<>();
    private ArrayList<TextView> todosProdutos = new ArrayList<>();
    private ArrayList<TextView> todasQtd = new ArrayList<>();
    private ArrayList<TextView> todosTotais = new ArrayList<>();
    private ArrayList<TextView> todosacomodacao = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.totalsimulado);


        StrictMode.VmPolicy.Builder builder = new StrictMode.VmPolicy.Builder();
        StrictMode.setVmPolicy(builder.build());

        TextView textView = (TextView) findViewById(R.id.textplano);
        ImageView imageView = (ImageView) findViewById(R.id.imagemoperadora);
        textproduto = (TextView) findViewById(R.id.textproduto);
        textacomodacao = (TextView) findViewById(R.id.textacomodacao);
        texttotal = (TextView) findViewById(R.id.texttotal);
        textQtd = (TextView) findViewById(R.id.textQtd);

        try {
            requestPermissionForReadExtertalStorage();
        } catch (Exception e) {
            e.printStackTrace();
        }

        int idPlano = Singleton.getInstance().getIdPlano();

        switch (idPlano) {
            case 1:
                textView.setText("Adesão Affix");
                break;
            case 2:
                textView.setText("Adesão Alcare");
                break;
            case 4:
                textView.setText("Adesão Qualicorp");
                break;
            case 5:
                textView.setText("Ambulatorial");
                break;
            case 6:
                textView.setText("Empresarial");
                break;
            case 7:
                textView.setText("EmpresarialII");
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

        switch (idOperadora) {
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
            case 40:
                imageView.setImageResource(R.drawable.promed);
                break;
            case 44:
                imageView.setImageResource(R.drawable.vivamed);
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
                imageView.setImageResource(R.drawable.previdenticone);
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
            case 59:
                imageView.setImageResource(R.drawable.promed);
                break;
            case 60:
                imageView.setImageResource(R.drawable.onehealth);
                break;
            case 61:
                imageView.setImageResource(R.drawable.onehealth);
                break;
            case 62:
                imageView.setImageResource(R.drawable.sulamerica);
                break;
            case 63:
                imageView.setImageResource(R.drawable.sulamerica);
                break;
            case 65:
                imageView.setImageResource(R.drawable.premium);
                break;
        }


        todasoperadoras.add(imagemoperadora);


        int idProduto = Singleton.getInstance().getIdProduto();


        ProdutoDAO dao = new ProdutoDAO(this);
        //List<Preco> precos = dao.recuperarTodos();
        String query = "SELECT * FROM  produto where idProduto = " + idProduto;
        List<Produto> produtos = dao.recuperarPorQuery(query);
        Log.d("log_tag_query", query);
        if (produtos.size() == 0) {
            Toast.makeText(this, "Erro ao executar query = " + query, Toast.LENGTH_LONG);
            return;
        } else {
            textproduto.setText("" + produtos.get(0).getNomeProdutol());
        }

        int qtd = Singleton.getInstance().getQtds();
        double total = Singleton.getInstance().getResultados();
        String acomodacao = Singleton.getInstance().getAcomodacao();

        NumberFormat nf = new DecimalFormat("#0.00");
        String valor = (nf.format(total));


        texttotal.setText("R$" + valor);
        textQtd.setText("" + qtd);
        textacomodacao.setText("" + acomodacao);


        main = findViewById(R.id.main);
        imageView1 = (ImageView) findViewById(R.id.imageView1);
        ImageButton btn = (ImageButton) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bitmap b = Screenshot.takescreenshotOfRootView(imageView1);
                imageView1.setImageBitmap(b);
            }
        });

    }

    public void enviaImagem(View v) {
        View content = findViewById(R.id.imageView1);
        content.setDrawingCacheEnabled(true);

        Bitmap bitmap = content.getDrawingCache();
        File cachePath = new File(Environment.getExternalStoragePublicDirectory(
                Environment.DIRECTORY_DOWNLOADS), "image.jpg");

        try {

            cachePath.createNewFile();
            FileOutputStream ostream = new FileOutputStream(cachePath);
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, ostream);
            ostream.close();
            Log.d("codigolog", "Deu certo a criacao");
        } catch (Exception e) {
            Log.d("codigolog", "Deu errado criacao do arquivo");
            Log.d("codigolog", "Erro : " + e.getMessage());
            e.printStackTrace();
        }

        String smsNumber = "553198680271"; //without '+'
        try {
            Intent sendIntent = new Intent("android.intent.action.MAIN");
            //sendIntent.setComponent(new ComponentName("com.whatsapp", "com.whatsapp.Conversation"));
            sendIntent.setAction(Intent.ACTION_SEND);
            sendIntent.setType("image*//*");
            sendIntent.putExtra(Intent.EXTRA_STREAM, Uri.fromFile(cachePath));
            sendIntent.putExtra("jid", smsNumber + "@s.whatsapp.net"); //phone number without "+" prefix
            sendIntent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
            sendIntent.setPackage("com.whatsapp");
            startActivity(sendIntent);
        } catch (Exception e) {
            Toast.makeText(this, "Error/n" + e.toString(), Toast.LENGTH_SHORT).show();
            Log.d("codigolog", "Erro : " + e.getMessage());
            Log.d("codigolog", "Erro : " + e.toString());
        }


    }

    public void requestPermissionForReadExtertalStorage() throws Exception {
        try {
            ActivityCompat.requestPermissions((Activity) this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},
                    0);
            ActivityCompat.requestPermissions((Activity) this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE},
                    1);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

}









