package org.robot.hi.library.log;

import android.view.PixelCopy;

/**
 * @author mr.liuzhen@outlook.com (liu zhen)
 **/
public abstract class HiLogConfig {
    static int MAX_LENGTH = 512;
    static HiStackTraceFormatter HI_STACK_TRACEFORMATTER = new HiStackTraceFormatter();
    static HiThreadFormatter HI_THREAD_FORMATTER = new HiThreadFormatter();
    public JsonParser injectJsonParser() {
        return null;
    }
    public String getGlobaTag() {
        return "HiLog";
    }
    public boolean includeThread() {
        return false;
    }
    public int stackTraceDepth() {
        return 5;
    }
    public HiLogPrinter[] printers() {
        return null;
    }
    public boolean enable() {
        return true;
    }
    public interface JsonParser {
        String toJson(Object src);
    }
}
