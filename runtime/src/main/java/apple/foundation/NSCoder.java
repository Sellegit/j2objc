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





@Library("Foundation") @Mapping("NSCoder")
public class NSCoder 
    extends NSObject 
     {

    
    
    public NSCoder() {}
    
    
    @Mapping("systemVersion")
    public native int getSystemVersion();
    @Mapping("allowsKeyedCoding")
    public native boolean allowsKeyedCoding();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("requiresSecureCoding")
    public native boolean requiresSecureCoding();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("allowedClasses")
    public native List<ObjCClass> getAllowedClasses();
    
    
    
    @Mapping("encodeDataObject:")
    public native void encodeDataObject(NSData data);
    @Mapping("decodeDataObject")
    public native NSData decodeDataObject();
    @Mapping("versionForClassName:")
    public native @MachineSizedSInt long getVersionForClassName(String className);
    @Mapping("encodeObject:")
    public native void encodeObject(Object object);
    @Mapping("encodeRootObject:")
    public native void encodeRootObject(Object rootObject);
    @Mapping("encodeBycopyObject:")
    public native void encodeBycopyObject(Object anObject);
    @Mapping("encodeByrefObject:")
    public native void encodeByrefObject(Object anObject);
    @Mapping("encodeConditionalObject:")
    public native void encodeConditionalObject(Object object);
    @Mapping("encodeBytes:length:")
    public native void encodeBytes(Todo byteaddr, @MachineSizedUInt long length);
    @Mapping("decodeObject")
    public native Object decodeObject();
    @Mapping("decodeBytesWithReturnedLength:")
    public native Todo decodeBytes(Todo lengthp);
    @Mapping("setObjectZone:")
    public native void setObjectZone(NSZone zone);
    @Mapping("objectZone")
    public native NSZone getObjectZone();
    @Mapping("encodeObject:forKey:")
    public native void encodeObject(Object objv, String key);
    @Mapping("encodeConditionalObject:forKey:")
    public native void encodeConditionalObject(Object objv, String key);
    @Mapping("encodeBool:forKey:")
    public native void encodeBool(boolean boolv, String key);
    @Mapping("encodeInt:forKey:")
    public native void encodeInt(int intv, String key);
    @Mapping("encodeInt32:forKey:")
    public native void encodeInt32(int intv, String key);
    @Mapping("encodeInt64:forKey:")
    public native void encodeInt64(long intv, String key);
    @Mapping("encodeFloat:forKey:")
    public native void encodeFloat(float realv, String key);
    @Mapping("encodeDouble:forKey:")
    public native void encodeDouble(double realv, String key);
    @Mapping("encodeBytes:length:forKey:")
    public native void encodeBytes(Todo bytesp, @MachineSizedUInt long lenv, String key);
    @Mapping("containsValueForKey:")
    public native boolean containsValue(String key);
    @Mapping("decodeObjectForKey:")
    public native Object decodeObject(String key);
    @Mapping("decodeBoolForKey:")
    public native boolean decodeBool(String key);
    @Mapping("decodeIntForKey:")
    public native int decodeInt(String key);
    @Mapping("decodeInt32ForKey:")
    public native int decodeInt32(String key);
    @Mapping("decodeInt64ForKey:")
    public native long decodeInt64(String key);
    @Mapping("decodeFloatForKey:")
    public native float decodeFloat(String key);
    @Mapping("decodeDoubleForKey:")
    public native double decodeDouble(String key);
    @Mapping("decodeBytesForKey:returnedLength:")
    public native Todo decodeBytes(String key, Todo lengthp);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Mapping("encodeInteger:forKey:")
    public native void encodeInteger(@MachineSizedSInt long intv, String key);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Mapping("decodeIntegerForKey:")
    public native @MachineSizedSInt long decodeInteger(String key);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("decodeObjectOfClasses:forKey:")
    public native Object decodeObject(NSSet<?> classes, String key);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("decodePropertyListForKey:")
    public native Object decodePropertyList(String key);
    
}
