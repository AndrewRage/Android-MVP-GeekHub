package com.github.andreyrage.mvpgeekhub.mainscreen;

import com.github.andreyrage.mvpgeekhub.AbstractPresenter;
import com.github.andreyrage.mvpgeekhub.data.BaseData;
import com.github.andreyrage.mvpgeekhub.models.Note;
import com.github.andreyrage.mvpgeekhub.data.NoteData;
import com.github.andreyrage.mvpgeekhub.data.NoteDataImpl;

/**
 * Created by rage on 06.03.17.
 */

public class MainPresenter extends AbstractPresenter<MainContract.View>
        implements MainContract.Presenter {
    private long i = 0;

    private NoteData noteData = new NoteDataImpl();

    public MainPresenter(MainContract.View view) {
        super(view);
    }

    @Override
    public void start() {
        noteData.get(5L, new BaseData.Callback<Note>() {
            @Override
            public void onComplete(Note note) {
                getView().showMessage(note.getText());
            }
        });
    }

    @Override
    public void onButtonClick() {
        getView().showMessage("Pressed");
    }

    @Override
    public boolean onBackPressed() {
        if (i + 2000 > System.currentTimeMillis()) {
            return false;
        }
        i = System.currentTimeMillis();
        return true;
    }
}
