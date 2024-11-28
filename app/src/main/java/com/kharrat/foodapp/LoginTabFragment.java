package com.kharrat.foodapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link LoginTabFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class LoginTabFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private EditText email_field;
    private EditText passw_field;
    private Button btn;
    private TextView f_passw_txt;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public LoginTabFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment LoginTabFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static LoginTabFragment newInstance(String param1, String param2) {
        LoginTabFragment fragment = new LoginTabFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v  =inflater.inflate(R.layout.fragment_login_tab, container, false);

        email_field = v.findViewById(R.id.email_field);
        passw_field = v.findViewById(R.id.passw_field);
        f_passw_txt = v.findViewById(R.id.f_passw_txt);
        btn = v.findViewById(R.id.login_btn);

        email_field.setTranslationY(100);
        email_field.setAlpha(0);
        email_field.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(400).start();


        passw_field.setTranslationY(100);
        passw_field.setAlpha(0);
        passw_field.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(400).start();

        btn.setTranslationY(100);
        btn.setAlpha(0);
        btn.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(400).start();

        f_passw_txt.setTranslationY(100);
        f_passw_txt.setAlpha(0);
        f_passw_txt.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(400).start();

        return v;
    }
}