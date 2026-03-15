package com.amalitech.colors.services.impl;

import com.amalitech.colors.services.GreenPrinter;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


//@Primary
//@Component
public class EnglishGreenPrinter implements GreenPrinter {


    @Override
    public String print(){

        return "green";

    }
}

