package com.github.andreyrage.mvpgeekhub.data;

import com.github.andreyrage.mvpgeekhub.models.Note;

/**
 * Created by rage on 06.03.17.
 */

public interface NoteData extends BaseData<Note, Long> {
    Note search(String search);
}
