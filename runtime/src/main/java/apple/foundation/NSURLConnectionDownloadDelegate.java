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





@Library("Foundation") @Mapping("NSURLConnectionDownloadDelegate")
public interface NSURLConnectionDownloadDelegate 
    extends NSURLConnectionDelegate {

    
    
    
    
    
    @Mapping("connection:didWriteData:totalBytesWritten:expectedTotalBytes:")
    void didWriteData(NSURLConnection connection, long bytesWritten, long totalBytesWritten, long expectedTotalBytes);
    @Mapping("connectionDidResumeDownloading:totalBytesWritten:expectedTotalBytes:")
    void didResumeDownloading(NSURLConnection connection, long totalBytesWritten, long expectedTotalBytes);
    @Mapping("connectionDidFinishDownloading:destinationURL:")
    void didFinishDownloading(NSURLConnection connection, NSURL destinationURL);
    
    /*<adapter>*/
    /*</adapter>*/
}
