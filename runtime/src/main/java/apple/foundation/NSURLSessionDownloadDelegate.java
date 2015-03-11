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





@Library("Foundation") @Mapping("NSURLSessionDownloadDelegate")
public interface NSURLSessionDownloadDelegate 
    extends NSURLSessionTaskDelegate {

    
    
    
    
    
    @Mapping("URLSession:downloadTask:didFinishDownloadingToURL:")
    void didFinishDownloading(NSURLSession session, NSURLSessionDownloadTask downloadTask, NSURL location);
    @Mapping("URLSession:downloadTask:didWriteData:totalBytesWritten:totalBytesExpectedToWrite:")
    void didWriteData(NSURLSession session, NSURLSessionDownloadTask downloadTask, long bytesWritten, long totalBytesWritten, long totalBytesExpectedToWrite);
    @Mapping("URLSession:downloadTask:didResumeAtOffset:expectedTotalBytes:")
    void didResume(NSURLSession session, NSURLSessionDownloadTask downloadTask, long fileOffset, long expectedTotalBytes);
    
    /*<adapter>*/
    /*</adapter>*/
}
