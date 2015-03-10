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
public class NSProgressUserInfoKey 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("NSProgressEstimatedTimeRemainingKey")
    protected static native NSString EstimatedTimeRemainingValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("NSProgressThroughputKey")
    protected static native NSString ThroughputValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("NSProgressFileOperationKindKey")
    protected static native NSString FileOperationKindValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("NSProgressFileURLKey")
    protected static native NSString FileURLValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("NSProgressFileTotalCountKey")
    protected static native NSString FileTotalCountValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("NSProgressFileCompletedCountKey")
    protected static native NSString FileCompletedCountValue();
    
}
