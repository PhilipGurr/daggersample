package com.philipgurr.daggersample.view;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.philipgurr.daggersample.R;
import com.philipgurr.daggersample.presenter.MainPresenter;

import butterknife.BindView;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    MainPresenter presenter;

    @BindView(R.id.random_string) TextView tvRandomString;
    @BindView(R.id.change_text) Button btChangeText;

    @OnClick(R.id.change_text)
    void onChangeTextClick() {
        presenter.onChangeTextClick();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
