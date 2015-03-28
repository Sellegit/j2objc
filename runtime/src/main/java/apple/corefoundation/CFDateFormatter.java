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
@Mapping("CFDateFormatterRef") @Library("CoreFoundation/CoreFoundation.h")
public class CFDateFormatter 
    extends CFType 
     {

    
    
    protected CFDateFormatter() {}

    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CFDateFormatterCreateDateFormatFromTemplate")
    public static native CFString getDateFormat(CFAllocator allocator, CFString tmplate, @MachineSizedUInt long options, CFLocale locale);
    @GlobalFunction("CFDateFormatterGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    @GlobalFunction("CFDateFormatterCreate")
    public static native CFDateFormatter create(CFAllocator allocator, CFLocale locale, @Representing("CFDateFormatterStyle") long dateStyle, @Representing("CFDateFormatterStyle") long timeStyle);
    @GlobalFunction("CFDateFormatterGetLocale")
    public static native CFLocale getLocale(CFDateFormatter formatter);
    @GlobalFunction("CFDateFormatterGetDateStyle")
    public static native CFDateFormatterStyle getDateStyle(CFDateFormatter formatter);
    @GlobalFunction("CFDateFormatterGetTimeStyle")
    public static native CFDateFormatterStyle getTimeStyle(CFDateFormatter formatter);
    @GlobalFunction("CFDateFormatterGetFormat")
    public static native CFString getFormat(CFDateFormatter formatter);
    @GlobalFunction("CFDateFormatterSetFormat")
    public static native void setFormat(CFDateFormatter formatter, CFString formatString);
    @GlobalFunction("CFDateFormatterCreateStringWithDate")
    public static native CFString format(CFAllocator allocator, CFDateFormatter formatter, CFDate date);
    @GlobalFunction("CFDateFormatterCreateStringWithAbsoluteTime")
    public static native CFString format(CFAllocator allocator, CFDateFormatter formatter, double at);
    @GlobalFunction("CFDateFormatterCreateDateFromString")
    public static native CFDate parse(CFAllocator allocator, CFDateFormatter formatter, CFString string, CFRange rangep);
    @GlobalFunction("CFDateFormatterGetAbsoluteTimeFromString")
    public static native boolean getAbsoluteTime(CFDateFormatter formatter, CFString string, CFRange rangep, Todo atp);
    @GlobalFunction("CFDateFormatterSetProperty")
    public static native void setProperty(CFDateFormatter formatter, CFString key, CFType value);
    @GlobalFunction("CFDateFormatterCopyProperty")
    public static native CFType getProperty(CFDateFormatter formatter, CFString key);

}
