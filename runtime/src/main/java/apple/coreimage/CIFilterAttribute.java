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
public class CIFilterAttribute 
    extends Object 
     {

    
    
    
    
    
    @GlobalConstant("kCIAttributeClass")
    public static native NSString ClassKey();
    @GlobalConstant("kCIAttributeType")
    public static native NSString TypeKey();
    @GlobalConstant("kCIAttributeMin")
    public static native NSString MinKey();
    @GlobalConstant("kCIAttributeMax")
    public static native NSString MaxKey();
    @GlobalConstant("kCIAttributeSliderMin")
    public static native NSString SliderMinKey();
    @GlobalConstant("kCIAttributeSliderMax")
    public static native NSString SliderMaxKey();
    @GlobalConstant("kCIAttributeDefault")
    public static native NSString DefaultKey();
    @GlobalConstant("kCIAttributeIdentity")
    public static native NSString IdentityKey();
    @GlobalConstant("kCIAttributeName")
    public static native NSString NameKey();
    @GlobalConstant("kCIAttributeDisplayName")
    public static native NSString DisplayNameKey();

}
