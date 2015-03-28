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
@Mapping("CFNumberFormatterRef") @Library("CoreFoundation/CoreFoundation.h")
public class CFNumberFormatter 
    extends CFType 
     {

    
    
    protected CFNumberFormatter() {}

    
    
    
    @GlobalFunction("CFNumberFormatterGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    @GlobalFunction("CFNumberFormatterCreate")
    public static native CFNumberFormatter create(CFAllocator allocator, CFLocale locale, @Representing("CFNumberFormatterStyle") long style);
    @GlobalFunction("CFNumberFormatterGetLocale")
    public static native CFLocale getLocale(CFNumberFormatter formatter);
    @GlobalFunction("CFNumberFormatterGetStyle")
    public static native CFNumberFormatterStyle getStyle(CFNumberFormatter formatter);
    @GlobalFunction("CFNumberFormatterGetFormat")
    public static native CFString getFormat(CFNumberFormatter formatter);
    @GlobalFunction("CFNumberFormatterSetFormat")
    public static native void setFormat(CFNumberFormatter formatter, CFString formatString);
    @GlobalFunction("CFNumberFormatterCreateStringWithNumber")
    public static native CFString format(CFAllocator allocator, CFNumberFormatter formatter, CFNumber number);
    @GlobalFunction("CFNumberFormatterCreateStringWithValue")
    public static native CFString formatValue(CFAllocator allocator, CFNumberFormatter formatter, @Representing("CFNumberType") long numberType, Todo valuePtr);
    @GlobalFunction("CFNumberFormatterCreateNumberFromString")
    public static native CFNumber parse(CFAllocator allocator, CFNumberFormatter formatter, CFString string, CFRange rangep, @MachineSizedUInt long options);
    @GlobalFunction("CFNumberFormatterGetValueFromString")
    public static native boolean parseValue(CFNumberFormatter formatter, CFString string, CFRange rangep, @Representing("CFNumberType") long numberType, Todo valuePtr);
    @GlobalFunction("CFNumberFormatterSetProperty")
    public static native void setProperty(CFNumberFormatter formatter, CFString key, CFType value);
    @GlobalFunction("CFNumberFormatterCopyProperty")
    public static native CFType getProperty(CFNumberFormatter formatter, CFString key);
    @GlobalFunction("CFNumberFormatterGetDecimalInfoForCurrencyCode")
    public static native boolean getDecimalInfoForCurrencyCode(CFString currencyCode, Todo defaultFractionDigits, Todo roundingIncrement);

}
