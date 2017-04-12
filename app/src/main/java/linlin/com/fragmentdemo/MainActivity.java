package linlin.com.fragmentdemo;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private My_Fragment my_fragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager manager = getFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        if (my_fragment == null) {
            my_fragment = new My_Fragment();
        }
        transaction.add(R.id.my_framelayout, my_fragment);
        transaction.show(my_fragment);
        transaction.commit();
        findViewById(R.id.mybutton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"dianjiale ",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
