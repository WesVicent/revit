package br.com.revit.activity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import br.com.revit.Fragment.AlongamentoFragment;
import br.com.revit.R;

public class HomeActivity extends AppCompatActivity {

    private Context context;
    private FragmentTransaction transaction;

    private View.OnClickListener btnLombarClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

        }
    };
    private View.OnClickListener btnPulsoClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

        }
    };
    private View.OnClickListener btnPernasClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

        }
    };
    private View.OnClickListener btnTricepsClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

        }
    };
    private View.OnClickListener btnPescocoClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

        }
    };


    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        transaction = getFragmentManager().beginTransaction().setReorderingAllowed(true).add(R.id.container_alongamento, AlongamentoFragment.class, null).commit();
        context = this;

        Button btnLombar = findViewById(R.id.btnLombar);
        Button btnPernas = findViewById(R.id.btnPernas);
        Button btnPescoco = findViewById(R.id.btnPescoco);
        Button btnTriceps = findViewById(R.id.btnTriceps);
        Button btnPulso = findViewById(R.id.btnPulso);

        btnLombar.setOnClickListener(btnLombarClickListener);
        btnPernas.setOnClickListener(btnLombarClickListener);
        btnPescoco.setOnClickListener(btnLombarClickListener);
        btnTriceps.setOnClickListener(btnLombarClickListener);
        btnPulso.setOnClickListener(btnLombarClickListener);

        //campos nome, data_regeneracao, tempo_degeneracao
        getSharedPreferences("regioes", MODE_PRIVATE);

        // campos  nome, regiao
        getSharedPreferences("circuitos", MODE_PRIVATE);

        // campos  circuito, imgem, duracao
        getSharedPreferences("alongamentos", MODE_PRIVATE);

        // 70*35 = 2450
        // campos  peso, nome
        getSharedPreferences("info", MODE_PRIVATE);

        // 70 kg * 35 ml = 2l 450ml
        // campos  quantidade, tamanho_copo
        getSharedPreferences("agua", MODE_PRIVATE);




    }

}