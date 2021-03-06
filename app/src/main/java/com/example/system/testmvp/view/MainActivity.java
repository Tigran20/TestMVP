package com.example.system.testmvp.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.system.testmvp.Contract;
import com.example.system.testmvp.presenter.Presenter;
import com.example.system.testmvp.R;

public class MainActivity extends AppCompatActivity implements Contract.View {

    private EditText editText;
    private Button button;
    private TextView textView;

    private Contract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        presenter = new Presenter(this);
    }

    private void init() {
        editText = findViewById(R.id.et);
        button = findViewById(R.id.btn);
        textView = findViewById(R.id.tv);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.buttonClicked();
            }
        });
    }

    @Override
    public String getField() {
        return editText.getText().toString();
    }

    @Override
    public void showText(String text) {
        textView.setText(text);
    }

    @Override
    public void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
