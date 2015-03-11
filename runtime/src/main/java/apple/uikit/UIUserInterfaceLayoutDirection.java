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

@Library("UIKit")
@Mapping("UIUserInterfaceLayoutDirection")
public final class UIUserInterfaceLayoutDirection extends ObjCEnum {
    
    @GlobalConstant("UIUserInterfaceLayoutDirectionLeftToRight")
    public static final long LeftToRight = 0L;
    @GlobalConstant("UIUserInterfaceLayoutDirectionRightToLeft")
    public static final long RightToLeft = 1L;
    

}
