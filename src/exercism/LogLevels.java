package exercism;

public class LogLevels {
    public static String message(String logLine) {
        return logLine.substring(logLine.indexOf(":") + 1).trim();
    }

    public static String logLevel(String logLine) {
        return logLine.substring(logLine.indexOf("[") + 1, logLine.indexOf("]:")).trim().toLowerCase();
    }

    public static String reformat(String logLine) {
        return message(logLine).concat(" ").concat("(") + logLevel(logLine).concat(")");
    }


    public static void main(String[] args) {
        System.out.println(LogLevels.message("[ERROR]:Invalid operation"));
        System.out.println(LogLevels.message("[WARNING]:  Disk almost full\r\n"));

        System.out.println(LogLevels.logLevel("[ERROR]: Invalid operation"));
        System.out.println(LogLevels.logLevel("[WARNING]:  Disk almost full\n"));

        System.out.println(LogLevels.reformat("[INFO]: Operation completed"));
    }
}
