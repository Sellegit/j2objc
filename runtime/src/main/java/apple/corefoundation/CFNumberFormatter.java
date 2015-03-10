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
public class CFNumberFormatter 
    extends CFType 
     {

    
    
    protected CFNumberFormatter() {}
    
    
    
    
    @GlobalFunction("CFNumberFormatterGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    @GlobalFunction("CFNumberFormatterCreate")
    protected static native CFNumberFormatter create(CFAllocator allocator, CFLocale locale, CFNumberFormatterStyle style);
    @GlobalFunction("CFNumberFormatterGetLocale")
    public native CFLocale getLocale();
    @GlobalFunction("CFNumberFormatterGetStyle")
    public native CFNumberFormatterStyle getStyle();
    @GlobalFunction("CFNumberFormatterGetFormat")
    public native String getFormat();
    @GlobalFunction("CFNumberFormatterSetFormat")
    public native void setFormat(String formatString);
    @GlobalFunction("CFNumberFormatterCreateStringWithNumber")
    protected static native String format(CFAllocator allocator, CFNumberFormatter formatter, CFNumber number);
    @GlobalFunction("CFNumberFormatterCreateStringWithValue")
    protected static native String formatValue(CFAllocator allocator, CFNumberFormatter formatter, CFNumberType numberType, Todo valuePtr);
    @GlobalFunction("CFNumberFormatterCreateNumberFromString")
    protected static native CFNumber parse(CFAllocator allocator, CFNumberFormatter formatter, String string, CFRange rangep, CFNumberFormatterOptionFlags options);
    @GlobalFunction("CFNumberFormatterGetValueFromString")
    protected native boolean parseValue(String string, CFRange rangep, CFNumberType numberType, Todo valuePtr);
    @GlobalFunction("CFNumberFormatterSetProperty")
    public native void setProperty(CFNumberFormatterProperty key, CFType value);
    @GlobalFunction("CFNumberFormatterCopyProperty")
    public native CFType getProperty(CFNumberFormatterProperty key);
    @GlobalFunction("CFNumberFormatterGetDecimalInfoForCurrencyCode")
    private static native boolean getDecimalInfoForCurrencyCode(String currencyCode, Todo defaultFractionDigits, Todo roundingIncrement);
    
}
