package mx.edu.tesoem.isc.tsdmh252_252_lgsl_e4;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class saludoActivity extends AppCompatActivity {

    TextView lbl1p2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_saludo);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        lbl1p2 = findViewById(R.id.lbl1p);

        Bundle datos = getIntent().getExtras();
        lbl1p2.setText("Bienvenido "+ datos.getString("nombre")+", ya estas aprendiendo a programar android");

    }
}