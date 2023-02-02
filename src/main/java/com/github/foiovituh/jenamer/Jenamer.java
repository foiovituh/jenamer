package com.github.foiovituh.jenamer;

import com.github.foiovituh.jenamer.io.Renamer;
import com.github.foiovituh.jenamer.validation.Validator;

public final class Jenamer {
    private static final int NECESSARY_ARGUMENTS = 3;
    
    public static void main(String[] args) {
        Validator.arguments(args, NECESSARY_ARGUMENTS);
        new Renamer(args[0]).renameAllFilesTo(args[1], args[2]);
    }
}
