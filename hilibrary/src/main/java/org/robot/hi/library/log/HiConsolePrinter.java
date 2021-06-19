package org.robot.hi.library.log;

import android.util.Log;

import androidx.annotation.NonNull;

import static org.robot.hi.library.log.HiLogConfig.MAX_LENGTH;

/**
 * @author mr.liuzhen@outlook.com (liu zhen)
 **/
public class HiConsolePrinter implements HiLogPrinter {
    @Override
    public void print(@NonNull HiLogConfig config, int level, String tag, @NonNull String printString) {
        int length = printString.length();
        int countOfSub = length / MAX_LENGTH;
        if (countOfSub > 0) {
            int index = 0;
            for (int i = 0; i < countOfSub; i++) {
                Log.println(level, tag, printString.substring(index, index + MAX_LENGTH));
                index += MAX_LENGTH;
            }
            if (index != length) {
            Log.println(level, tag, printString.substring(index, length));
            }
        } else {
            Log.println(level, tag, printString);
        }
    }
}
