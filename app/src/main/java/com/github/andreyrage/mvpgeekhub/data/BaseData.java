package com.github.andreyrage.mvpgeekhub.data;

import java.util.List;

/**
 * Created by rage on 06.03.17.
 */

public interface BaseData<T, KEY> {
    void get(KEY id, Callback callback); //async
    T get(KEY id); //sync
    List<T> getAll();
    void removeAll();
    void remove(KEY id);
    KEY add(T object);

    interface Callback<T> {
        void onComplete(T object);
    }
}
