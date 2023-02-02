package com.github.foiovituh.jenamer.validation;

public enum Message {
    MISSING_ARGUMENTS("Missing arguments"),
    DIRECTORY_NOT_FOUND("Directory not found"),
    HELP("! For more information, type --help"),
    MUST_BE_DIRECTORY("The first argument must be the path of a directory"),
    README_NOT_FOUND("README.md was not found in the root path, please check "
            + "if it has been moved");
    
    private final String message;
    
    Message(String message) {
        this.message = message;
    }
    
    public String get() {
        return message;
    }
    
    public String getWithHelp() {
        return message + HELP.get();
    }
}
