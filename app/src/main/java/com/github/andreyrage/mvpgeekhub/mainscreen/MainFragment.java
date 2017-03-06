package com.github.andreyrage.mvpgeekhub.mainscreen;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.github.andreyrage.mvpgeekhub.AbstractFragment;
import com.github.andreyrage.mvpgeekhub.R;

/**
 * Created by rage on 06.03.17.
 */

public class MainFragment extends AbstractFragment<MainContract.Presenter>
        implements MainContract.View, View.OnClickListener {

    private TextView textView;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
        new MainPresenter(this);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        textView = (TextView) view.findViewById(R.id.txt_message);
        view.findViewById(R.id.btn).setOnClickListener(this);

        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        getPresenter().onDestroy();
    }

    @Override
    public void showMessage(String message) {
        textView.setText(message);
    }

    @Override
    public void onClick(View view) {
        getPresenter().onButtonClick();
    }
}
