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
@Adapter
public abstract class NSURLSessionDownloadDelegateAdapter 
    extends NSURLSessionTaskDelegateAdapter 
    implements NSURLSessionDownloadDelegate {

    
    
    


    
    
    @NotImplemented("URLSession:downloadTask:didFinishDownloadingToURL:")
    public void didFinishDownloading(NSURLSession session, NSURLSessionDownloadTask downloadTask, NSURL location) { throw new UnsupportedOperationException(); }
    @NotImplemented("URLSession:downloadTask:didWriteData:totalBytesWritten:totalBytesExpectedToWrite:")
    public void didWriteData(NSURLSession session, NSURLSessionDownloadTask downloadTask, long bytesWritten, long totalBytesWritten, long totalBytesExpectedToWrite) { throw new UnsupportedOperationException(); }
    @NotImplemented("URLSession:downloadTask:didResumeAtOffset:expectedTotalBytes:")
    public void didResume(NSURLSession session, NSURLSessionDownloadTask downloadTask, long fileOffset, long expectedTotalBytes) { throw new UnsupportedOperationException(); }

}
