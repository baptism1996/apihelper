package ernest.linuxcmd;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class SortFragment extends Fragment {


    public TextView titleText;
    public Button backButton;
    public ListView listView;
    public ArrayAdapter<String> adapter;
    public static final int LEVEL_1=1;
    public static final int LEVEL_2=2;
    private int currentLevel;
    private List<String> dataList=new ArrayList<>();
    private List<String> sortList=new ArrayList<>();
    private List<String> apiList=new ArrayList<>();
    private String selectedSort;
    private String selectedApi;
    public AllData alldata=new AllData();



    public SortFragment() {
        // Required empty public constructor
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.choose_sort,container,false);
        titleText=(TextView)view.findViewById(R.id.title_text);
        backButton= (Button) view.findViewById(R.id.back_button);
        listView=(ListView)view.findViewById(R.id.list_view) ;
        adapter=new ArrayAdapter<>(getContext(),android.R.layout.simple_list_item_1,dataList);
        listView.setAdapter(adapter);
        querySort();
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(currentLevel==LEVEL_1){
                    selectedSort=sortList.get(i);
                    queryaApi();
                }else if(currentLevel==LEVEL_2){
                    selectedApi=apiList.get(i);
                    MainActivity activity= (MainActivity) getActivity();
                    activity.showCmdDetail(selectedApi);


                }
            }
        });
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                querySort();
            }
        });
        return view;
    }





    private void queryaApi() {
        titleText.setText(selectedSort);
        backButton.setVisibility(View.VISIBLE);
        switch (selectedSort){
            case "文件I/O":apiList=alldata.getApiList1();break;
            case "文件和目录":apiList=alldata.getApiList2();break;
            case "标准I/O库":apiList=alldata.getApiList3();break;
            case "系统数据文件和信息":apiList=alldata.getApiList4();break;
            case "进程":apiList=alldata.getApiList5();break;
            case "信号":apiList=alldata.getApiList6();break;
        }
        dataList.clear();
        for(String api:apiList){
            dataList.add(api);
        }
        adapter.notifyDataSetChanged();
        currentLevel=LEVEL_2;

    }

    private void querySort() {
        titleText.setText("API目录");
        backButton.setVisibility(View.GONE);
        sortList=alldata.getSortList();
        dataList.clear();
        for(String sort:sortList){
            dataList.add(sort);
        }
        adapter.notifyDataSetChanged();
        currentLevel=LEVEL_1;
    }


}
