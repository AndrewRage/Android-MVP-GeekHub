package com.github.andreyrage.mvpgeekhub.data;

import com.github.andreyrage.mvpgeekhub.models.Note;

/**
 * Created by rage on 06.03.17.
 */

public class NoteDataImpl extends AbstractData<Note, Long> implements NoteData {
    @Override
    public Class getType() {
        return Note.class;
    }

    @Override
    public Note search(String search) {
        return getORM().findLike(search);
    }
}
