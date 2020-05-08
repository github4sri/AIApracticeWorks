package com.sri.aiapracticework.topmovies;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;

import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.sri.aiapracticework.R;

import org.jetbrains.annotations.NotNull;

public class DividerItemDecoration extends RecyclerView.ItemDecoration {

    private Drawable mDivider;

    DividerItemDecoration(Context context) {
        mDivider = ContextCompat.getDrawable(context, R.drawable.recyclerview_divider_normal);
    }

    @Override
    public void onDrawOver(@NotNull Canvas c, RecyclerView parent, @NotNull RecyclerView.State state) {
        int left = parent.getPaddingLeft();
        int right = parent.getWidth() - parent.getPaddingRight();

        int childCount = parent.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View child = parent.getChildAt(i);

            RecyclerView.LayoutParams params = (RecyclerView.LayoutParams) child.getLayoutParams();

            int top = child.getBottom() + params.bottomMargin;
            int bottom = top + mDivider.getIntrinsicHeight();

            mDivider.setBounds(left, top, right, bottom);
            mDivider.draw(c);
        }
    }
}
