package nndung.sachthamkhao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import nndung.sachthamkhao.entity.Lop;

public class MonHocActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mon_hoc);
        Lop lop = (Lop)getIntent().getSerializableExtra("lop");
        Toast.makeText(MonHocActivity.this,lop.getTenLop(), Toast.LENGTH_SHORT).show();
    }
}
