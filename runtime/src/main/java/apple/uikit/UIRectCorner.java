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
@Mapping("UIRectCorner")
public final class UIRectCorner extends ObjCEnum {
    
    @GlobalConstant("UIRectCornerTopLeft")
    public static final long TopLeft = 1L;
    @GlobalConstant("UIRectCornerTopRight")
    public static final long TopRight = 2L;
    @GlobalConstant("UIRectCornerBottomLeft")
    public static final long BottomLeft = 4L;
    @GlobalConstant("UIRectCornerBottomRight")
    public static final long BottomRight = 8L;
    @GlobalConstant("UIRectCornerAllCorners")
    public static final long AllCorners = -1L;


}
