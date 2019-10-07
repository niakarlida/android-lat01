package id.ac.poliban.mi.nia.latihan01;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnClear = findViewById(R.id.btnClear);
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText edNim = findViewById(R.id.edNim);
                edNim.setText("");
                EditText edName = findViewById(R.id.edName);
                edName.setText("");
                EditText edAddress = findViewById(R.id.edAddress);
                edAddress.setText("");
                EditText edPhone = findViewById(R.id.edPhone);
                edPhone.setText("");
            }
        });


}


}
