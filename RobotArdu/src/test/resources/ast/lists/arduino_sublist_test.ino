// This file is automatically generated by the Open Roberta Lab.

#include <math.h>
#include <RobertaFunctions.h>   // Open Roberta library
#include <ArduinoSTL.h>
#include <list>
#include <NEPODefs.h>

RobertaFunctions rob;

std::list<double> ___item;
std::list<double> ___item2;
int _led_L = 13;
void setup()
{
    Serial.begin(9600); 
    pinMode(_led_L, OUTPUT);
    ___item = {0, 0, 0};
    ___item2 = {0, 0, 0};
}

void loop()
{
    ___item2 = _getSubList(___item, 0, 0);
    ___item2 = _getSubList(___item, 0, ___item.size() - 1 - 0);
    ___item2 = _getSubList(___item, 0, ___item.size() - 1);
    ___item2 = _getSubList(___item, ___item.size() - 1 - 0, 0);
    ___item2 = _getSubList(___item, ___item.size() - 1 - 0, ___item.size() - 1 - 0);
    ___item2 = _getSubList(___item, ___item.size() - 1 - 0, ___item.size() - 1);
    ___item2 = _getSubList(___item, 0, 0);
    ___item2 = _getSubList(___item, 0, ___item.size() - 1 - 0);
    ___item2 = _getSubList(___item, 0, ___item.size() - 1);
}