package io.mahendra.calendarview.decor;

import android.support.annotation.NonNull;

import io.mahendra.calendarview.widget.DayView;

/**
 * @author Mahendra Sharma
 */
public interface DayDecorator {

    /**
     *
     * @param cell
     */
    void decorate(@NonNull DayView cell);
}