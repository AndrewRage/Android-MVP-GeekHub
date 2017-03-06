package com.github.andreyrage.mvpgeekhub;

/**
 * Created by rage on 06.03.17.
 */

public interface BasePresenter<V extends BaseView> {
    V getView();
    void start();
    void onDestroy();
    boolean onBackPressed();
}
