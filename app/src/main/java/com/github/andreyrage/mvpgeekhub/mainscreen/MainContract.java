package com.github.andreyrage.mvpgeekhub.mainscreen;

import com.github.andreyrage.mvpgeekhub.BasePresenter;
import com.github.andreyrage.mvpgeekhub.BaseView;

/**
 * Created by rage on 06.03.17.
 */

public interface MainContract {
    interface Presenter extends BasePresenter<View> {
        void onButtonClick();
    }

    interface View extends BaseView<Presenter> {
        void showMessage(String message);
    }
}
