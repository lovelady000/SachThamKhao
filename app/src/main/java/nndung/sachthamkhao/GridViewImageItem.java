package nndung.sachthamkhao;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * Created by nndun on 3/6/2017.
 */

public class GridViewImageItem extends ImageView {
    public GridViewImageItem(Context context) {
        super(context);
    }

    public GridViewImageItem(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public GridViewImageItem(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, widthMeasureSpec); // This is the key that will make the height equivalent to its width
    }
}
