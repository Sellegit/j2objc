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
public class PHImageRequestResult 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("PHImageResultIsInCloudKey")
    protected static native NSString ResultIsInCloudKey();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("PHImageResultIsDegradedKey")
    protected static native NSString ResultIsDegradedKey();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("PHImageResultRequestIDKey")
    protected static native NSString ResultRequestIDKey();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("PHImageCancelledKey")
    protected static native NSString CancelledKey();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("PHImageErrorKey")
    protected static native NSString ErrorKey();
    
}
