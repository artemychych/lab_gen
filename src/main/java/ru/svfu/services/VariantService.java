package ru.svfu.services;

public class VariantService {

    private Integer variant;
    private String[] variables;

    public VariantService(Integer variant, String[] variables) {
        this.variant = variant;
        this.variables = variables;
    }

    public String createTextWithVariant() {
        int counter = variant % variables.length;
        
        return variables[counter];
    }
}
