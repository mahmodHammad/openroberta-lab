package de.fhg.iais.roberta.syntax.codegen.arduino.mbot;

import org.junit.Test;

import de.fhg.iais.roberta.util.test.ardu.HelperMBotForXmlTest;

public class ColourUsageTest {
    private final HelperMBotForXmlTest h = new HelperMBotForXmlTest();

    @Test
    public void colourUsageTest() throws Exception {
        StringBuilder correctCode = new StringBuilder();
        correctCode
            .append("// This file is automatically generated by the Open Roberta Lab.")
            .append("#define ANALOG2PERCENT 0.0978")
            .append("#include <math.h>")
            .append("#include <MeMCore.h>")
            .append("#include <Wire.h>")
            .append("#include <SoftwareSerial.h>")
            .append("#include <MeDrive.h>")
            .append("#include <NEPODefs.h>")
            .append("#include <RobertaFunctions.h>")
            .append("MeRGBLed _meRgbLed(7, 2);")
            .append("RobertaFunctions rob;")
            .append("unsigned int ___item;")
            .append("unsigned int ___item2;")
            .append("unsigned int ___item3;")
            .append("std::list<double> ___item4;")
            .append("void setup()")
            .append("{")
            .append("Serial.begin(9600);")
            .append("___item = RGB(0xFF, 0xFF, 0xFF);")
            .append("___item2 = ___item;")
            .append("___item3 = RGB(255, 20, 150);")
            .append("___item4 = {24, 48, 65};")
            .append("}")
            .append("void loop()")
            .append("{")
            .append("_meRgbLed.setColor(1, ( 25 + 25 ) * 2, 120, 120);")
            .append("_meRgbLed.show();")
            .append("_meRgbLed.setColor(1, RCHANNEL(___item), GCHANNEL(___item), BCHANNEL(___item));")
            .append("_meRgbLed.show();")
            .append("_meRgbLed.setColor(1, 0xFF, 0xFF, 0xFF);")
            .append("_meRgbLed.show();")
            .append("_meRgbLed.setColor(2, RCHANNEL(___item), GCHANNEL(___item), BCHANNEL(___item));")
            .append("_meRgbLed.show();")
            .append("_meRgbLed.setColor(2, _getListElementByIndex(___item4, 1), 120, 120);")
            .append("_meRgbLed.show();")
            .append("_meRgbLed.setColor(2, 0, 0, 0);")
            .append("_meRgbLed.show();")
            .append("_meRgbLed.setColor(1, 0, 0, 0);")
            .append("_meRgbLed.show();")
            .append("}");
        this.h.assertCodeIsOk(correctCode.toString(), "/ast/colour/mbot_colours.xml", true);
    }

}