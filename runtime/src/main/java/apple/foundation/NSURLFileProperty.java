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
@Library("Foundation")
public class NSURLFileProperty 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSURLFileSizeKey")
    protected static native NSString FileSizeValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSURLFileAllocatedSizeKey")
    protected static native NSString FileAllocatedSizeValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSURLTotalFileSizeKey")
    protected static native NSString TotalFileSizeValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSURLTotalFileAllocatedSizeKey")
    protected static native NSString TotalFileAllocatedSizeValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSURLIsAliasFileKey")
    protected static native NSString IsAliasFileValue();
    
}
