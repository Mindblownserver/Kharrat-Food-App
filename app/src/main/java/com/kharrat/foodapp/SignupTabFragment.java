package com.kharrat.foodapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SignupTabFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SignupTabFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private EditText email_field;
    private EditText passw_field1;
    private EditText passw_field2;
    private Button btn;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public SignupTabFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SignupTabFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static SignupTabFragment newInstance(String param1, String param2) {
        SignupTabFragment fragment = new SignupTabFragment();
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
        View v = inflater.inflate(R.layout.fragment_signup_tab, container, false);

        email_field = v.findViewById(R.id.email_field);
        passw_field1 = v.findViewById(R.id.passw_field1);
        passw_field2 = v.findViewById(R.id.passw_field2);
        btn = v.findViewById(R.id.signup_btn);

        // animation
        email_field.setTranslationY(100);
        email_field.setAlpha(0);
        email_field.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(400).start();

        passw_field1.setTranslationY(100);
        passw_field1.setAlpha(0);
        passw_field1.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(400).start();

        passw_field2.setTranslationY(100);
        passw_field2.setAlpha(0);
        passw_field2.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(400).start();

        btn.setTranslationY(100);
        btn.setAlpha(0);
        btn.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(400).start();


        return v;
    }
}