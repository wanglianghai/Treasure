package com.bignerdranch.android.gettreasure;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.os.Bundle;

public class TreasureActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return TreasureFragment.newInstance();
    }
}
