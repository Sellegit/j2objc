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

@Library("UIKit")
@Mapping("UIRectEdge")
public final class UIRectEdge extends ObjCEnum {
    
    @GlobalConstant("UIRectEdgeNone")
    public static final long None = 0L;
    @GlobalConstant("UIRectEdgeTop")
    public static final long Top = 1L;
    @GlobalConstant("UIRectEdgeLeft")
    public static final long Left = 2L;
    @GlobalConstant("UIRectEdgeBottom")
    public static final long Bottom = 4L;
    @GlobalConstant("UIRectEdgeRight")
    public static final long Right = 8L;
    @GlobalConstant("UIRectEdgeAll")
    public static final long All = 15L;
    

}
