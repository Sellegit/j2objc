package apple.mobilecoreservices;


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
@Library("MobileCoreServices/MobileCoreServices.h")
public class UTTagClass 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("kUTTagClassFilenameExtension")
    public static native CFString FilenameExtensionValue();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("kUTTagClassMIMEType")
    public static native CFString MIMETypeValue();
    
}
