package gcm_test.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import gcm_test.app.gcm.RegistrationIntentService;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Intent(this, RegistrationIntentService.class);
    }
}
