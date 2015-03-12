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
    public native CFLocale getLocale();
    @GlobalFunction("CFDateFormatterGetDateStyle")
    public native CFDateFormatterStyle getDateStyle();
    @GlobalFunction("CFDateFormatterGetTimeStyle")
    public native CFDateFormatterStyle getTimeStyle();
    @GlobalFunction("CFDateFormatterGetFormat")
    public native String getFormat();
    @GlobalFunction("CFDateFormatterSetFormat")
    public native void setFormat(String formatString);
    @GlobalFunction("CFDateFormatterCreateStringWithDate")
    protected static native String format(CFAllocator allocator, CFDateFormatter formatter, CFDate date);
    @GlobalFunction("CFDateFormatterCreateStringWithAbsoluteTime")
    protected static native String format(CFAllocator allocator, CFDateFormatter formatter, double at);
    @GlobalFunction("CFDateFormatterCreateDateFromString")
    protected static native CFDate parse(CFAllocator allocator, CFDateFormatter formatter, String string, CFRange rangep);
    @GlobalFunction("CFDateFormatterGetAbsoluteTimeFromString")
    protected native boolean getAbsoluteTime(String string, CFRange rangep, Todo atp);
    @GlobalFunction("CFDateFormatterSetProperty")
    public native void setProperty(String key, CFType value);
    @GlobalFunction("CFDateFormatterCopyProperty")
    public native CFType getProperty(String key);
    
}
