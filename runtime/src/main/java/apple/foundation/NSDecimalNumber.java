package apple.foundation;


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
import apple.uikit.*;
import apple.coreanimation.*;
import apple.coredata.*;
import apple.coremedia.*;
import apple.security.*;
import apple.dispatch.*;


@Library("Foundation/Foundation.h") @Mapping("NSDecimalNumber")
public class NSDecimalNumber 
    extends NSNumber 
     {

    
    
    @Mapping("initWithString:locale:")
    public NSDecimalNumber(String numberValue, Object locale) { }
    @Mapping("init")
    public NSDecimalNumber() { }

    


    
    
    @Mapping("decimalNumberByAdding:")
    public native NSDecimalNumber add(NSDecimalNumber decimalNumber);
    @Mapping("decimalNumberByAdding:withBehavior:")
    public native NSDecimalNumber add(NSDecimalNumber decimalNumber, NSDecimalNumberBehaviors behavior);
    @Mapping("decimalNumberBySubtracting:")
    public native NSDecimalNumber subtract(NSDecimalNumber decimalNumber);
    @Mapping("decimalNumberBySubtracting:withBehavior:")
    public native NSDecimalNumber subtract(NSDecimalNumber decimalNumber, NSDecimalNumberBehaviors behavior);
    @Mapping("decimalNumberByMultiplyingBy:")
    public native NSDecimalNumber multiply(NSDecimalNumber decimalNumber);
    @Mapping("decimalNumberByMultiplyingBy:withBehavior:")
    public native NSDecimalNumber multiply(NSDecimalNumber decimalNumber, NSDecimalNumberBehaviors behavior);
    @Mapping("decimalNumberByDividingBy:")
    public native NSDecimalNumber divide(NSDecimalNumber decimalNumber);
    @Mapping("decimalNumberByDividingBy:withBehavior:")
    public native NSDecimalNumber divide(NSDecimalNumber decimalNumber, NSDecimalNumberBehaviors behavior);
    @Mapping("decimalNumberByRaisingToPower:")
    public native NSDecimalNumber raise(@MachineSizedUInt long power);
    @Mapping("decimalNumberByRaisingToPower:withBehavior:")
    public native NSDecimalNumber raise(@MachineSizedUInt long power, NSDecimalNumberBehaviors behavior);
    @Mapping("decimalNumberByMultiplyingByPowerOf10:")
    public native NSDecimalNumber multiplyByPowerOf10(short power);
    @Mapping("decimalNumberByMultiplyingByPowerOf10:withBehavior:")
    public native NSDecimalNumber multiplyByPowerOf10(short power, NSDecimalNumberBehaviors behavior);
    @Mapping("decimalNumberByRoundingAccordingToBehavior:")
    public native NSDecimalNumber round(NSDecimalNumberBehaviors behavior);
    @Mapping("zero")
    public static native NSDecimalNumber zero();
    @Mapping("one")
    public static native NSDecimalNumber one();
    @Mapping("minimumDecimalNumber")
    public static native NSDecimalNumber getMin();
    @Mapping("maximumDecimalNumber")
    public static native NSDecimalNumber getMax();
    @Mapping("notANumber")
    public static native NSDecimalNumber getNaN();
    @Mapping("setDefaultBehavior:")
    public static native void setDefaultBehavior(NSDecimalNumberBehaviors behavior);
    @Mapping("defaultBehavior")
    public static native NSDecimalNumberBehaviors getDefaultBehavior();

}
