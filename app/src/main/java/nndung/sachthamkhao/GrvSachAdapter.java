package nndung.sachthamkhao;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

import nndung.sachthamkhao.data.Data;
import nndung.sachthamkhao.entity.Lop;

/**
 * Created by nndun on 3/6/2017.
 */

public class GrvSachAdapter extends BaseAdapter {

    Activity context;
    ArrayList<Lop> data = Data.DanhSachLop;
    public GrvSachAdapter (Activity context) {
        this.context = context;

    }
    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Lop getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return  data.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater=
                context.getLayoutInflater();
        convertView=inflater.inflate(R.layout.grv_lop, null);

        return convertView;
    }
}
