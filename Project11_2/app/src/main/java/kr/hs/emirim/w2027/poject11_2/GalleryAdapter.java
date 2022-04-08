package kr.hs.emirim.w2027.poject11_2;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class GalleryAdapter extends BaseAdapter {
    Context context;
    int[] posterIds = {R.drawable.mv1, R.drawable.mv2, R.drawable.mv3, R.drawable.mv4, R.drawable.mv5
            , R.drawable.mv6, R.drawable.mv7, R.drawable.mv8, R.drawable.mv9, R.drawable.mv10};

    public GalleryAdapter(Context context){
        this.context = context;
    }

    @Override
    public int getCount() {
        return posterIds.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        ImageView imgV = new ImageView(context);
        imgV.setLayoutParams(new ViewGroup.LayoutParams(200,300));
        imgV.setImageResource(posterIds[position]);
        imgV.setScaleType(ImageView.ScaleType.FIT_CENTER);
        return imgV;
    }
}
