package com.amalitech.colors.services.impl;

import com.amalitech.colors.services.BluePrinter;
import com.amalitech.colors.services.ColourPrinter;
import com.amalitech.colors.services.GreenPrinter;
import com.amalitech.colors.services.RedPrinter;
import org.springframework.stereotype.Component;

@Component
public class ColourPrinterImpl implements ColourPrinter {

    BluePrinter bluePrinter;
    RedPrinter redPrinter;
    GreenPrinter greenPrinter;


    public ColourPrinterImpl(RedPrinter redPrinter, BluePrinter bluePrinter, GreenPrinter greenPrinter){
        this.redPrinter = redPrinter;
        this.bluePrinter = bluePrinter;
        this.greenPrinter = greenPrinter;
    }


    @Override
    public String print() {
        return String.join(" ,", redPrinter.print(), bluePrinter.print(), greenPrinter.print());
    }
}
