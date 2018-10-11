package com.farrasabiyyu12.latihanmvp.Base;

public interface BasePresenter <T extends BaseView> {
    void onAttach(T v);
    void onDetach();
}
