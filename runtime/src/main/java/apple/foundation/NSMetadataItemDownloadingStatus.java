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
@Library("Foundation/Foundation.h")
public class NSMetadataItemDownloadingStatus 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("NSMetadataUbiquitousItemDownloadingStatusNotDownloaded")
    protected static native NSString NotDownloadedValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("NSMetadataUbiquitousItemDownloadingStatusDownloaded")
    protected static native NSString DownloadedValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("NSMetadataUbiquitousItemDownloadingStatusCurrent")
    protected static native NSString CurrentValue();
    
}