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





@Library("CoreFoundation")
@Mapping("CFNumberFormatterStyle")
public final class CFNumberFormatterStyle extends ObjCEnum {
    
    @GlobalConstant("kCFNumberFormatterNoStyle")
    public static final long NoStyle = 0L;
    @GlobalConstant("kCFNumberFormatterDecimalStyle")
    public static final long DecimalStyle = 1L;
    @GlobalConstant("kCFNumberFormatterCurrencyStyle")
    public static final long CurrencyStyle = 2L;
    @GlobalConstant("kCFNumberFormatterPercentStyle")
    public static final long PercentStyle = 3L;
    @GlobalConstant("kCFNumberFormatterScientificStyle")
    public static final long ScientificStyle = 4L;
    @GlobalConstant("kCFNumberFormatterSpellOutStyle")
    public static final long SpellOutStyle = 5L;
    

}
