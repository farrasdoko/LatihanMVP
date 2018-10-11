package com.farrasabiyyu12.latihanmvp.activity;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.farrasabiyyu12.latihanmvp.R;
import com.farrasabiyyu12.latihanmvp.presenter.MainPresenter;
import com.farrasabiyyu12.latihanmvp.view.MainView;

public class MainActivity extends AppCompatActivity implements MainView {

    TextInputEditText edtBilangan1, edtBilangan2;
    Button btnTambah, btnKurang, btnKali, btnBagi, btnClear;
    private MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        TODO Bind TextInputEditText
        edtBilangan1 = findViewById(R.id.edtBilangan1);
        edtBilangan2 = findViewById(R.id.edtBilangan2);
//        TODO Bind Button
        btnTambah = findViewById(R.id.btnTambah);
        btnKurang = findViewById(R.id.btnKurang);
        btnKali = findViewById(R.id.btnKali);
        btnBagi = findViewById(R.id.btnBagi);
        btnClear = findViewById(R.id.btnClear);
        presenter = new MainPresenter();
//        TODO AttachView
        presenter = new MainPresenter();
        onAttachView();
//        TODO Tambah Button
        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.add(edtBilangan1, edtBilangan2);
            }
        });
//        TODO Kurang Button
        btnKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.minus(edtBilangan1, edtBilangan2);
            }
        });
//        TODO Kali Button
        btnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.times(edtBilangan1, edtBilangan2);
            }
        });
//        TODO Bagi Button
        btnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.divided(edtBilangan1, edtBilangan2);
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtBilangan1.setText("");
                edtBilangan2.setText("");
            }
        });
    }

    @Override
    public void onSuccess(String jumlah) {
        Toast.makeText(this, jumlah, Toast.LENGTH_SHORT).show();
        Log.d("Hasil", jumlah);
    }

    @Override
    public void onError(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onAttachView() {
        presenter.onAttach(this);
    }

    @Override
    public void onDetachView() {

    }
}
