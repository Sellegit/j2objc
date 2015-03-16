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



/**
 * @since Available in iOS 7.0 and later.
 */

@Library("Foundation/Foundation.h")
@Mapping("NSURLSessionTaskState")
public final class NSURLSessionTaskState extends ObjCEnum {
    
    @GlobalConstant("NSURLSessionTaskStateRunning")
    public static final long Running = 0L;
    @GlobalConstant("NSURLSessionTaskStateSuspended")
    public static final long Suspended = 1L;
    @GlobalConstant("NSURLSessionTaskStateCanceling")
    public static final long Canceling = 2L;
    @GlobalConstant("NSURLSessionTaskStateCompleted")
    public static final long Completed = 3L;
    

}
