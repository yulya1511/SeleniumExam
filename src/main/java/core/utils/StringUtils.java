package core.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StringUtils {

    public static String getUniqueString() {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("ЮHHmmddMMyyyy"));
    }
}
