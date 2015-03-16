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
@Mapping("UITextBorderStyle")
public final class UITextBorderStyle extends ObjCEnum {
    
    @GlobalConstant("UITextBorderStyleNone")
    public static final long None = 0L;
    @GlobalConstant("UITextBorderStyleLine")
    public static final long Line = 1L;
    @GlobalConstant("UITextBorderStyleBezel")
    public static final long Bezel = 2L;
    @GlobalConstant("UITextBorderStyleRoundedRect")
    public static final long RoundedRect = 3L;
    

}
