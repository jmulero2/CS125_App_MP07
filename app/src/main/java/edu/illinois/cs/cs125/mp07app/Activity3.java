package edu.illinois.cs.cs125.mp07app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import java.util.ArrayList;
import android.widget.ArrayAdapter;


public class Activity3 extends AppCompatActivity {

    private EditText text;
    private Button buttonAdd;
    private ListView view;
    private ArrayList<String> arrList;
    private ArrayAdapter<String> arrAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        text = (EditText) findViewById(R.id.editText);
        buttonAdd = (Button) findViewById(R.id.buttonAdd);
        view = (ListView) findViewById(R.id.view);

        arrList = new ArrayList<String>();
        arrAdapter = new ArrayAdapter<String>(Activity3.this,
                android.R.layout.simple_list_item_1, arrList);
//        View.OnClickListener addListener = new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                arrList.add(text.getText().toString());
//                text.setText("");
//                arrAdapter.notifyDataSetChanged();
//            }
//        };
//        view.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
//            @Override
//            public boolean onItemLongClick(AdapterView<?> parent,
//                                           View v, int position,
//                                           long id) {
//                SparseBooleanArray checkPosition = view.getCheckedItemPositions();
//                int count = view.getCount();
//                for(int i = count - 1; i >= 0; i--) {
//                    if (checkPosition.get(i)) {
//                        arrAdapter.remove(arrList.get(i));
//                    }
//                }
//                checkPosition.clear();
//                arrAdapter.notifyDataSetChanged();
//                return false;
//            }
//        });
        view.setAdapter(arrAdapter);
        onButtonClick();
    }

    public void onButtonClick() {
        buttonAdd.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String input = text.getText().toString();
                arrList.add(input);
                arrAdapter.notifyDataSetChanged();
            }
        });

    }
}
