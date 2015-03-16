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
 * @since Available in iOS 5.0 and later.
 */

@Library("UIKit/UIKit.h")
@Mapping("UITextSpellCheckingType")
public final class UITextSpellCheckingType extends ObjCEnum {
    
    @GlobalConstant("UITextSpellCheckingTypeDefault")
    public static final long Default = 0L;
    @GlobalConstant("UITextSpellCheckingTypeNo")
    public static final long No = 1L;
    @GlobalConstant("UITextSpellCheckingTypeYes")
    public static final long Yes = 2L;
    

}
