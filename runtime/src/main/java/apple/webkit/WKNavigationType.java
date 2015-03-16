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
@Mapping("WKNavigationType")
public final class WKNavigationType extends ObjCEnum {
    
    @GlobalConstant("WKNavigationTypeLinkActivated")
    public static final long LinkActivated = 0L;
    @GlobalConstant("WKNavigationTypeFormSubmitted")
    public static final long FormSubmitted = 1L;
    @GlobalConstant("WKNavigationTypeBackForward")
    public static final long BackForward = 2L;
    @GlobalConstant("WKNavigationTypeReload")
    public static final long Reload = 3L;
    @GlobalConstant("WKNavigationTypeFormResubmitted")
    public static final long FormResubmitted = 4L;
    @GlobalConstant("WKNavigationTypeOther")
    public static final long Other = -1L;
    

}
