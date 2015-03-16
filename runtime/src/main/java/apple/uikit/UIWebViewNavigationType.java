package apple.uikit;


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
import apple.coreanimation.*;
import apple.coredata.*;
import apple.coreimage.*;
import apple.coretext.*;
import apple.corelocation.*;





@Library("UIKit/UIKit.h")
@Mapping("UIWebViewNavigationType")
public final class UIWebViewNavigationType extends ObjCEnum {
    
    @GlobalConstant("UIWebViewNavigationTypeLinkClicked")
    public static final long LinkClicked = 0L;
    @GlobalConstant("UIWebViewNavigationTypeFormSubmitted")
    public static final long FormSubmitted = 1L;
    @GlobalConstant("UIWebViewNavigationTypeBackForward")
    public static final long BackForward = 2L;
    @GlobalConstant("UIWebViewNavigationTypeReload")
    public static final long Reload = 3L;
    @GlobalConstant("UIWebViewNavigationTypeFormResubmitted")
    public static final long FormResubmitted = 4L;
    @GlobalConstant("UIWebViewNavigationTypeOther")
    public static final long Other = 5L;
    

}
