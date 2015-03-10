package apple.webkit;


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
import apple.uikit.*;



/**
 * @since Available in iOS 8.0 and later.
 */


@Mapping("WKNavigationResponsePolicy")
public final class WKNavigationResponsePolicy extends ObjCEnum {
    
    @GlobalConstant("WKNavigationResponsePolicyCancel")
    public static final long Cancel = 0L;
    @GlobalConstant("WKNavigationResponsePolicyAllow")
    public static final long Allow = 1L;
    

}
