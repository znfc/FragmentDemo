package linlin.com.fragmentdemo;

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
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.myfragment, container, false);
        TextView tv = (TextView) view.findViewById(R.id.textView);

        //获取数据
        String text = getArguments().get("info") + "";
        tv.setText(text);
        return view;
    }
}
