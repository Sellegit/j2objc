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





@Library("Foundation/Foundation.h") @Mapping("NSScanner")
public class NSScanner 
    extends NSObject 
    implements NSCopying {

    
    
    public NSScanner() {}
    @Mapping("initWithString:")
    public NSScanner(String string) { }
    
    
    @Mapping("string")
    public native String getString();
    @Mapping("scanLocation")
    public native @MachineSizedUInt long getScanLocation();
    @Mapping("setScanLocation:")
    public native void setScanLocation(@MachineSizedUInt long v);
    @Mapping("charactersToBeSkipped")
    public native NSCharacterSet getCharactersToBeSkipped();
    @Mapping("setCharactersToBeSkipped:")
    public native void setCharactersToBeSkipped(NSCharacterSet v);
    @Mapping("caseSensitive")
    public native boolean isCaseSensitive();
    @Mapping("setCaseSensitive:")
    public native void setCaseSensitive(boolean v);
    @Mapping("locale")
    public native NSLocale getLocale();
    @Mapping("setLocale:")
    public native void setLocale(NSLocale v);
    @Mapping("isAtEnd")
    public native boolean isAtEnd();
    
    
    
    @Mapping("scanInt:")
    private native boolean scanInt(Todo result);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Mapping("scanInteger:")
    private native boolean scanInteger(Todo result);
    @Mapping("scanLongLong:")
    private native boolean scanLongLong(Todo result);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("scanUnsignedLongLong:")
    private native boolean scanUnsignedLongLong(Todo result);
    @Mapping("scanFloat:")
    private native boolean scanFloat(Todo result);
    @Mapping("scanDouble:")
    private native boolean scanDouble(Todo result);
    @Mapping("scanHexInt:")
    private native boolean scanHexInt(Todo result);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Mapping("scanHexLongLong:")
    private native boolean scanHexLongLong(Todo result);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Mapping("scanHexFloat:")
    private native boolean scanHexFloat(Todo result);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Mapping("scanHexDouble:")
    private native boolean scanHexDouble(Todo result);
    @Mapping("scannerWithString:")
    public static native NSScanner create(String string);
    @Mapping("localizedScannerWithString:")
    public static native NSScanner createLocalized(String string);
    @Mapping("scanDecimal:")
    private native boolean scanDecimal(NSDecimal dcm);
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}
