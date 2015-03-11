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



/**
 * @since Available in iOS 8.0 and later.
 */

@Library("Foundation") @Mapping("NSEnergyFormatter")
public class NSEnergyFormatter 
    extends NSFormatter 
     {

    
    
    public NSEnergyFormatter() {}
    
    
    @Mapping("numberFormatter")
    public native NSNumberFormatter getNumberFormatter();
    public native void setNumberFormatter(NSNumberFormatter v);
    @Mapping("unitStyle")
    public native @Representing("NSFormattingUnitStyle") @MachineSizedSInt long getUnitStyle();
    public native void setUnitStyle(@Representing("NSFormattingUnitStyle") @MachineSizedSInt long v);
    @Mapping("isForFoodEnergyUse")
    public native boolean isForFoodEnergyUse();
    public native void setForFoodEnergyUse(boolean v);
    
    
    
    @Mapping("stringFromValue:unit:")
    public native String format(double value, @Representing("NSEnergyFormatterUnit") @MachineSizedSInt long unit);
    @Mapping("stringFromJoules:")
    public native String formatJoules(double numberInJoules);
    @Mapping("unitStringFromValue:unit:")
    public native String formatUnit(double value, @Representing("NSEnergyFormatterUnit") @MachineSizedSInt long unit);
    @Mapping("unitStringFromJoules:usedUnit:")
    protected native String formatUnitJoules(double numberInJoules, Todo unitp);
    
}
