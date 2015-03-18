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
 * @since Available in iOS 3.2 and later.
 */

@Library("UIKit/UIKit.h") @Mapping("UITextInputStringTokenizer")
public class UITextInputStringTokenizer 
    extends NSObject 
    implements UITextInputTokenizer {

    
    
    @Mapping("initWithTextInput:")
    public UITextInputStringTokenizer(Todo textInput) { }
    @Mapping("init")
    public UITextInputStringTokenizer() { }
    
    
    
    
    
    
    @Mapping("rangeEnclosingPosition:withGranularity:inDirection:")
    public native UITextRange getRangeEnclosingPosition(UITextPosition position, @Representing("UITextGranularity") @MachineSizedSInt long granularity, @MachineSizedSInt long direction);
    @Mapping("isPosition:atBoundary:inDirection:")
    public native boolean isPositionAtBoundary(UITextPosition position, @Representing("UITextGranularity") @MachineSizedSInt long granularity, @MachineSizedSInt long direction);
    @Mapping("positionFromPosition:toBoundary:inDirection:")
    public native UITextPosition getPosition(UITextPosition position, @Representing("UITextGranularity") @MachineSizedSInt long granularity, @MachineSizedSInt long direction);
    @Mapping("isPosition:withinTextUnit:inDirection:")
    public native boolean isPositionWithinTextUnit(UITextPosition position, @Representing("UITextGranularity") @MachineSizedSInt long granularity, @MachineSizedSInt long direction);
    
}
