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
 * @since Available in iOS 8.0 and later.
 */
@Library("Foundation/Foundation.h")
@Mapping("NSFormattingContext")
public final class NSFormattingContext extends ObjCEnum {
    
    @GlobalConstant("NSFormattingContextUnknown")
    public static final long Unknown = 0L;
    @GlobalConstant("NSFormattingContextDynamic")
    public static final long Dynamic = 1L;
    @GlobalConstant("NSFormattingContextStandalone")
    public static final long Standalone = 2L;
    @GlobalConstant("NSFormattingContextListItem")
    public static final long ListItem = 3L;
    @GlobalConstant("NSFormattingContextBeginningOfSentence")
    public static final long BeginningOfSentence = 4L;
    @GlobalConstant("NSFormattingContextMiddleOfSentence")
    public static final long MiddleOfSentence = 5L;


}
