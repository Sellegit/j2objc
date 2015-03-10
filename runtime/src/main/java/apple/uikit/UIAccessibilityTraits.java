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
@Library("UIKit")
public final class UIAccessibilityTraits 
    extends Bits<UIAccessibilityTraits> 
     {

    
    
    protected UIAccessibilityTraits() {}
    
    
    
    
    @GlobalConstant("UIAccessibilityTraitNone")
    protected static native long NoneValue();
    @GlobalConstant("UIAccessibilityTraitButton")
    protected static native long ButtonValue();
    @GlobalConstant("UIAccessibilityTraitLink")
    protected static native long LinkValue();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("UIAccessibilityTraitHeader")
    protected static native long HeaderValue();
    @GlobalConstant("UIAccessibilityTraitSearchField")
    protected static native long SearchFieldValue();
    @GlobalConstant("UIAccessibilityTraitImage")
    protected static native long ImageValue();
    @GlobalConstant("UIAccessibilityTraitSelected")
    protected static native long SelectedValue();
    @GlobalConstant("UIAccessibilityTraitPlaysSound")
    protected static native long PlaysSoundValue();
    @GlobalConstant("UIAccessibilityTraitKeyboardKey")
    protected static native long KeyboardKeyValue();
    @GlobalConstant("UIAccessibilityTraitStaticText")
    protected static native long StaticTextValue();
    @GlobalConstant("UIAccessibilityTraitSummaryElement")
    protected static native long SummaryElementValue();
    @GlobalConstant("UIAccessibilityTraitNotEnabled")
    protected static native long NotEnabledValue();
    @GlobalConstant("UIAccessibilityTraitUpdatesFrequently")
    protected static native long UpdatesFrequentlyValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("UIAccessibilityTraitStartsMediaSession")
    protected static native long StartsMediaSessionValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("UIAccessibilityTraitAdjustable")
    protected static native long AdjustableValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("UIAccessibilityTraitAllowsDirectInteraction")
    protected static native long AllowsDirectInteractionValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("UIAccessibilityTraitCausesPageTurn")
    protected static native long CausesPageTurnValue();
    
}
