package com.amalitech.colors.config;

import com.amalitech.colors.services.BluePrinter;
import com.amalitech.colors.services.ColourPrinter;
import com.amalitech.colors.services.GreenPrinter;
import com.amalitech.colors.services.RedPrinter;
import com.amalitech.colors.services.impl.ColourPrinterImpl;
import com.amalitech.colors.services.impl.EnglishBluePrinter;
import com.amalitech.colors.services.impl.EnglishGreenPrinter;
import com.amalitech.colors.services.impl.EnglishRedPrinter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PrinterConfig {

    @Bean
    public BluePrinter bluePrinter(){
        return new EnglishBluePrinter();
    }

    @Bean
    public RedPrinter redPrinter(){
        return new EnglishRedPrinter();
    }

    @Bean
    public GreenPrinter greenPrinter(){
        return new EnglishGreenPrinter();
    }

    @Bean
    public ColourPrinter colourPrinter(RedPrinter redPrinter, BluePrinter bluePrinter, GreenPrinter greenPrinter){
        return new ColourPrinterImpl(redPrinter, bluePrinter, greenPrinter);
    }

}
