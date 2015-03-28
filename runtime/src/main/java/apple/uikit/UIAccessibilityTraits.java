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

/*<javadoc>*/
/*</javadoc>*/
@Library("UIKit/UIKit.h")
public final class UIAccessibilityTraits 
    extends Bits<UIAccessibilityTraits> 
     {

    
    
    protected UIAccessibilityTraits() {}

    
    
    
    @GlobalConstant("UIAccessibilityTraitNone")
    public static native long NoneValue();
    @GlobalConstant("UIAccessibilityTraitButton")
    public static native long ButtonValue();
    @GlobalConstant("UIAccessibilityTraitLink")
    public static native long LinkValue();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("UIAccessibilityTraitHeader")
    public static native long HeaderValue();
    @GlobalConstant("UIAccessibilityTraitSearchField")
    public static native long SearchFieldValue();
    @GlobalConstant("UIAccessibilityTraitImage")
    public static native long ImageValue();
    @GlobalConstant("UIAccessibilityTraitSelected")
    public static native long SelectedValue();
    @GlobalConstant("UIAccessibilityTraitPlaysSound")
    public static native long PlaysSoundValue();
    @GlobalConstant("UIAccessibilityTraitKeyboardKey")
    public static native long KeyboardKeyValue();
    @GlobalConstant("UIAccessibilityTraitStaticText")
    public static native long StaticTextValue();
    @GlobalConstant("UIAccessibilityTraitSummaryElement")
    public static native long SummaryElementValue();
    @GlobalConstant("UIAccessibilityTraitNotEnabled")
    public static native long NotEnabledValue();
    @GlobalConstant("UIAccessibilityTraitUpdatesFrequently")
    public static native long UpdatesFrequentlyValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("UIAccessibilityTraitStartsMediaSession")
    public static native long StartsMediaSessionValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("UIAccessibilityTraitAdjustable")
    public static native long AdjustableValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("UIAccessibilityTraitAllowsDirectInteraction")
    public static native long AllowsDirectInteractionValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("UIAccessibilityTraitCausesPageTurn")
    public static native long CausesPageTurnValue();

}
