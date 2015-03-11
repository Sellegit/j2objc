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



/**
 * @since Available in iOS 2.0 and later.
 * @deprecated Deprecated in iOS 6.0.
 */
@Deprecated


@Mapping("UILineBreakMode")
public final class UILineBreakMode extends ObjCEnum {
    
    @GlobalConstant("UILineBreakModeWordWrap")
    public static final long WordWrap = 0L;
    @GlobalConstant("UILineBreakModeCharacterWrap")
    public static final long CharacterWrap = 1L;
    @GlobalConstant("UILineBreakModeClip")
    public static final long Clip = 2L;
    @GlobalConstant("UILineBreakModeHeadTruncation")
    public static final long HeadTruncation = 3L;
    @GlobalConstant("UILineBreakModeTailTruncation")
    public static final long TailTruncation = 4L;
    @GlobalConstant("UILineBreakModeMiddleTruncation")
    public static final long MiddleTruncation = 5L;
    

}
