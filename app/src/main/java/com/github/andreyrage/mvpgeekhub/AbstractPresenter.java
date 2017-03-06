package com.github.andreyrage.mvpgeekhub;

/**
 * Created by rage on 06.03.17.
 */

public abstract class AbstractPresenter<V extends BaseView> implements BasePresenter<V> {
    private V view;

    public AbstractPresenter(V view) {
        this.view = view;
        //noinspection unchecked
        view.setPresenter(this);
    }

    @Override
    public V getView() {
        return view;
    }

    @Override
    public void start() {
        //
    }

    @Override
    public void onDestroy() {
        //
    }

    @Override
    public boolean onBackPressed() {
        return false;
    }
}
