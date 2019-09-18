package id.ac.polinema.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ExplicitIntentActivity extends AppCompatActivity {
    private EditText input;
    private TextView viewText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit_intent);
        input = findViewById(R.id.input_name);
        viewText = findViewById(R.id.text_output);
    }


    public void onSubmit(View view) {
        String txt = input.getText().toString();
        viewText.setText("Hay " + txt);
    }
}
