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

/*<javadoc>*/
/*</javadoc>*/
@Library("NewsstandKit/NewsstandKit.h") @Mapping("NSURLConnection")
public final class NSURLConnectionExtensions 
    extends NSExtensions 
     {

    
    
    private NSURLConnectionExtensions() {}

    
    /**
     * @since Available in iOS 5.0 and later.
     */
    @ExtensionMapping("newsstandAssetDownload")
    public static native NKAssetDownload getNewsstandAssetDownload(NSURLConnection thiz);

    
    


}
