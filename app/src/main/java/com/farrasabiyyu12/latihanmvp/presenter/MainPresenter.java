package com.farrasabiyyu12.latihanmvp.presenter;

import android.support.design.widget.TextInputEditText;

import com.farrasabiyyu12.latihanmvp.Base.BasePresenter;
import com.farrasabiyyu12.latihanmvp.view.MainView;

public class MainPresenter implements BasePresenter<MainView> {

    private MainView mainView;
    private double jumlah;

    public void add(TextInputEditText bil1, TextInputEditText bil2){
        String bila1 = bil1.getText().toString();
        String bila2 = bil2.getText().toString();
        if (!bil2.equals("")){
            jumlah = Double.parseDouble(bila1) + Double.parseDouble(bila2);
            mainView.onSuccess("Hasil: " + jumlah);
        } else {
            mainView.onError("Bilangan 2 Harus Diisi");
        }
    }

    public void minus(TextInputEditText bil1, TextInputEditText bil2){
        String bila1 = bil1.getText().toString();
        String bila2 = bil2.getText().toString();
        if (!bil2.equals("")){
            jumlah = Double.parseDouble(bila1) - Double.parseDouble(bila2);
            mainView.onSuccess("Hasil: " + jumlah);
        } else {
            mainView.onError("Bilangan 2 Harus Diisi");
        }
    }

    public void times(TextInputEditText bil1, TextInputEditText bil2){
        String bila1 = bil1.getText().toString();
        String bila2 = bil2.getText().toString();
        if (!bil2.equals("")){
            jumlah = Double.parseDouble(bila1) * Double.parseDouble(bila2);
            mainView.onSuccess("Hasil: " + jumlah);
        } else {
            mainView.onError("Bilangan 2 Harus Diisi");
        }
    }

    public void divided(TextInputEditText bil1, TextInputEditText bil2){
        String bila1 = bil1.getText().toString();
        String bila2 = bil2.getText().toString();
        if (!bil2.equals("")){
            jumlah = Double.parseDouble(bila1) / Double.parseDouble(bila2);
            mainView.onSuccess("Hasil: " + jumlah);
        } else {
            mainView.onError("Bilangan 2 Harus Diisi");
        }
    }

    @Override
    public void onAttach(MainView v) {
        mainView = v;
    }

    @Override
    public void onDetach() {
        mainView = null;
    }
}
