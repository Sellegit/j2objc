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
@Mapping("CFTimeZoneRef") @Library("CoreFoundation/CoreFoundation.h")
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
    public static native CFTimeZone create(CFAllocator allocator, CFString name, CFData data);
    @GlobalFunction("CFTimeZoneCreateWithTimeIntervalFromGMT")
    public static native CFTimeZone create(CFAllocator allocator, double ti);
    @GlobalFunction("CFTimeZoneCreateWithName")
    public static native CFTimeZone create(CFAllocator allocator, CFString name, boolean tryAbbrev);
    @GlobalFunction("CFTimeZoneGetName")
    public static native CFString getName(CFTimeZone tz);
    @GlobalFunction("CFTimeZoneGetData")
    public static native CFData getData(CFTimeZone tz);
    @GlobalFunction("CFTimeZoneGetSecondsFromGMT")
    public static native double getSecondsFromGMT(CFTimeZone tz, double at);
    @GlobalFunction("CFTimeZoneCopyAbbreviation")
    public static native CFString getAbbreviation(CFTimeZone tz, double at);
    @GlobalFunction("CFTimeZoneIsDaylightSavingTime")
    public static native boolean isDaylightSavingTime(CFTimeZone tz, double at);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFTimeZoneGetDaylightSavingTimeOffset")
    public static native double getDaylightSavingTimeOffset(CFTimeZone tz, double at);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFTimeZoneGetNextDaylightSavingTimeTransition")
    public static native double getNextDaylightSavingTimeTransition(CFTimeZone tz, double at);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFTimeZoneCopyLocalizedName")
    public static native CFString getLocalizedName(CFTimeZone tz, @Representing("CFTimeZoneNameStyle") long style, CFLocale locale);
    
}
