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
public class CIFilterAttributes 
    extends Object 
     {

    
    
    
    
    
    @GlobalConstant("kCIAttributeFilterName")
    protected static native NSString NameKey();
    @GlobalConstant("kCIAttributeFilterDisplayName")
    protected static native NSString DisplayNameKey();
    @GlobalConstant("kCIAttributeFilterCategories")
    protected static native NSString CategoriesKey();
    
}
