package com.jayjaylab.ui.anatomy.util;

import android.content.Context;
import android.support.annotation.NonNull;
import android.util.TypedValue;

/**
 * Created by jjkim on 2016. 7. 19..
 */
public class AndroidUtils {
    /**
     * This method converts dp unit to equivalent pixels, depending on device density.
     *
     * @param dp A value in dp (density independent pixels) unit. Which we need to convert into pixels
     * @param context Context to get resources and device specific display metrics
     * @return A float value to represent px equivalent to dp depending on device density
     */
    public static float convertDpToPixel(float dp, @NonNull Context context) {
        Objects.requireNonNull(context, "context is null");

        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp,
                context.getResources().getDisplayMetrics());
    }

    public static int getScreenWidth(@NonNull Context context) {
        Objects.requireNonNull(context, "context is null");

        return context.getResources().getDisplayMetrics().widthPixels;
    }
}
