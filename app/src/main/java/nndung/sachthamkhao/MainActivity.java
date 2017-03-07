package nndung.sachthamkhao;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import nndung.sachthamkhao.entity.Lop;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GridView grv = (GridView) findViewById(R.id.grvLop);

        GrvSachAdapter adapter = new GrvSachAdapter(MainActivity.this);
        grv.setAdapter(adapter);

        grv.setClickable(true);
        grv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Lop lop = (Lop)parent.getItemAtPosition(position);
                Toast.makeText(MainActivity.this,lop.getTenLop(),Toast.LENGTH_SHORT).show();
            }
        });
    }


}


