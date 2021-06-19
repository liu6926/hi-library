package org.robot.hi.library.log;

/**
 * @author mr.liuzhen@outlook.com (liu zhen)
 **/
public interface HiLogFormatter<T> {
    String format(T data);
}
