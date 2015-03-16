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





@Library("UIKit/UIKit.h")
@Mapping("UITextFieldViewMode")
public final class UITextFieldViewMode extends ObjCEnum {
    
    @GlobalConstant("UITextFieldViewModeNever")
    public static final long Never = 0L;
    @GlobalConstant("UITextFieldViewModeWhileEditing")
    public static final long WhileEditing = 1L;
    @GlobalConstant("UITextFieldViewModeUnlessEditing")
    public static final long UnlessEditing = 2L;
    @GlobalConstant("UITextFieldViewModeAlways")
    public static final long Always = 3L;
    

}
