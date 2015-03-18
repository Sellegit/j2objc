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
public class NSProgressFileOperationKind 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("NSProgressFileOperationKindDownloading")
    public static native NSString DownloadingValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("NSProgressFileOperationKindDecompressingAfterDownloading")
    public static native NSString DecompressingAfterDownloadingValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("NSProgressFileOperationKindReceiving")
    public static native NSString ReceivingValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("NSProgressFileOperationKindCopying")
    public static native NSString CopyingValue();
    
}
