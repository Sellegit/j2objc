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
@Mapping("UIGuidedAccessRestrictionState")
public final class UIGuidedAccessRestrictionState extends ObjCEnum {
    
    @GlobalConstant("UIGuidedAccessRestrictionStateAllow")
    public static final long Allow = 0L;
    @GlobalConstant("UIGuidedAccessRestrictionStateDeny")
    public static final long Deny = 1L;


}
