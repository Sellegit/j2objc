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
    protected static native NSString TimeValue();
    @GlobalConstant("kCIAttributeTypeScalar")
    protected static native NSString ScalarValue();
    @GlobalConstant("kCIAttributeTypeDistance")
    protected static native NSString DistanceValue();
    @GlobalConstant("kCIAttributeTypeAngle")
    protected static native NSString AngleValue();
    @GlobalConstant("kCIAttributeTypeBoolean")
    protected static native NSString BooleanValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCIAttributeTypeInteger")
    protected static native NSString IntegerValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCIAttributeTypeCount")
    protected static native NSString CountValue();
    @GlobalConstant("kCIAttributeTypePosition")
    protected static native NSString PositionValue();
    @GlobalConstant("kCIAttributeTypeOffset")
    protected static native NSString OffsetValue();
    @GlobalConstant("kCIAttributeTypePosition3")
    protected static native NSString Position3Value();
    @GlobalConstant("kCIAttributeTypeRectangle")
    protected static native NSString RectangleValue();
    @GlobalConstant("kCIAttributeTypeColor")
    protected static native NSString ColorValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCIAttributeTypeImage")
    protected static native NSString ImageValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCIAttributeTypeTransform")
    protected static native NSString TransformValue();
    
}
