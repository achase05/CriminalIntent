package com.mysotd.android.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by Adam on 3/3/2016.
 */
public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
