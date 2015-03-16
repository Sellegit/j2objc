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
@Library("CoreFoundation/CoreFoundation.h")
public class CFDateFormatter 
    extends CFType 
     {

    
    
    protected CFDateFormatter() {}
    
    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CFDateFormatterCreateDateFormatFromTemplate")
    protected static native String getDateFormat(CFAllocator allocator, String tmplate, @MachineSizedUInt long options, CFLocale locale);
    @GlobalFunction("CFDateFormatterGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    @GlobalFunction("CFDateFormatterCreate")
    protected static native CFDateFormatter create(CFAllocator allocator, CFLocale locale, CFDateFormatterStyle dateStyle, CFDateFormatterStyle timeStyle);
    @GlobalFunction("CFDateFormatterGetLocale")
    public static native CFLocale getLocale(CFDateFormatter formatter);
    @GlobalFunction("CFDateFormatterGetDateStyle")
    public static native CFDateFormatterStyle getDateStyle(CFDateFormatter formatter);
    @GlobalFunction("CFDateFormatterGetTimeStyle")
    public static native CFDateFormatterStyle getTimeStyle(CFDateFormatter formatter);
    @GlobalFunction("CFDateFormatterGetFormat")
    public static native String getFormat(CFDateFormatter formatter);
    @GlobalFunction("CFDateFormatterSetFormat")
    public static native void setFormat(CFDateFormatter formatter, String formatString);
    @GlobalFunction("CFDateFormatterCreateStringWithDate")
    protected static native String format(CFAllocator allocator, CFDateFormatter formatter, CFDate date);
    @GlobalFunction("CFDateFormatterCreateStringWithAbsoluteTime")
    protected static native String format(CFAllocator allocator, CFDateFormatter formatter, double at);
    @GlobalFunction("CFDateFormatterCreateDateFromString")
    protected static native CFDate parse(CFAllocator allocator, CFDateFormatter formatter, String string, CFRange rangep);
    @GlobalFunction("CFDateFormatterGetAbsoluteTimeFromString")
    protected static native boolean getAbsoluteTime(CFDateFormatter formatter, String string, CFRange rangep, Todo atp);
    @GlobalFunction("CFDateFormatterSetProperty")
    public static native void setProperty(CFDateFormatter formatter, String key, CFType value);
    @GlobalFunction("CFDateFormatterCopyProperty")
    public static native CFType getProperty(CFDateFormatter formatter, String key);
    
}
