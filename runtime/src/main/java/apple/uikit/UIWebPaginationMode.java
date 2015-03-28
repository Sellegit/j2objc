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
@Mapping("UIWebPaginationMode")
public final class UIWebPaginationMode extends ObjCEnum {
    
    @GlobalConstant("UIWebPaginationModeUnpaginated")
    public static final long Unpaginated = 0L;
    @GlobalConstant("UIWebPaginationModeLeftToRight")
    public static final long LeftToRight = 1L;
    @GlobalConstant("UIWebPaginationModeTopToBottom")
    public static final long TopToBottom = 2L;
    @GlobalConstant("UIWebPaginationModeBottomToTop")
    public static final long BottomToTop = 3L;
    @GlobalConstant("UIWebPaginationModeRightToLeft")
    public static final long RightToLeft = 4L;


}
