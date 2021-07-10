package sanskar.kumar.kumarsanskar.toastenteredtext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText enterText;
    Button pressHere;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        enterText = (EditText) findViewById(R.id.editText);
        pressHere = (Button) findViewById(R.id.button);
        pressHere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputText = enterText.getText().toString();
                Toast.makeText(MainActivity.this, "The entered text is " + inputText, Toast.LENGTH_SHORT).show();

            }
        });

    }
}