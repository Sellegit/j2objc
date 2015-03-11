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
 * @since Available in iOS 6.0 and later.
 */

@Library("Foundation") @Mapping("NSByteCountFormatter")
public class NSByteCountFormatter 
    extends NSFormatter 
     {

    
    
    public NSByteCountFormatter() {}
    
    
    @Mapping("allowedUnits")
    public native @Representing("NSByteCountFormatterUnits") @MachineSizedUInt long getAllowedUnits();
    public native void setAllowedUnits(@Representing("NSByteCountFormatterUnits") @MachineSizedUInt long v);
    @Mapping("countStyle")
    public native @Representing("NSByteCountFormatterCountStyle") @MachineSizedSInt long getCountStyle();
    public native void setCountStyle(@Representing("NSByteCountFormatterCountStyle") @MachineSizedSInt long v);
    @Mapping("allowsNonnumericFormatting")
    public native boolean allowsNonnumericFormatting();
    public native void setAllowsNonnumericFormatting(boolean v);
    @Mapping("includesUnit")
    public native boolean includesUnit();
    public native void setIncludesUnit(boolean v);
    @Mapping("includesCount")
    public native boolean includesCount();
    public native void setIncludesCount(boolean v);
    @Mapping("includesActualByteCount")
    public native boolean includesActualByteCount();
    public native void setIncludesActualByteCount(boolean v);
    @Mapping("isAdaptive")
    public native boolean isAdaptive();
    public native void setAdaptive(boolean v);
    @Mapping("zeroPadsFractionDigits")
    public native boolean zeroPadsFractionDigits();
    public native void setZeroPadsFractionDigits(boolean v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("formattingContext")
    public native @Representing("NSFormattingContext") @MachineSizedSInt long getFormattingContext();
    /**
     * @since Available in iOS 8.0 and later.
     */
    public native void setFormattingContext(@Representing("NSFormattingContext") @MachineSizedSInt long v);
    
    
    
    @Mapping("stringFromByteCount:")
    public native String format(long byteCount);
    @Mapping("stringFromByteCount:countStyle:")
    public static native String format(long byteCount, @Representing("NSByteCountFormatterCountStyle") @MachineSizedSInt long countStyle);
    
}
