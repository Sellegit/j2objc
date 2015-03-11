package apple.newsstandkit;


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



/**
 * @since Available in iOS 5.0 and later.
 */

@Library("NewsstandKit") @Mapping("NKIssue")
public class NKIssue 
    extends NSObject 
     {

    
    
    public NKIssue() {}
    
    
    @Mapping("downloadingAssets")
    public native NSArray<NKAssetDownload> getDownloadingAssets();
    @Mapping("contentURL")
    public native NSURL getContentURL();
    @Mapping("status")
    public native @Representing("NKIssueContentStatus") @MachineSizedSInt long getStatus();
    @Mapping("name")
    public native String getName();
    @Mapping("date")
    public native NSDate getDate();
    
    
    
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NKIssueDownloadCompletedNotification")
    public static native NSString DownloadCompletedNotification();
    
    @Mapping("addAssetWithRequest:")
    public native NKAssetDownload addAsset(NSURLRequest request);
    
}
