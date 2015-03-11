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

@Library("Foundation") @Mapping("NSURLSession")
public class NSURLSession 
    extends NSObject 
     {

    
    
    public NSURLSession() {}
    
    
    @Mapping("delegateQueue")
    public native NSOperationQueue getDelegateQueue();
    @Mapping("delegate")
    public native NSURLSessionDelegate getDelegate();
    @Mapping("configuration")
    public native NSURLSessionConfiguration getConfiguration();
    @Mapping("sessionDescription")
    public native String getSessionDescription();
    @Mapping("setSessionDescription:")
    public native void setSessionDescription(String v);
    
    
    
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("NSURLSessionTransferSizeUnknown")
    public static native long getTransferSizeUnknown();
    
    @Mapping("finishTasksAndInvalidate")
    public native void finishTasksAndInvalidate();
    @Mapping("invalidateAndCancel")
    public native void invalidateAndCancel();
    @Mapping("resetWithCompletionHandler:")
    public native void reset(@Block Runnable completionHandler);
    @Mapping("flushWithCompletionHandler:")
    public native void flush(@Block Runnable completionHandler);
    @Mapping("getTasksWithCompletionHandler:")
    public native void getTasks(@Block VoidBlock3<NSArray<NSURLSessionDataTask>, NSArray<NSURLSessionUploadTask>, NSArray<NSURLSessionDownloadTask>> completionHandler);
    @Mapping("dataTaskWithRequest:")
    public native NSURLSessionDataTask newDataTask(NSURLRequest request);
    @Mapping("dataTaskWithURL:")
    public native NSURLSessionDataTask newDataTask(NSURL url);
    @Mapping("uploadTaskWithRequest:fromFile:")
    public native NSURLSessionUploadTask newUploadTask(NSURLRequest request, NSURL fileURL);
    @Mapping("uploadTaskWithRequest:fromData:")
    public native NSURLSessionUploadTask newUploadTask(NSURLRequest request, NSData bodyData);
    @Mapping("uploadTaskWithStreamedRequest:")
    public native NSURLSessionUploadTask newStreamedUploadTask(NSURLRequest request);
    @Mapping("downloadTaskWithRequest:")
    public native NSURLSessionDownloadTask newDownloadTask(NSURLRequest request);
    @Mapping("downloadTaskWithURL:")
    public native NSURLSessionDownloadTask newDownloadTask(NSURL url);
    @Mapping("downloadTaskWithResumeData:")
    public native NSURLSessionDownloadTask newDownloadTask(NSData resumeData);
    @Mapping("sharedSession")
    public static native NSURLSession getSharedSession();
    @Mapping("sessionWithConfiguration:")
    public static native NSURLSession create(NSURLSessionConfiguration configuration);
    @Mapping("sessionWithConfiguration:delegate:delegateQueue:")
    public static native NSURLSession create(NSURLSessionConfiguration configuration, NSURLSessionDelegate delegate, NSOperationQueue queue);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("dataTaskWithRequest:completionHandler:")
    public native NSURLSessionDataTask newDataTask(NSURLRequest request, @Block VoidBlock3<NSData, NSURLResponse, NSError> completionHandler);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("dataTaskWithURL:completionHandler:")
    public native NSURLSessionDataTask newDataTask(NSURL url, @Block VoidBlock3<NSData, NSURLResponse, NSError> completionHandler);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("uploadTaskWithRequest:fromFile:completionHandler:")
    public native NSURLSessionUploadTask newUploadTask(NSURLRequest request, NSURL fileURL, @Block VoidBlock3<NSData, NSURLResponse, NSError> completionHandler);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("uploadTaskWithRequest:fromData:completionHandler:")
    public native NSURLSessionUploadTask newUploadTask(NSURLRequest request, NSData bodyData, @Block VoidBlock3<NSData, NSURLResponse, NSError> completionHandler);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("downloadTaskWithRequest:completionHandler:")
    public native NSURLSessionDownloadTask newDownloadTask(NSURLRequest request, @Block VoidBlock3<NSURL, NSURLResponse, NSError> completionHandler);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("downloadTaskWithURL:completionHandler:")
    public native NSURLSessionDownloadTask newDownloadTask(NSURL url, @Block VoidBlock3<NSURL, NSURLResponse, NSError> completionHandler);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("downloadTaskWithResumeData:completionHandler:")
    public native NSURLSessionDownloadTask newDownloadTask(NSData resumeData, @Block VoidBlock3<NSURL, NSURLResponse, NSError> completionHandler);
    /**
     * @since Available in iOS 7.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Mapping("dataTaskWithHTTPGetRequest:")
    public native NSURLSessionDataTask newHTTPGetDataTask(NSURL url);
    /**
     * @since Available in iOS 7.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Mapping("dataTaskWithHTTPGetRequest:completionHandler:")
    public native NSURLSessionDataTask newHTTPGetDataTask(NSURL url, @Block VoidBlock3<NSData, NSURLResponse, NSError> completionHandler);
    
}
