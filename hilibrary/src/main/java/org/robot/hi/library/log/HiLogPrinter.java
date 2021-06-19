package org.robot.hi.library.log;

import androidx.annotation.NonNull;

/**
 * @author mr.liuzhen@outlook.com (liu zhen)
 **/
public interface HiLogPrinter {
    void print(@NonNull HiLogConfig config, int level, String tag, @NonNull String printString);
}
