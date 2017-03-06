package com.github.andreyrage.mvpgeekhub.data;

import java.util.List;

/**
 * Created by rage on 06.03.17.
 */

public abstract class AbstractData<T, KEY> implements BaseData<T, KEY> {
    private ORM orm; //some ORM

    public ORM getORM() {
        if (orm == null) {
            orm = new ORM();
        }
        return orm;
    }

    abstract Class getType();

    @Override //async
    public void get(KEY id, Callback callback) {
        callback.onComplete(getORM().get(getType()).getById(id));
    }

    @Override //sync
    public T get(KEY id) {
        return getORM().get(getType()).getById(id);
    }

    @Override
    public List<T> getAll() {
        return getORM().getAll(getType());
    }

    @Override
    public void removeAll() {
        getORM().removeAll(getType());
    }

    @Override
    public void remove(KEY id) {
        getORM().remove(getType()).where("id = " + id);
    }

    @Override
    public KEY add(T object) {
        return getORM().addOrUpdade(object);
    }
}
