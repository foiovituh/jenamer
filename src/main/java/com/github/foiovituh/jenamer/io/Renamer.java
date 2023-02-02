package com.github.foiovituh.jenamer.io;

import static com.github.foiovituh.jenamer.utils.Text.Meta.DOT;
import static com.github.foiovituh.jenamer.utils.Text.Meta.ZERO;
import static com.github.foiovituh.jenamer.utils.Text.cutLeft;
import static com.github.foiovituh.jenamer.utils.Text.info;
import com.github.foiovituh.jenamer.validation.Validator;
import java.io.File;
import java.util.concurrent.atomic.AtomicInteger;
import static java.util.stream.Collectors.toList;
import java.util.stream.Stream;
import static com.github.foiovituh.jenamer.utils.Text.getSystemFileSeparator;

public class Renamer {
    private final File element;
    private String path;
    
    public Renamer(String element) {
        this.element = new File(element);
        
        Validator.file(this.element);
    }
    
    public void renameAllFilesTo(String template, String separator) {
        final AtomicInteger atom = new AtomicInteger(0);
        final String bar = getSystemFileSeparator();
        
        Stream.of(element.listFiles())
                .filter(File::isFile)
                .collect(toList())
                .forEach(file -> {
                    final String name = file.getName();
                    final String type = name.substring(name.lastIndexOf(DOT.get()));
                    final String index = String.valueOf(atom.getAndIncrement());
                    
                    if (ZERO.get().equals(index)) {
                        this.path = file.getParent() + bar;
                    }
                    
                    Stream.of(path + template + separator + index + type)
                            .peek(newPath -> info(name, " -> ", cutLeft(bar, newPath)))
                            .findFirst()
                            .map(File::new)
                            .ifPresent(newFile -> {
                                file.renameTo(newFile);
                            });
                });
    }
}
