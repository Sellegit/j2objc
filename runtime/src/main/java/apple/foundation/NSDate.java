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


@Library("Foundation/Foundation.h") @Mapping("NSDate")
public class NSDate 
    extends NSObject 
    implements NSPropertyList {

    
    public static final double TimeIntervalSince1970 = 978307200.0;

    
    public NSDate() {}
    @Mapping("initWithTimeIntervalSince1970:")
    public NSDate(double secs) { }

    
    @Mapping("timeIntervalSinceReferenceDate")
    public native double getTimeIntervalSinceReferenceDate();
    @Mapping("timeIntervalSinceNow")
    public native double getTimeIntervalSinceNow();
    @Mapping("timeIntervalSince1970")
    public native double getTimeIntervalSince1970();

    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSSystemClockDidChangeNotification")
    public static native NSString SystemClockDidChangeNotification();

    @Mapping("timeIntervalSinceDate:")
    public native double getTimeIntervalSince(NSDate anotherDate);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Mapping("dateByAddingTimeInterval:")
    public native NSDate newDateByAddingTimeInterval(double ti);
    @Mapping("earlierDate:")
    public native NSDate earlierDate(NSDate anotherDate);
    @Mapping("laterDate:")
    public native NSDate laterDate(NSDate anotherDate);
    @Mapping("compare:")
    public native @Representing("NSComparisonResult") long compare(NSDate other);
    @Mapping("isEqualToDate:")
    public native boolean isEqualTo(NSDate otherDate);
    @Mapping("descriptionWithLocale:")
    public native String toString(Object locale);
    @Mapping("date")
    public static native NSDate now();
    @Mapping("dateWithTimeIntervalSinceNow:")
    public static native NSDate createWithTimeIntervalSinceNow(double secs);
    @Mapping("dateWithTimeIntervalSinceReferenceDate:")
    public static native NSDate createWithTimeIntervalSinceReferenceDate(double ti);
    @Mapping("dateWithTimeIntervalSince1970:")
    public static native NSDate createWithTimeIntervalSince1970(double secs);
    @Mapping("dateWithTimeInterval:sinceDate:")
    public static native NSDate createWithTimeIntervalSinceDate(double secsToBeAdded, NSDate date);
    @Mapping("distantFuture")
    public static native NSDate getDistantFuture();
    @Mapping("distantPast")
    public static native NSDate getDistantPast();

}
