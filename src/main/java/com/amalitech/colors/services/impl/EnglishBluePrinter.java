package com.amalitech.colors.services.impl;

import com.amalitech.colors.services.BluePrinter;
import org.springframework.stereotype.Component;

@Component
public class EnglishBluePrinter implements BluePrinter {

    @Override
    public String print(){return "blue";}
}
