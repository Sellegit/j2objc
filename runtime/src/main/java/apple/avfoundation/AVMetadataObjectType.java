package apple.avfoundation;


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
import apple.dispatch.*;
import apple.coreanimation.*;
import apple.coreaudio.*;
import apple.coremedia.*;
import apple.corevideo.*;
import apple.mediatoolbox.*;

/*<javadoc>*/
/*</javadoc>*/
@Library("AVFoundation/AVFoundation.h")
public class AVMetadataObjectType 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("AVMetadataObjectTypeFace")
    public static native NSString FaceValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("AVMetadataObjectTypeUPCECode")
    public static native NSString UPCECodeValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("AVMetadataObjectTypeCode39Code")
    public static native NSString Code39CodeValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("AVMetadataObjectTypeCode39Mod43Code")
    public static native NSString Code39Mod43CodeValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("AVMetadataObjectTypeEAN13Code")
    public static native NSString EAN13CodeValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("AVMetadataObjectTypeEAN8Code")
    public static native NSString EAN8CodeValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("AVMetadataObjectTypeCode93Code")
    public static native NSString Code93CodeValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("AVMetadataObjectTypeCode128Code")
    public static native NSString Code128CodeValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("AVMetadataObjectTypePDF417Code")
    public static native NSString PDF417CodeValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("AVMetadataObjectTypeQRCode")
    public static native NSString QRCodeValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("AVMetadataObjectTypeAztecCode")
    public static native NSString AztecCodeValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataObjectTypeInterleaved2of5Code")
    public static native NSString Interleaved2of5CodeValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataObjectTypeITF14Code")
    public static native NSString ITF14CodeValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataObjectTypeDataMatrixCode")
    public static native NSString DataMatrixCodeValue();

}
