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






@Mapping("UIControlState")
public final class UIControlState extends ObjCEnum {
    
    @GlobalConstant("UIControlStateNormal")
    public static final long Normal = 0L;
    @GlobalConstant("UIControlStateHighlighted")
    public static final long Highlighted = 1L;
    @GlobalConstant("UIControlStateDisabled")
    public static final long Disabled = 2L;
    @GlobalConstant("UIControlStateSelected")
    public static final long Selected = 4L;
    @GlobalConstant("UIControlStateApplication")
    public static final long Application = 16711680L;
    @GlobalConstant("UIControlStateReserved")
    public static final long Reserved = -16777216L;
    

}
