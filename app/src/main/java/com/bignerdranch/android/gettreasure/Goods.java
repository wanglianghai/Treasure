package com.bignerdranch.android.gettreasure;

import java.util.UUID;

/**
 * Created by Administrator on 2017/4/24/024.
 */

public class Goods {
    private UUID mId;
    private String mName;

    public Goods() {
        mId = UUID.randomUUID();
    }

    public UUID getId() {
        return mId;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }
}
