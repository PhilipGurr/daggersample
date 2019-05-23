package com.philipgurr.daggersample.view;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.philipgurr.daggersample.R;
import com.philipgurr.daggersample.presenter.MainPresenter;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import dagger.android.AndroidInjection;

public class MainActivity extends AppCompatActivity implements MainView {
    @Inject
    MainPresenter presenter;

    @BindView(R.id.random_string) TextView tvRandomString;
    @BindView(R.id.change_text) Button btChangeText;

    @OnClick(R.id.change_text)
    void onChangeTextClick(View view) {
        presenter.onChangeTextClick();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @Override
    public void setRandomString(String text) {
        tvRandomString.setText(text);
    }
}
