package apple.uikit;


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
import apple.foundation.*;
import apple.coreanimation.*;
import apple.coredata.*;
import apple.coreimage.*;
import apple.coretext.*;
import apple.corelocation.*;



/**
 * @since Available in iOS 2.0 and later.
 */

@Library("UIKit") @Mapping("UIDatePicker")
public class UIDatePicker 
    extends UIControl 
    implements NSCoding {

    
    
    public UIDatePicker() {}
    @Mapping("initWithFrame:")
    public UIDatePicker(CGRect frame) { }
    
    
    @Mapping("datePickerMode")
    public native @Representing("UIDatePickerMode") @MachineSizedSInt long getDatePickerMode();
    @Mapping("setDatePickerMode:")
    public native void setDatePickerMode(@Representing("UIDatePickerMode") @MachineSizedSInt long v);
    @Mapping("locale")
    public native NSLocale getLocale();
    @Mapping("setLocale:")
    public native void setLocale(NSLocale v);
    @Mapping("calendar")
    public native NSCalendar getCalendar();
    @Mapping("setCalendar:")
    public native void setCalendar(NSCalendar v);
    @Mapping("timeZone")
    public native NSTimeZone getTimeZone();
    @Mapping("setTimeZone:")
    public native void setTimeZone(NSTimeZone v);
    @Mapping("date")
    public native NSDate getDate();
    @Mapping("setDate:")
    public native void setDate(NSDate v);
    @Mapping("minimumDate")
    public native NSDate getMinimumDate();
    @Mapping("setMinimumDate:")
    public native void setMinimumDate(NSDate v);
    @Mapping("maximumDate")
    public native NSDate getMaximumDate();
    @Mapping("setMaximumDate:")
    public native void setMaximumDate(NSDate v);
    @Mapping("countDownDuration")
    public native double getCountDownDuration();
    @Mapping("setCountDownDuration:")
    public native void setCountDownDuration(double v);
    @Mapping("minuteInterval")
    public native @MachineSizedSInt long getMinuteInterval();
    @Mapping("setMinuteInterval:")
    public native void setMinuteInterval(@MachineSizedSInt long v);
    
    
    
    @Mapping("setDate:animated:")
    public native void setDate(NSDate date, boolean animated);
    
}
