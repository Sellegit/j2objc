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
@Mapping("UIButtonType")
public final class UIButtonType extends ObjCEnum {
    
    @GlobalConstant("UIButtonTypeCustom")
    public static final long Custom = 0L;
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("UIButtonTypeSystem")
    public static final long System = 1L;
    @GlobalConstant("UIButtonTypeDetailDisclosure")
    public static final long DetailDisclosure = 2L;
    @GlobalConstant("UIButtonTypeInfoLight")
    public static final long InfoLight = 3L;
    @GlobalConstant("UIButtonTypeInfoDark")
    public static final long InfoDark = 4L;
    @GlobalConstant("UIButtonTypeContactAdd")
    public static final long ContactAdd = 5L;
    @GlobalConstant("UIButtonTypeRoundedRect")
    public static final long RoundedRect = 1L;
    

}
