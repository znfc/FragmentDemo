package linlin.com.fragmentdemo;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements MyFragment.SendData{
    private My_Fragment my_fragment;
    private MyFragment myfragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.mybutton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager manager = getFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                if (myfragment == null) {
                    myfragment = new MyFragment();
                }

                //创建Bundle对象并传入数据
                Bundle bundle = new Bundle();
                bundle.putString("info", "这里是向Fragment传递的数据");
                myfragment.setArguments(bundle);
                transaction.add(R.id.my_framelayout, myfragment);
                transaction.show(myfragment);
                transaction.commit();
                Toast.makeText(MainActivity.this,"dianjiale ",Toast.LENGTH_SHORT).show();
            }
        });
    }

    //实现SendData接口，接收数据
    @Override
    public void sendMsg(String str) {
        ((TextView)findViewById(R.id.mytextview)).setText(str);
//        Toast.makeText(this, "成功接收\"" + str + "\"", Toast.LENGTH_SHORT).show();
    }
}
