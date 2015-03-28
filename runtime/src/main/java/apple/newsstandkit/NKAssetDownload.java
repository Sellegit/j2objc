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
@Library("NewsstandKit/NewsstandKit.h") @Mapping("NKAssetDownload")
public class NKAssetDownload 
    extends NSObject 
     {

    
    
    @Mapping("init")
    public NKAssetDownload() { }

    
    @Mapping("issue")
    public native NKIssue getIssue();
    @Mapping("identifier")
    public native String getIdentifier();
    @Mapping("userInfo")
    public native NSDictionary<?, ?> getUserInfo();
    @Mapping("setUserInfo:")
    public native void setUserInfo(NSDictionary<?, ?> v);
    @Mapping("URLRequest")
    public native NSURLRequest getURLRequest();

    
    
    @Mapping("downloadWithDelegate:")
    public native NSURLConnection download(NSURLConnectionDownloadDelegate delegate);

}
