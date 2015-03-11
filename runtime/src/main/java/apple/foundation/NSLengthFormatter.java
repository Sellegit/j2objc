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

@Library("Foundation") @Mapping("NSLengthFormatter")
public class NSLengthFormatter 
    extends NSFormatter 
     {

    
    
    public NSLengthFormatter() {}
    
    
    @Mapping("numberFormatter")
    public native NSNumberFormatter getNumberFormatter();
    @Mapping("setNumberFormatter:")
    public native void setNumberFormatter(NSNumberFormatter v);
    @Mapping("unitStyle")
    public native @Representing("NSFormattingUnitStyle") @MachineSizedSInt long getUnitStyle();
    @Mapping("setUnitStyle:")
    public native void setUnitStyle(@Representing("NSFormattingUnitStyle") @MachineSizedSInt long v);
    @Mapping("isForPersonHeightUse")
    public native boolean isForPersonHeightUse();
    @Mapping("setForPersonHeightUse:")
    public native void setForPersonHeightUse(boolean v);
    
    
    
    @Mapping("stringFromValue:unit:")
    public native String format(double value, @Representing("NSLengthFormatterUnit") @MachineSizedSInt long unit);
    @Mapping("stringFromMeters:")
    public native String formatMeters(double numberInMeters);
    @Mapping("unitStringFromValue:unit:")
    public native String formatUnit(double value, @Representing("NSLengthFormatterUnit") @MachineSizedSInt long unit);
    @Mapping("unitStringFromMeters:usedUnit:")
    protected native String formatUnitMeters(double numberInMeters, Todo unitp);
    
}
