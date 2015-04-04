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


@Library("Foundation/Foundation.h") @Mapping("NSTimeZone")
public class NSTimeZone 
    extends NSObject 
    implements NSCopying {

    
    
    @Mapping("init")
    public NSTimeZone() { }
    @Mapping("initWithName:")
    public NSTimeZone(String tzName) { }
    @Mapping("initWithName:data:")
    public NSTimeZone(String tzName, NSData aData) { }

    
    @Mapping("name")
    public native String getName();
    @Mapping("data")
    public native NSData getData();
    @Mapping("secondsFromGMT")
    public native @MachineSizedSInt long getSecondsFromGMT();
    @Mapping("abbreviation")
    public native String getAbbreviation();
    @Mapping("isDaylightSavingTime")
    public native boolean isDaylightSavingTime();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Mapping("daylightSavingTimeOffset")
    public native double getDaylightSavingTimeOffset();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Mapping("nextDaylightSavingTimeTransition")
    public native NSDate getNextDaylightSavingTimeTransition();

    
    
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("NSSystemTimeZoneDidChangeNotification")
    public static native NSString DidChangeNotification();

    @Mapping("secondsFromGMTForDate:")
    public native @MachineSizedSInt long getSecondsFromGMTForDate(NSDate aDate);
    @Mapping("abbreviationForDate:")
    public native String getAbbreviationForDate(NSDate aDate);
    @Mapping("isDaylightSavingTimeForDate:")
    public native boolean isDaylightSavingTimeForDate(NSDate aDate);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Mapping("daylightSavingTimeOffsetForDate:")
    public native double getDaylightSavingTimeOffsetForDate(NSDate aDate);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Mapping("nextDaylightSavingTimeTransitionAfterDate:")
    public native NSDate getNextDaylightSavingTimeTransitionAfterDate(NSDate aDate);
    @Mapping("isEqualToTimeZone:")
    public native boolean isEqualTo(NSTimeZone aTimeZone);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Mapping("localizedName:locale:")
    public native String getLocalizedName(@Representing("NSTimeZoneNameStyle") long style, NSLocale locale);
    @Mapping("systemTimeZone")
    public static native NSTimeZone getSystemTimeZone();
    @Mapping("resetSystemTimeZone")
    public static native void resetSystemTimeZone();
    @Mapping("defaultTimeZone")
    public static native NSTimeZone getDefaultTimeZone();
    @Mapping("setDefaultTimeZone:")
    public static native void setDefaultTimeZone(NSTimeZone aTimeZone);
    @Mapping("localTimeZone")
    public static native NSTimeZone getLocalTimeZone();
    @Mapping("knownTimeZoneNames")
    public static native List<String> getKnownTimeZoneNames();
    @Mapping("abbreviationDictionary")
    public static native NSDictionary<?, ?> getAbbreviationDictionary();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("setAbbreviationDictionary:")
    public static native void setAbbreviationDictionary(NSDictionary<?, ?> dict);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("timeZoneDataVersion")
    public static native String getTimeZoneDataVersion();
    @Mapping("timeZoneWithName:")
    public static native NSTimeZone fromName(String tzName);
    @Mapping("timeZoneWithName:data:")
    public static native NSTimeZone fromName(String tzName, NSData aData);
    @Mapping("timeZoneForSecondsFromGMT:")
    public static native NSTimeZone fromGMTSecondsOffset(@MachineSizedSInt long seconds);
    @Mapping("timeZoneWithAbbreviation:")
    public static native NSTimeZone fromAbbreviation(String abbreviation);
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);

}
