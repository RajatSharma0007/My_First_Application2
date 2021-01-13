package rajat.app.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button login;
    EditText inputUsername;
    EditText inputPassward;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login = findViewById(R.id.loginButton);
        login.setOnClickListener(this);
        inputUsername = findViewById(R.id.loginView);
        inputPassward = findViewById(R.id.passwordView);
    }

    @Override
    public void onClick(View v) {
        String userName = inputUsername.getText().toString();
        String password = inputPassward.getText().toString();
        Toast.makeText(this, userName+" "+password+" ", Toast.LENGTH_LONG).show();
    }
}