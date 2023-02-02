package com.github.foiovituh.jenamer.validation;

import com.github.foiovituh.jenamer.io.Help;
import static com.github.foiovituh.jenamer.utils.Text.alert;
import static com.github.foiovituh.jenamer.validation.Message.DIRECTORY_NOT_FOUND;
import static com.github.foiovituh.jenamer.validation.Message.MISSING_ARGUMENTS;
import static com.github.foiovituh.jenamer.validation.Message.MUST_BE_DIRECTORY;
import java.io.File;
import java.util.stream.Stream;

public final class Validator {
    private Validator() {}
    
    public static void arguments(String[] arguments, int expected) {
        Stream.of(arguments).findFirst().ifPresent(Help::showReadmeMd);
        
        if (arguments.length < expected) {
            alert(MISSING_ARGUMENTS.getWithHelp());
        } 
    }
    
    public static void file(File file) {
        final Message message = !file.exists()
                ? DIRECTORY_NOT_FOUND
                : !file.isDirectory()
                    ? MUST_BE_DIRECTORY
                    : null;
        
         if (message != null) {
             alert(message.getWithHelp());
         }
    }
}
