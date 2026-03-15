package com.amalitech.colors.services.impl;

import com.amalitech.colors.services.RedPrinter;
import org.springframework.stereotype.Component;

@Component
public class EnglishRedPrinter implements RedPrinter {

    @Override
    public String print(){return "red";}
}
