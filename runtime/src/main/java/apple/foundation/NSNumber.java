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





@Library("Foundation") @Mapping("NSNumber")
public class NSNumber 
    extends Object 
    implements NSPropertyList {

    
    
    
    
    
    @Mapping("charValue")
    public native byte byteValue();
    @Mapping("shortValue")
    public native short shortValue();
    @Mapping("unsignedShortValue")
    public native char charValue();
    @Mapping("intValue")
    public native int intValue();
    @Mapping("longLongValue")
    public native long longValue();
    @Mapping("floatValue")
    public native float floatValue();
    @Mapping("doubleValue")
    public native double doubleValue();
    @Mapping("boolValue")
    public native boolean booleanValue();
    @Mapping("stringValue")
    public native String stringValue();
    @Mapping("decimalValue")
    public native NSDecimal decimalValue();
    
    
    
    @Mapping("compare:")
    public native @Representing("NSComparisonResult") @MachineSizedSInt long compare(NSNumber otherNumber);
    @Mapping("isEqualToNumber:")
    public native boolean isEqualTo(NSNumber number);
    @Mapping("descriptionWithLocale:")
    public native String toString(Object locale);
    @Mapping("numberWithChar:")
    public static native NSNumber valueOf(byte value);
    @Mapping("numberWithShort:")
    public static native NSNumber valueOf(short value);
    @Mapping("numberWithUnsignedShort:")
    public static native NSNumber valueOf(char value);
    @Mapping("numberWithInt:")
    public static native NSNumber valueOf(int value);
    @Mapping("numberWithLongLong:")
    public static native NSNumber valueOf(long value);
    @Mapping("numberWithFloat:")
    public static native NSNumber valueOf(float value);
    @Mapping("numberWithDouble:")
    public static native NSNumber valueOf(double value);
    @Mapping("numberWithBool:")
    public static native NSNumber valueOf(boolean value);
    
}
