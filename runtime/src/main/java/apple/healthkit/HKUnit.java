package apple.healthkit;


import java.io.*;
import java.nio.*;
import java.util.*;
import com.google.j2objc.annotations.*;
import com.google.j2objc.runtime.*;
import com.google.j2objc.runtime.block.*;
import apple.audiotoolbox.*;
import apple.corefoundation.*;
import apple.coregraphics.*;
import apple.coreservices.*;
import apple.foundation.*;



/**
 * @since Available in iOS 8.0 and later.
 */

@Library("HealthKit/HealthKit.h") @Mapping("HKUnit")
public class HKUnit 
    extends NSObject 
    implements NSCopying {

    
    public static final double MolarMassBloodGlucose = 180.15588000005408;
    
    
    @Mapping("init")
    public HKUnit() { }
    
    
    @Mapping("unitString")
    public native String getUnitString();
    
    
    
    @Mapping("isNull")
    public native boolean isNull();
    @Mapping("unitFromString:")
    public static native HKUnit fromString(String string);
    @Mapping("unitFromMassFormatterUnit:")
    public static native HKUnit fromMassFormatterUnit(@Representing("NSMassFormatterUnit") long massFormatterUnit);
    @Mapping("massFormatterUnitFromUnit:")
    public static native @Representing("NSMassFormatterUnit") long createMassFormatterUnit(HKUnit unit);
    @Mapping("unitFromLengthFormatterUnit:")
    public static native HKUnit fromLengthFormatterUnit(@Representing("NSLengthFormatterUnit") long lengthFormatterUnit);
    @Mapping("lengthFormatterUnitFromUnit:")
    public static native @Representing("NSLengthFormatterUnit") long createLengthFormatterUnit(HKUnit unit);
    @Mapping("unitFromEnergyFormatterUnit:")
    public static native HKUnit fromEnergyFormatterUnit(@Representing("NSEnergyFormatterUnit") long energyFormatterUnit);
    @Mapping("energyFormatterUnitFromUnit:")
    public static native @Representing("NSEnergyFormatterUnit") long createEnergyFormatterUnit(HKUnit unit);
    @Mapping("gramUnitWithMetricPrefix:")
    public static native HKUnit gram(@Representing("HKMetricPrefix") long prefix);
    @Mapping("gramUnit")
    public static native HKUnit gram();
    @Mapping("ounceUnit")
    public static native HKUnit ounce();
    @Mapping("poundUnit")
    public static native HKUnit pound();
    @Mapping("stoneUnit")
    public static native HKUnit stone();
    @Mapping("moleUnitWithMetricPrefix:molarMass:")
    public static native HKUnit mole(@Representing("HKMetricPrefix") long prefix, double gramsPerMole);
    @Mapping("moleUnitWithMolarMass:")
    public static native HKUnit mole(double gramsPerMole);
    @Mapping("meterUnitWithMetricPrefix:")
    public static native HKUnit meter(@Representing("HKMetricPrefix") long prefix);
    @Mapping("meterUnit")
    public static native HKUnit meter();
    @Mapping("inchUnit")
    public static native HKUnit inch();
    @Mapping("footUnit")
    public static native HKUnit foot();
    @Mapping("mileUnit")
    public static native HKUnit mile();
    @Mapping("literUnitWithMetricPrefix:")
    public static native HKUnit liter(@Representing("HKMetricPrefix") long prefix);
    @Mapping("literUnit")
    public static native HKUnit liter();
    @Mapping("fluidOunceUSUnit")
    public static native HKUnit fluidOunceUS();
    @Mapping("fluidOunceImperialUnit")
    public static native HKUnit fluidOunceImperial();
    @Mapping("pintUSUnit")
    public static native HKUnit pintUS();
    @Mapping("pintImperialUnit")
    public static native HKUnit pintImperial();
    @Mapping("pascalUnitWithMetricPrefix:")
    public static native HKUnit pascal(@Representing("HKMetricPrefix") long prefix);
    @Mapping("pascalUnit")
    public static native HKUnit pascal();
    @Mapping("millimeterOfMercuryUnit")
    public static native HKUnit millimeterOfMercury();
    @Mapping("centimeterOfWaterUnit")
    public static native HKUnit centimeterOfWater();
    @Mapping("atmosphereUnit")
    public static native HKUnit atmosphere();
    @Mapping("secondUnitWithMetricPrefix:")
    public static native HKUnit second(@Representing("HKMetricPrefix") long prefix);
    @Mapping("secondUnit")
    public static native HKUnit second();
    @Mapping("minuteUnit")
    public static native HKUnit minute();
    @Mapping("hourUnit")
    public static native HKUnit hour();
    @Mapping("dayUnit")
    public static native HKUnit day();
    @Mapping("jouleUnitWithMetricPrefix:")
    public static native HKUnit joule(@Representing("HKMetricPrefix") long prefix);
    @Mapping("jouleUnit")
    public static native HKUnit joule();
    @Mapping("calorieUnit")
    public static native HKUnit calorie();
    @Mapping("kilocalorieUnit")
    public static native HKUnit kilocalorie();
    @Mapping("degreeCelsiusUnit")
    public static native HKUnit degreeCelsius();
    @Mapping("degreeFahrenheitUnit")
    public static native HKUnit degreeFahrenheit();
    @Mapping("kelvinUnit")
    public static native HKUnit kelvin();
    @Mapping("siemenUnitWithMetricPrefix:")
    public static native HKUnit siemen(@Representing("HKMetricPrefix") long prefix);
    @Mapping("siemenUnit")
    public static native HKUnit siemen();
    @Mapping("countUnit")
    public static native HKUnit count();
    @Mapping("percentUnit")
    public static native HKUnit percent();
    @Mapping("unitMultipliedByUnit:")
    public native HKUnit multiplyBy(HKUnit unit);
    @Mapping("unitDividedByUnit:")
    public native HKUnit divideBy(HKUnit unit);
    @Mapping("unitRaisedToPower:")
    public native HKUnit raiseToPower(@MachineSizedSInt long power);
    @Mapping("reciprocalUnit")
    public native HKUnit reciprocalUnit();
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}
