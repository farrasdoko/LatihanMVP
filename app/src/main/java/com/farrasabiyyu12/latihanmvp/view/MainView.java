package com.farrasabiyyu12.latihanmvp.view;

import com.farrasabiyyu12.latihanmvp.Base.BaseView;

public interface MainView extends BaseView {
    void onSuccess(String jumlah);
    void onError(String msg);
}
