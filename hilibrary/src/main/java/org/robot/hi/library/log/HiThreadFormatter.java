package org.robot.hi.library.log;

/**
 * @author mr.liuzhen@outlook.com (liu zhen)
 **/
public class HiThreadFormatter implements HiLogFormatter<Thread> {
    @Override
    public String format(Thread thread) {
        return "Thread : " + thread.getName();
    }
}
