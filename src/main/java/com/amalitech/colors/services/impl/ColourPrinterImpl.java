package com.amalitech.colors.services.impl;

import com.amalitech.colors.services.BluePrinter;
import com.amalitech.colors.services.ColourPrinter;
import com.amalitech.colors.services.GreenPrinter;
import com.amalitech.colors.services.RedPrinter;

public class ColourPrinterImpl implements ColourPrinter {

    BluePrinter bluePrinter;
    RedPrinter redPrinter;
    GreenPrinter greenPrinter;


    public ColourPrinterImpl(){
      this.bluePrinter = new BluePrinterImpl();
      this.redPrinter = new RedPrinterImpl();
      this.greenPrinter = new GreenPrinterImpl();
    }


    @Override
    public String print() {
        return String.join(" ,", redPrinter.print(), bluePrinter.print(), greenPrinter.print());
    }
}
