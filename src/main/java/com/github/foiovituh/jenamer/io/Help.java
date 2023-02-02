package com.github.foiovituh.jenamer.io;

import static com.github.foiovituh.jenamer.utils.Text.alert;
import static com.github.foiovituh.jenamer.validation.Message.README_NOT_FOUND;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import static java.util.stream.Collectors.toSet;
import java.util.stream.Stream;

public final class Help {
    private static final Set<String> HELP_ARGUMENTS = Stream.of("--help", "--h")
            .collect(toSet());
        
    private Help() {}
    
    public static void showReadmeMd(String sos) {
        if (!HELP_ARGUMENTS.contains(sos)) {
            return;
        }
        
        final File readmeMd = new File("README.md");
        
        if (readmeMd.exists()) {
            try {
                Files.lines(readmeMd.toPath()).forEach(System.out::println);
            } catch (IOException io) {
                Logger.getLogger(Help.class.getName()).log(Level.WARNING, null, io);
            } finally {
                System.exit(0);
            }
        }
        
        alert(README_NOT_FOUND.get());
    }
}
