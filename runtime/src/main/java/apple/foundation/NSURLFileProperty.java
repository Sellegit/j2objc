package apple.foundation;


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
import apple.uikit.*;
import apple.coreanimation.*;
import apple.coredata.*;
import apple.coremedia.*;
import apple.security.*;
import apple.dispatch.*;

/*<javadoc>*/
/*</javadoc>*/
@Library("Foundation/Foundation.h")
public class NSURLFileProperty 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSURLFileSizeKey")
    public static native NSString FileSizeValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSURLFileAllocatedSizeKey")
    public static native NSString FileAllocatedSizeValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSURLTotalFileSizeKey")
    public static native NSString TotalFileSizeValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSURLTotalFileAllocatedSizeKey")
    public static native NSString TotalFileAllocatedSizeValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSURLIsAliasFileKey")
    public static native NSString IsAliasFileValue();

}
