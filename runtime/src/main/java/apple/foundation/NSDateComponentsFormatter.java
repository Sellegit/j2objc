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

@Library("Foundation") @Mapping("NSDateComponentsFormatter")
public class NSDateComponentsFormatter 
    extends NSFormatter 
     {

    
    
    public NSDateComponentsFormatter() {}
    
    
    @Mapping("unitsStyle")
    public native @Representing("NSDateComponentsFormatterUnitsStyle") @MachineSizedSInt long getUnitsStyle();
    public native void setUnitsStyle(@Representing("NSDateComponentsFormatterUnitsStyle") @MachineSizedSInt long v);
    @Mapping("allowedUnits")
    public native @Representing("NSCalendarUnit") @MachineSizedUInt long getAllowedUnits();
    public native void setAllowedUnits(@Representing("NSCalendarUnit") @MachineSizedUInt long v);
    @Mapping("zeroFormattingBehavior")
    public native @Representing("NSDateComponentsFormatterZeroFormattingBehavior") @MachineSizedUInt long getZeroFormattingBehavior();
    public native void setZeroFormattingBehavior(@Representing("NSDateComponentsFormatterZeroFormattingBehavior") @MachineSizedUInt long v);
    @Mapping("calendar")
    public native NSCalendar getCalendar();
    public native void setCalendar(NSCalendar v);
    @Mapping("allowsFractionalUnits")
    public native boolean allowsFractionalUnits();
    public native void setAllowsFractionalUnits(boolean v);
    @Mapping("maximumUnitCount")
    public native @MachineSizedSInt long getMaximumUnitCount();
    public native void setMaximumUnitCount(@MachineSizedSInt long v);
    @Mapping("collapsesLargestUnit")
    public native boolean collapsesLargestUnit();
    public native void setCollapsesLargestUnit(boolean v);
    @Mapping("includesApproximationPhrase")
    public native boolean includesApproximationPhrase();
    public native void setIncludesApproximationPhrase(boolean v);
    @Mapping("includesTimeRemainingPhrase")
    public native boolean includesTimeRemainingPhrase();
    public native void setIncludesTimeRemainingPhrase(boolean v);
    @Mapping("formattingContext")
    public native @Representing("NSFormattingContext") @MachineSizedSInt long getFormattingContext();
    public native void setFormattingContext(@Representing("NSFormattingContext") @MachineSizedSInt long v);
    
    
    
    @Mapping("stringForObjectValue:")
    public native String format(Object obj);
    @Mapping("stringFromDateComponents:")
    public native String format(NSDateComponents components);
    @Mapping("stringFromDate:toDate:")
    public native String format(NSDate startDate, NSDate endDate);
    @Mapping("stringFromTimeInterval:")
    public native String format(double ti);
    
}
