package apple.coreimage;


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
import apple.opengles.*;
import apple.corevideo.*;
import apple.imageio.*;


/*<javadoc>*/
/*</javadoc>*/
@Library("CoreImage/CoreImage.h")
public class CIFilterAttributeType 
    extends Object 
     {

    
    
    
    
    
    @GlobalConstant("kCIAttributeTypeTime")
    public static native NSString TimeValue();
    @GlobalConstant("kCIAttributeTypeScalar")
    public static native NSString ScalarValue();
    @GlobalConstant("kCIAttributeTypeDistance")
    public static native NSString DistanceValue();
    @GlobalConstant("kCIAttributeTypeAngle")
    public static native NSString AngleValue();
    @GlobalConstant("kCIAttributeTypeBoolean")
    public static native NSString BooleanValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCIAttributeTypeInteger")
    public static native NSString IntegerValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCIAttributeTypeCount")
    public static native NSString CountValue();
    @GlobalConstant("kCIAttributeTypePosition")
    public static native NSString PositionValue();
    @GlobalConstant("kCIAttributeTypeOffset")
    public static native NSString OffsetValue();
    @GlobalConstant("kCIAttributeTypePosition3")
    public static native NSString Position3Value();
    @GlobalConstant("kCIAttributeTypeRectangle")
    public static native NSString RectangleValue();
    @GlobalConstant("kCIAttributeTypeColor")
    public static native NSString ColorValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCIAttributeTypeImage")
    public static native NSString ImageValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCIAttributeTypeTransform")
    public static native NSString TransformValue();
    
}
