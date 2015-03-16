package apple.storekit;


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
import apple.uikit.*;
import apple.accounts.*;



/**
 * @since Available in iOS 6.0 and later.
 */

@Library("StoreKit/StoreKit.h")
@Mapping("SKDownloadState")
public final class SKDownloadState extends ObjCEnum {
    
    @GlobalConstant("SKDownloadStateWaiting")
    public static final long Waiting = 0L;
    @GlobalConstant("SKDownloadStateActive")
    public static final long Active = 1L;
    @GlobalConstant("SKDownloadStatePaused")
    public static final long Paused = 2L;
    @GlobalConstant("SKDownloadStateFinished")
    public static final long Finished = 3L;
    @GlobalConstant("SKDownloadStateFailed")
    public static final long Failed = 4L;
    @GlobalConstant("SKDownloadStateCancelled")
    public static final long Cancelled = 5L;
    

}
