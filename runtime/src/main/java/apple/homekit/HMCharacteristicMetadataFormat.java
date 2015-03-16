package apple.homekit;


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


/*<javadoc>*/
/*</javadoc>*/
@Library("HomeKit/HomeKit.h")
public class HMCharacteristicMetadataFormat 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HMCharacteristicMetadataFormatBool")
    protected static native NSString BoolValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HMCharacteristicMetadataFormatInt")
    protected static native NSString IntValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HMCharacteristicMetadataFormatFloat")
    protected static native NSString FloatValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HMCharacteristicMetadataFormatString")
    protected static native NSString StringValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HMCharacteristicMetadataFormatArray")
    protected static native NSString ArrayValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HMCharacteristicMetadataFormatDictionary")
    protected static native NSString DictionaryValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HMCharacteristicMetadataFormatUInt8")
    protected static native NSString UInt8Value();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HMCharacteristicMetadataFormatUInt16")
    protected static native NSString UInt16Value();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HMCharacteristicMetadataFormatUInt32")
    protected static native NSString UInt32Value();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HMCharacteristicMetadataFormatUInt64")
    protected static native NSString UInt64Value();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HMCharacteristicMetadataFormatData")
    protected static native NSString DataValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HMCharacteristicMetadataFormatTLV8")
    protected static native NSString TLV8Value();
    
}
