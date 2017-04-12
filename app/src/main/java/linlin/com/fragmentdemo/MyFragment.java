package linlin.com.fragmentdemo;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by zhaopenglin on 2017/4/11.
 */

public class MyFragment extends Fragment {
    private SendData sendData;

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        //获取实现的接口对象
        sendData = (SendData) activity;
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.myfragment, container, false);
        TextView tv = (TextView) view.findViewById(R.id.textView);

        //获取数据
        String text = getArguments().get("info") + "";
        tv.setText(text);

        //通过接口对象传递数据
        sendData.sendMsg("this is a test.");
        return view;
    }


    //定义一个回调接口
    public interface SendData{
        void sendMsg(String str);
    }
}
