package apple.photos;


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
import apple.corelocation.*;
import apple.uikit.*;
import apple.avfoundation.*;


/*<javadoc>*/
/*</javadoc>*/
@Library("Photos/Photos.h")
public class PHContentEditingInputRequestResult 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("PHContentEditingInputResultIsInCloudKey")
    public static native NSString ResultIsInCloudKey();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("PHContentEditingInputCancelledKey")
    public static native NSString CancelledKey();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("PHContentEditingInputErrorKey")
    public static native NSString ErrorKey();
    
}
