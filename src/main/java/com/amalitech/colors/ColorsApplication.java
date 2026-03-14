package com.amalitech.colors;

import com.amalitech.colors.services.ColourPrinter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ColorsApplication implements CommandLineRunner {

    private ColourPrinter colourPrinter;

    public ColorsApplication(ColourPrinter colourPrinter){
        this.colourPrinter = colourPrinter;
    }


    private static final Logger log = LogManager.getLogger(ColorsApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(ColorsApplication.class, args);
    }


    @Override
    public void run(String[] args) throws Exception {
        log.info(colourPrinter.print());
    }
}
