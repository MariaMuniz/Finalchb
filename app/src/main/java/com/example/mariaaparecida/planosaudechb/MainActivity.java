package com.example.mariaaparecida.planosaudechb;

import android.Manifest;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import java.util.List;

import Dao.DAOBasico;
import Dao.FaixaetariaDAO;
import Dao.HasRedeCredenciadaDAO;
import Dao.IdadesDAO;
import Dao.OperadoraDAO;
import Dao.PlanoDAO;
import Dao.PrecoDAO;
import Dao.ProdutoDAO;
import Dao.RedecredenciadaDAO;
import Entidades.Faixaetaria;
import Entidades.HasRedeCredenciada;
import Entidades.Idades;
import Entidades.Operadora;
import Entidades.Plano;
import Entidades.Preco;
import Entidades.Produto;
import Entidades.RedeCredenciada;
import Entidades.Singleton;


public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    public static ProgressDialog progress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


        android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();

        fragmentManager.beginTransaction().replace(R.id.contenedor, new com.example.mariaaparecida.planosaudechb.Fragment05()).commit();


        navigationView.getMenu().getItem(0).setChecked(true);

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement


        return super.onOptionsItemSelected(item);
    }

    private static final int REQUEST_PHONE_CALL = 1;

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {


        int id = item.getItemId();

        android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();

         if (id == R.id.nav_gallery) {
            fragmentManager.beginTransaction().replace(R.id.contenedor, new com.example.mariaaparecida.planosaudechb.Fragment02()).commit();
        } else if (id == R.id.nav_slideshow) {
            fragmentManager.beginTransaction().replace(R.id.contenedor, new com.example.mariaaparecida.planosaudechb.Fragment03()).commit();
        } else if (id == R.id.nav_manage) {

            fragmentManager.beginTransaction().replace(R.id.contenedor, new com.example.mariaaparecida.planosaudechb.Fragment04()).commit();


        } else if (id == R.id.nav_simula) {

            fragmentManager.beginTransaction().replace(R.id.contenedor, new com.example.mariaaparecida.planosaudechb.Fragment05()).commit();

        } else if (id == R.id.nav_telefone) {

            Intent intent = new Intent(Intent.ACTION_CALL);
            intent.setData(Uri.parse("tel:" + "998680271"));
            if (ContextCompat.checkSelfPermission(MainActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(MainActivity.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_PHONE_CALL);
            } else {
                startActivity(intent);
            }

        } else if (id == R.id.nav_email) {

            Intent i = new Intent(Intent.ACTION_SENDTO);
            i.setType("message/rfc822");
            i.setData(Uri.parse("mailto:"));
            i.putExtra(Intent.EXTRA_EMAIL, new String[]{"henrique@chbsaude.com.br"});
            i.putExtra(Intent.EXTRA_SUBJECT, "Plano de saude");
            i.putExtra(Intent.EXTRA_TEXT, "Olá!");

            try {
                startActivity(Intent.createChooser(i, "Enviar email..."));
            } catch (android.content.ActivityNotFoundException ex) {
                Toast.makeText(this, "Não tem aplicação de email instalado.", Toast.LENGTH_SHORT).show();
            }

        }
         else if (id == R.id.nav_atualiza) {


             limparTudo();
             download();
             //recuperar();
         }


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return false;
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String permissions[], int[] grantResults) {
        switch (requestCode) {
            case REQUEST_PHONE_CALL: {
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" + "998680271"));
                    if (ContextCompat.checkSelfPermission(MainActivity.this, Manifest.permission.CALL_PHONE) == PackageManager.PERMISSION_GRANTED) {
                        startActivity(intent);
                    }
                } else {

                }
                return;
            }
        }
    }

    public void openWhatsApp(View v) {
        String smsNumber = "553198680271"; //without '+'
        try {
            Intent sendIntent = new Intent("android.intent.action.MAIN");
            //sendIntent.setComponent(new ComponentName("com.whatsapp", "com.whatsapp.Conversation"));
            sendIntent.setAction(Intent.ACTION_SEND);
            sendIntent.setType("text/plain");
            sendIntent.putExtra(Intent.EXTRA_TEXT, "Olá!");
            sendIntent.putExtra("jid", smsNumber + "@s.whatsapp.net"); //phone number without "+" prefix
            sendIntent.setPackage("com.whatsapp");
            startActivity(sendIntent);
        } catch (Exception e) {
            Toast.makeText(this, "Error/n" + e.toString(), Toast.LENGTH_SHORT).show();
        }

    }



    public void limparTudo()
    {
        deleteDao(new PlanoDAO(this));
        deleteDao(new ProdutoDAO(this));
        deleteDao(new OperadoraDAO(this));
        deleteDao(new PrecoDAO(this));
        deleteDao(new IdadesDAO(this));
        deleteDao(new FaixaetariaDAO(this));
        deleteDao(new RedecredenciadaDAO(this));
        deleteDao(new HasRedeCredenciadaDAO(this));
    }
    public void deleteDao(DAOBasico dao)
    {
        try{
            dao.deletarTodos();
            dao.fecharConexao();
        }catch (Exception ex)
        {
            Log.d("log_tag_ex","Exception: "+ex.getMessage());
        }
    }
    public void download()
    {
        progress = ProgressDialog.show(this, "Download",
                "aguarde..", false);
        Log.d("log_tag", "Icon download touch ");
        DownloadTask dlTask = new DownloadTask(this);
        dlTask.execute();
    }
    public void recuperar() {
        DAOBasico dao = new PlanoDAO(this);
        List<Plano> planos = dao.recuperarTodos();
        dao.fecharConexao();



        dao = new OperadoraDAO(this);
        List<Operadora> operadoras = dao.recuperarTodos();
        dao.fecharConexao();

        dao = new ProdutoDAO(this);
        List<Produto> produtos = dao.recuperarTodos();
        dao.fecharConexao();

        dao = new PrecoDAO(this);
        //List<Preco> precos = dao.recuperarTodos();
        List<Preco> precos = dao.recuperarPorQuery("SELECT * FROM  preco where id<14");

        for(Preco r : precos)
        {
            Log.d("log_tag","P = "+r.toString());
        }


        dao.fecharConexao();

        dao = new IdadesDAO(this);
        List<Idades> idades = dao.recuperarTodos();
        dao.fecharConexao();

        dao = new FaixaetariaDAO(this);
        List<Faixaetaria> faixas = dao.recuperarTodos();
        dao.fecharConexao();

        dao = new RedecredenciadaDAO(this);
        List<RedeCredenciada> redeCredenciadas = dao.recuperarTodos();
        dao.fecharConexao();

        dao = new HasRedeCredenciadaDAO(this);
        List<HasRedeCredenciada> hasRedeCredenciadas= dao.recuperarTodos();
        dao.fecharConexao();

        for(RedeCredenciada r:redeCredenciadas)
        {
            Log.d("log_tag","R = "+r.getNome_rede());
        }




    }

}