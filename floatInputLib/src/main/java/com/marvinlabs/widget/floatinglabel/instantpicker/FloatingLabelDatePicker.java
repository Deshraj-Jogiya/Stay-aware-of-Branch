package com.marvinlabs.widget.floatinglabel.instantpicker;

import android.content.Context;
import android.util.AttributeSet;

import com.marvinlabs.widget.floatinglabel.R;

import java.text.DateFormat;


public class FloatingLabelDatePicker<DateInstantT extends DateInstant> extends FloatingLabelInstantPicker<DateInstantT> {

    // =============================================================================================
    // Lifecycle
    // ==

    public FloatingLabelDatePicker(Context context) {
        super(context);
    }

    public FloatingLabelDatePicker(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public FloatingLabelDatePicker(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    // =============================================================================================
    // Overridden methods
    // ==


    @Override
    protected int getDefaultDrawableRightResId() {
        return R.drawable.ic_datepicker;
    }

    @Override
    protected InstantPrinter<DateInstantT> getDefaultInstantPrinter() {
        return new JavaDatePrinter<DateInstantT>(DateFormat.MEDIUM);
    }
}
