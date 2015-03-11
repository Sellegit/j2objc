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
 * @since Available in iOS 4.0 and later.
 */


@Mapping("UIViewAnimationOptions")
public final class UIViewAnimationOptions extends ObjCEnum {
    
    @GlobalConstant("UIViewAnimationOptionLayoutSubviews")
    public static final long LayoutSubviews = 1L;
    @GlobalConstant("UIViewAnimationOptionAllowUserInteraction")
    public static final long AllowUserInteraction = 2L;
    @GlobalConstant("UIViewAnimationOptionBeginFromCurrentState")
    public static final long BeginFromCurrentState = 4L;
    @GlobalConstant("UIViewAnimationOptionRepeat")
    public static final long Repeat = 8L;
    @GlobalConstant("UIViewAnimationOptionAutoreverse")
    public static final long Autoreverse = 16L;
    @GlobalConstant("UIViewAnimationOptionOverrideInheritedDuration")
    public static final long OverrideInheritedDuration = 32L;
    @GlobalConstant("UIViewAnimationOptionOverrideInheritedCurve")
    public static final long OverrideInheritedCurve = 64L;
    @GlobalConstant("UIViewAnimationOptionAllowAnimatedContent")
    public static final long AllowAnimatedContent = 128L;
    @GlobalConstant("UIViewAnimationOptionShowHideTransitionViews")
    public static final long ShowHideTransitionViews = 256L;
    @GlobalConstant("UIViewAnimationOptionOverrideInheritedOptions")
    public static final long OverrideInheritedOptions = 512L;
    @GlobalConstant("UIViewAnimationOptionCurveEaseInOut")
    public static final long CurveEaseInOut = 0L;
    @GlobalConstant("UIViewAnimationOptionCurveEaseIn")
    public static final long CurveEaseIn = 65536L;
    @GlobalConstant("UIViewAnimationOptionCurveEaseOut")
    public static final long CurveEaseOut = 131072L;
    @GlobalConstant("UIViewAnimationOptionCurveLinear")
    public static final long CurveLinear = 196608L;
    @GlobalConstant("UIViewAnimationOptionTransitionNone")
    public static final long TransitionNone = 0L;
    @GlobalConstant("UIViewAnimationOptionTransitionFlipFromLeft")
    public static final long TransitionFlipFromLeft = 1048576L;
    @GlobalConstant("UIViewAnimationOptionTransitionFlipFromRight")
    public static final long TransitionFlipFromRight = 2097152L;
    @GlobalConstant("UIViewAnimationOptionTransitionCurlUp")
    public static final long TransitionCurlUp = 3145728L;
    @GlobalConstant("UIViewAnimationOptionTransitionCurlDown")
    public static final long TransitionCurlDown = 4194304L;
    @GlobalConstant("UIViewAnimationOptionTransitionCrossDissolve")
    public static final long TransitionCrossDissolve = 5242880L;
    @GlobalConstant("UIViewAnimationOptionTransitionFlipFromTop")
    public static final long TransitionFlipFromTop = 6291456L;
    @GlobalConstant("UIViewAnimationOptionTransitionFlipFromBottom")
    public static final long TransitionFlipFromBottom = 7340032L;
    

}
