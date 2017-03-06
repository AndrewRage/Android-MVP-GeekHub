package com.github.andreyrage.mvpgeekhub;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.View;

/**
 * Created by rage on 06.03.17.
 */

public abstract class AbstractFragment<P extends BasePresenter>
        extends Fragment implements BaseView<P> {
    private P presenter;

    @Override
    public P getPresenter() {
        return presenter;
    }

    @Override
    public void setPresenter(P presenter) {
        this.presenter = presenter;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getPresenter().start();
    }

    public boolean onBackPressed() {
        return presenter.onBackPressed();
    }
}
