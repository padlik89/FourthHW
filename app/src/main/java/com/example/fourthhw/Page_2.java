package com.example.fourthhw;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Page_2  extends Fragment {

    public Page_2 () {};

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View PageTwo = inflater.inflate(R.layout.page2, container, false);
        return PageTwo;
    }
}
