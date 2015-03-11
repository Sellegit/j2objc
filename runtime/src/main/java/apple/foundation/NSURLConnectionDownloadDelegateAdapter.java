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
public abstract class NSURLConnectionDownloadDelegateAdapter 
    extends NSURLConnectionDelegateAdapter 
    implements NSURLConnectionDownloadDelegate {

    
    
    
    
    
    
    
    @NotImplemented("connection:didWriteData:totalBytesWritten:expectedTotalBytes:")
    public void didWriteData(NSURLConnection connection, long bytesWritten, long totalBytesWritten, long expectedTotalBytes) { throw new UnsupportedOperationException(); }
    @NotImplemented("connectionDidResumeDownloading:totalBytesWritten:expectedTotalBytes:")
    public void didResumeDownloading(NSURLConnection connection, long totalBytesWritten, long expectedTotalBytes) { throw new UnsupportedOperationException(); }
    @NotImplemented("connectionDidFinishDownloading:destinationURL:")
    public void didFinishDownloading(NSURLConnection connection, NSURL destinationURL) { throw new UnsupportedOperationException(); }
    
}
