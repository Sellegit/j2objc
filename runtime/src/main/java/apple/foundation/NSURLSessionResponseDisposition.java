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

@Library("Foundation")
@Mapping("NSURLSessionResponseDisposition")
public final class NSURLSessionResponseDisposition extends ObjCEnum {
    
    @GlobalConstant("NSURLSessionResponseCancel")
    public static final long Cancel = 0L;
    @GlobalConstant("NSURLSessionResponseAllow")
    public static final long Allow = 1L;
    @GlobalConstant("NSURLSessionResponseBecomeDownload")
    public static final long BecomeDownload = 2L;
    

}
