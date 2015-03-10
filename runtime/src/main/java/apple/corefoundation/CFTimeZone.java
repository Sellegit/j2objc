package apple.corefoundation;


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
import apple.dispatch.*;
import apple.foundation.*;


/*<javadoc>*/
/*</javadoc>*/
@Library("CoreFoundation")
public class CFTimeZone 
    extends CFType 
     {

    
    
    protected CFTimeZone() {}
    
    
    
    
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFTimeZoneSystemTimeZoneDidChangeNotification")
    public static native NSString SystemTimeZoneDidChangeNotification();
    
    @GlobalFunction("CFTimeZoneGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    @GlobalFunction("CFTimeZoneCopySystem")
    public static native CFTimeZone getSystem();
    @GlobalFunction("CFTimeZoneResetSystem")
    public static native void resetSystem();
    @GlobalFunction("CFTimeZoneCopyDefault")
    public static native CFTimeZone getDefault();
    @GlobalFunction("CFTimeZoneSetDefault")
    public static native void setDefault(CFTimeZone tz);
    @GlobalFunction("CFTimeZoneCopyKnownNames")
    public static native CFArray getKnownNames();
    @GlobalFunction("CFTimeZoneCopyAbbreviationDictionary")
    public static native CFDictionary getAbbreviationDictionary();
    @GlobalFunction("CFTimeZoneSetAbbreviationDictionary")
    public static native void setAbbreviationDictionary(CFDictionary dict);
    @GlobalFunction("CFTimeZoneCreate")
    protected static native CFTimeZone create(CFAllocator allocator, String name, CFData data);
    @GlobalFunction("CFTimeZoneCreateWithTimeIntervalFromGMT")
    protected static native CFTimeZone create(CFAllocator allocator, double ti);
    @GlobalFunction("CFTimeZoneCreateWithName")
    protected static native CFTimeZone create(CFAllocator allocator, String name, boolean tryAbbrev);
    @GlobalFunction("CFTimeZoneGetName")
    public native String getName();
    @GlobalFunction("CFTimeZoneGetData")
    public native CFData getData();
    @GlobalFunction("CFTimeZoneGetSecondsFromGMT")
    public native double getSecondsFromGMT(double at);
    @GlobalFunction("CFTimeZoneCopyAbbreviation")
    public native String getAbbreviation(double at);
    @GlobalFunction("CFTimeZoneIsDaylightSavingTime")
    public native boolean isDaylightSavingTime(double at);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFTimeZoneGetDaylightSavingTimeOffset")
    public native double getDaylightSavingTimeOffset(double at);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFTimeZoneGetNextDaylightSavingTimeTransition")
    public native double getNextDaylightSavingTimeTransition(double at);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFTimeZoneCopyLocalizedName")
    public native String getLocalizedName(CFTimeZoneNameStyle style, CFLocale locale);
    
}
