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

@Library("Foundation/Foundation.h") @Mapping("NSByteCountFormatter")
public class NSByteCountFormatter 
    extends NSFormatter 
     {

    
    
    @Mapping("initWithCoder:")
    public NSByteCountFormatter(NSCoder aDecoder) { }
    @Mapping("init")
    public NSByteCountFormatter() { }
    
    
    @Mapping("allowedUnits")
    public native @Representing("NSByteCountFormatterUnits") long getAllowedUnits();
    @Mapping("setAllowedUnits:")
    public native void setAllowedUnits(@Representing("NSByteCountFormatterUnits") long v);
    @Mapping("countStyle")
    public native @Representing("NSByteCountFormatterCountStyle") long getCountStyle();
    @Mapping("setCountStyle:")
    public native void setCountStyle(@Representing("NSByteCountFormatterCountStyle") long v);
    @Mapping("allowsNonnumericFormatting")
    public native boolean allowsNonnumericFormatting();
    @Mapping("setAllowsNonnumericFormatting:")
    public native void setAllowsNonnumericFormatting(boolean v);
    @Mapping("includesUnit")
    public native boolean includesUnit();
    @Mapping("setIncludesUnit:")
    public native void setIncludesUnit(boolean v);
    @Mapping("includesCount")
    public native boolean includesCount();
    @Mapping("setIncludesCount:")
    public native void setIncludesCount(boolean v);
    @Mapping("includesActualByteCount")
    public native boolean includesActualByteCount();
    @Mapping("setIncludesActualByteCount:")
    public native void setIncludesActualByteCount(boolean v);
    @Mapping("isAdaptive")
    public native boolean isAdaptive();
    @Mapping("setAdaptive:")
    public native void setAdaptive(boolean v);
    @Mapping("zeroPadsFractionDigits")
    public native boolean zeroPadsFractionDigits();
    @Mapping("setZeroPadsFractionDigits:")
    public native void setZeroPadsFractionDigits(boolean v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("formattingContext")
    public native @Representing("NSFormattingContext") long getFormattingContext();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setFormattingContext:")
    public native void setFormattingContext(@Representing("NSFormattingContext") long v);
    
    
    
    @Mapping("stringFromByteCount:")
    public native String format(long byteCount);
    @Mapping("stringFromByteCount:countStyle:")
    public static native String format(long byteCount, @Representing("NSByteCountFormatterCountStyle") long countStyle);
    
}
