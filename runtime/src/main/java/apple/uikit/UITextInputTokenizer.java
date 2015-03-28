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


@Library("UIKit/UIKit.h") @Mapping("UITextInputTokenizer")
public interface UITextInputTokenizer 
    extends NSObjectProtocol {

    
    


    
    @Mapping("rangeEnclosingPosition:withGranularity:inDirection:")
    UITextRange getRangeEnclosingPosition(UITextPosition position, @Representing("UITextGranularity") long granularity, @MachineSizedSInt long direction);
    @Mapping("isPosition:atBoundary:inDirection:")
    boolean isPositionAtBoundary(UITextPosition position, @Representing("UITextGranularity") long granularity, @MachineSizedSInt long direction);
    @Mapping("positionFromPosition:toBoundary:inDirection:")
    UITextPosition getPosition(UITextPosition position, @Representing("UITextGranularity") long granularity, @MachineSizedSInt long direction);
    @Mapping("isPosition:withinTextUnit:inDirection:")
    boolean isPositionWithinTextUnit(UITextPosition position, @Representing("UITextGranularity") long granularity, @MachineSizedSInt long direction);

    /*<adapter>*/
    /*</adapter>*/
}
