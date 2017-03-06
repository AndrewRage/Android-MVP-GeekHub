package com.github.andreyrage.mvpgeekhub;

/**
 * Created by rage on 06.03.17.
 */

public interface BaseView<P extends BasePresenter> {
    P getPresenter();
    void setPresenter(P presenter);
}
