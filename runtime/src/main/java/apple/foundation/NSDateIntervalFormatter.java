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

@Library("Foundation") @Mapping("NSDateIntervalFormatter")
public class NSDateIntervalFormatter 
    extends NSFormatter 
     {

    
    
    public NSDateIntervalFormatter() {}
    
    
    @Mapping("locale")
    public native NSLocale getLocale();
    public native void setLocale(NSLocale v);
    @Mapping("calendar")
    public native NSCalendar getCalendar();
    public native void setCalendar(NSCalendar v);
    @Mapping("timeZone")
    public native NSTimeZone getTimeZone();
    public native void setTimeZone(NSTimeZone v);
    @Mapping("dateTemplate")
    public native String getDateTemplate();
    public native void setDateTemplate(String v);
    @Mapping("dateStyle")
    public native @Representing("NSDateIntervalFormatterStyle") @MachineSizedUInt long getDateStyle();
    public native void setDateStyle(@Representing("NSDateIntervalFormatterStyle") @MachineSizedUInt long v);
    @Mapping("timeStyle")
    public native @Representing("NSDateIntervalFormatterStyle") @MachineSizedUInt long getTimeStyle();
    public native void setTimeStyle(@Representing("NSDateIntervalFormatterStyle") @MachineSizedUInt long v);
    
    
    
    @Mapping("stringFromDate:toDate:")
    public native String format(NSDate fromDate, NSDate toDate);
    
}
