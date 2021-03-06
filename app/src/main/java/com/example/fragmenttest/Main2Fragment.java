package com.example.fragmenttest;

import android.support.v4.app.Fragment;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ViewById;

@EFragment(R.layout.fragment_main2)
public class Main2Fragment extends Fragment {

    @ViewById
    TextView textView;

    @ViewById
    EditText editTest;

    @ViewById
    Button buttonTest;

    @Click
    void buttonTest() {
        Toast.makeText(getContext(), editTest.getText().toString(), Toast.LENGTH_SHORT).show();
    }

    @Click
    void buttonCallMainMethod() {
        MainActivity activity = (MainActivity) getActivity();
        activity.mainMethod(getClass().getSimpleName());
    }
}
