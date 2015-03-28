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
@Library("WebKit/WebKit.h")
@Mapping("WKErrorCode")
public final class WKErrorCode extends ObjCEnum {
    
    @GlobalConstant("WKErrorUnknown")
    public static final long Unknown = 1L;
    @GlobalConstant("WKErrorWebContentProcessTerminated")
    public static final long WebContentProcessTerminated = 2L;
    @GlobalConstant("WKErrorWebViewInvalidated")
    public static final long WebViewInvalidated = 3L;
    @GlobalConstant("WKErrorJavaScriptExceptionOccurred")
    public static final long JavaScriptExceptionOccurred = 4L;


}
