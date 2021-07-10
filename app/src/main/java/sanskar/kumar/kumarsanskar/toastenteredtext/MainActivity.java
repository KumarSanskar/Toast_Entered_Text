package sanskar.kumar.kumarsanskar.toastenteredtext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText enterText;
    Button pressHere;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        enterText = (EditText) findViewById(R.id.editText);
        pressHere = (Button) findViewById(R.id.button);

    }
}