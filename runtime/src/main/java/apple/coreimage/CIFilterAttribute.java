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
@Library("CoreImage")
public class CIFilterAttribute 
    extends Object 
     {

    
    
    
    
    
    @GlobalConstant("kCIAttributeClass")
    protected static native NSString ClassKey();
    @GlobalConstant("kCIAttributeType")
    protected static native NSString TypeKey();
    @GlobalConstant("kCIAttributeMin")
    protected static native NSString MinKey();
    @GlobalConstant("kCIAttributeMax")
    protected static native NSString MaxKey();
    @GlobalConstant("kCIAttributeSliderMin")
    protected static native NSString SliderMinKey();
    @GlobalConstant("kCIAttributeSliderMax")
    protected static native NSString SliderMaxKey();
    @GlobalConstant("kCIAttributeDefault")
    protected static native NSString DefaultKey();
    @GlobalConstant("kCIAttributeIdentity")
    protected static native NSString IdentityKey();
    @GlobalConstant("kCIAttributeName")
    protected static native NSString NameKey();
    @GlobalConstant("kCIAttributeDisplayName")
    protected static native NSString DisplayNameKey();
    
}
