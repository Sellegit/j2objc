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

@Library("Foundation") @Mapping("NSMassFormatter")
public class NSMassFormatter 
    extends NSFormatter 
     {

    
    
    public NSMassFormatter() {}
    
    
    @Mapping("numberFormatter")
    public native NSNumberFormatter getNumberFormatter();
    public native void setNumberFormatter(NSNumberFormatter v);
    @Mapping("unitStyle")
    public native @Representing("NSFormattingUnitStyle") @MachineSizedSInt long getUnitStyle();
    public native void setUnitStyle(@Representing("NSFormattingUnitStyle") @MachineSizedSInt long v);
    @Mapping("isForPersonMassUse")
    public native boolean isForPersonMassUse();
    public native void setForPersonMassUse(boolean v);
    
    
    
    @Mapping("stringFromValue:unit:")
    public native String format(double value, @Representing("NSMassFormatterUnit") @MachineSizedSInt long unit);
    @Mapping("stringFromKilograms:")
    public native String formatKilograms(double numberInKilograms);
    @Mapping("unitStringFromValue:unit:")
    public native String formatUnit(double value, @Representing("NSMassFormatterUnit") @MachineSizedSInt long unit);
    @Mapping("unitStringFromKilograms:usedUnit:")
    protected native String formatUnitKilograms(double numberInKilograms, Todo unitp);
    
}
