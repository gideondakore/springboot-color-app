package com.amalitech.colors.services.impl;

import com.amalitech.colors.services.GreenPrinter;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component
@Service
public class SpanishGreenPrinter implements GreenPrinter {

    @Override
    public String print(){
        return "verde";
    }
}
