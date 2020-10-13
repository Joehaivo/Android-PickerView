package com.bigkoo.pickerview.listener;

import com.bigkoo.pickerview.view.OptionsPickerView;

/**
 * Created by xiaosong on 2018/3/20.
 */

public interface OnOptionsSelectChangeListener<T> {

    void onOptionsSelectChanged(int options1, int options2, int options3, OptionsPickerView<T> pickerView);
}
