package com.github.foiovituh.jenamer.utils;

import static java.util.stream.Collectors.joining;
import java.util.stream.Stream;

public final class Text {
    private Text() {}
    
    public enum Meta {
        DOT("."),
        ZERO("0"),
        ;
        
        private final String meta;

        Meta(String meta) {
            this.meta = meta;
        }

        public String get() {
            return meta; 
        }
    }
    
    public static final void info(String ... elements) {
        info(Stream.of(elements).collect(joining()));
    }
    
    public static final void info(String message) {
        System.out.println(message);
    }
    
    public static String cutLeft(String lastIndexOf, String text) {
        return text.substring(text.lastIndexOf(lastIndexOf) + 1);
    }
    
    public static void alert(String message) {
        info(message);
        System.exit(0);
    }
    
    public static String getSystemFileSeparator() {
        return System.getProperties().getProperty("file.separator");
    }
}
