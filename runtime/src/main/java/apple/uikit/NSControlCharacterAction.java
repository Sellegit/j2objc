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

@Library("UIKit/UIKit.h")
@Mapping("NSControlCharacterAction")
public final class NSControlCharacterAction extends ObjCEnum {
    
    @GlobalConstant("NSControlCharacterZeroAdvancementAction")
    public static final long ZeroAdvancementAction = 1L;
    @GlobalConstant("NSControlCharacterWhitespaceAction")
    public static final long WhitespaceAction = 2L;
    @GlobalConstant("NSControlCharacterHorizontalTabAction")
    public static final long HorizontalTabAction = 4L;
    @GlobalConstant("NSControlCharacterLineBreakAction")
    public static final long LineBreakAction = 8L;
    @GlobalConstant("NSControlCharacterParagraphBreakAction")
    public static final long ParagraphBreakAction = 16L;
    @GlobalConstant("NSControlCharacterContainerBreakAction")
    public static final long ContainerBreakAction = 32L;
    

}
