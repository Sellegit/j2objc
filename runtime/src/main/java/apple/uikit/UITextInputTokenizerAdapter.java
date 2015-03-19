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
@Adapter
public abstract class UITextInputTokenizerAdapter 
    extends Object 
    implements UITextInputTokenizer {

    
    
    
    
    
    
    
    @NotImplemented("rangeEnclosingPosition:withGranularity:inDirection:")
    public UITextRange getRangeEnclosingPosition(UITextPosition position, @Representing("UITextGranularity") long granularity, @MachineSizedSInt long direction) { throw new UnsupportedOperationException(); }
    @NotImplemented("isPosition:atBoundary:inDirection:")
    public boolean isPositionAtBoundary(UITextPosition position, @Representing("UITextGranularity") long granularity, @MachineSizedSInt long direction) { throw new UnsupportedOperationException(); }
    @NotImplemented("positionFromPosition:toBoundary:inDirection:")
    public UITextPosition getPosition(UITextPosition position, @Representing("UITextGranularity") long granularity, @MachineSizedSInt long direction) { throw new UnsupportedOperationException(); }
    @NotImplemented("isPosition:withinTextUnit:inDirection:")
    public boolean isPositionWithinTextUnit(UITextPosition position, @Representing("UITextGranularity") long granularity, @MachineSizedSInt long direction) { throw new UnsupportedOperationException(); }
    
}
