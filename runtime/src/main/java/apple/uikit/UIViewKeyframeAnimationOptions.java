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
 * @since Available in iOS 7.0 and later.
 */

@Library("UIKit")
@Mapping("UIViewKeyframeAnimationOptions")
public final class UIViewKeyframeAnimationOptions extends ObjCEnum {
    
    @GlobalConstant("UIViewKeyframeAnimationOptionLayoutSubviews")
    public static final long LayoutSubviews = 1L;
    @GlobalConstant("UIViewKeyframeAnimationOptionAllowUserInteraction")
    public static final long AllowUserInteraction = 2L;
    @GlobalConstant("UIViewKeyframeAnimationOptionBeginFromCurrentState")
    public static final long BeginFromCurrentState = 4L;
    @GlobalConstant("UIViewKeyframeAnimationOptionRepeat")
    public static final long Repeat = 8L;
    @GlobalConstant("UIViewKeyframeAnimationOptionAutoreverse")
    public static final long Autoreverse = 16L;
    @GlobalConstant("UIViewKeyframeAnimationOptionOverrideInheritedDuration")
    public static final long OverrideInheritedDuration = 32L;
    @GlobalConstant("UIViewKeyframeAnimationOptionOverrideInheritedOptions")
    public static final long OverrideInheritedOptions = 512L;
    @GlobalConstant("UIViewKeyframeAnimationOptionCalculationModeLinear")
    public static final long CalculationModeLinear = 0L;
    @GlobalConstant("UIViewKeyframeAnimationOptionCalculationModeDiscrete")
    public static final long CalculationModeDiscrete = 1024L;
    @GlobalConstant("UIViewKeyframeAnimationOptionCalculationModePaced")
    public static final long CalculationModePaced = 2048L;
    @GlobalConstant("UIViewKeyframeAnimationOptionCalculationModeCubic")
    public static final long CalculationModeCubic = 3072L;
    @GlobalConstant("UIViewKeyframeAnimationOptionCalculationModeCubicPaced")
    public static final long CalculationModeCubicPaced = 4096L;
    

}
