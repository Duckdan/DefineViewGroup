package com.study.yang.android000_defineviewgroup.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.study.yang.android000_defineviewgroup.R;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;

/**
 * Created by zouqianyu on 2018/3/17.
 */

public class DefineViewGroup extends LinearLayout {
    private final Context context;
    private int position;
    private boolean isToggle;
    private String title;
    private TextView tvTitle;
    private ImageView ivToggle;

    public DefineViewGroup(Context context) {
        this(context, null);
    }

    public DefineViewGroup(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public DefineViewGroup(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context = context;
        init(attrs);
    }

    private void init(AttributeSet attrs) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.view_setting_item, this);
        TypedArray ta = context.obtainStyledAttributes(attrs, R.styleable.DefineViewGroup);
        position = ta.getInt(R.styleable.DefineViewGroup_position, 0);
        isToggle = ta.getBoolean(R.styleable.DefineViewGroup_isToggle, false);
        title = ta.getString(R.styleable.DefineViewGroup_title);
        switch (position) {
            case 0:
                setBackgroundResource(R.drawable.seting_first_selector);
                break;
            case 1:
                setBackgroundResource(R.drawable.seting_middle_selector);
                break;
            case 2:
                setBackgroundResource(R.drawable.seting_last_selector);
                break;
        }
        tvTitle = (TextView) inflate.findViewById(R.id.view_tv_title);
        tvTitle.setText(title);
        ivToggle = (ImageView) inflate.findViewById(R.id.view_iv_toggle);
        ivToggle.setImageResource(isToggle ? R.drawable.on : R.drawable.off);
    }

    public boolean isToggle() {
        return isToggle;
    }

    public void setToggle(boolean isToggle) {
        this.isToggle = isToggle;
        ivToggle.setImageResource(isToggle ? R.drawable.on : R.drawable.off);
    }
}
