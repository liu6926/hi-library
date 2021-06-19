package org.robot.hi.library.log;

/**
 * @author mr.liuzhen@outlook.com (liu zhen)
 **/
public class HiStackTraceFormatter implements HiLogFormatter<StackTraceElement[]> {
    @Override
    public String format(StackTraceElement[] stackTrace) {
        StringBuilder stringBuilder = new StringBuilder(128);
        if (stackTrace == null || stackTrace.length == 0) {
            return null;
        } else if (stackTrace.length == 1) {
            return "\t- " + stackTrace[0].toString();
        } else {
            for (int i = 0, length = stackTrace.length; i < length; i++) {
                if (i == 0) {
                    stringBuilder.append("stackTrace : \n");
                }
                if (i != length - 1) {
                    stringBuilder.append("\t├ ");
                    stringBuilder.append(stackTrace[i].toString());
                    stringBuilder.append("\n");
                } else {
                    stringBuilder.append("\t└");
                    stringBuilder.append(stackTrace[i].toString());
                }
            }
            return stringBuilder.toString();
        }
    }
}
