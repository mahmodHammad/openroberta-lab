// This file is automatically generated by the Open Roberta Lab.

#include <math.h>
#include <RobertaFunctions.h>   // Open Roberta library
#include <NEPODefs.h>

RobertaFunctions rob;

double ___item;
int _SensorPin_P = A0;
void setup()
{
    Serial.begin(9600); 
    ___item = analogRead(_SensorPin_P);
}

void loop()
{
}