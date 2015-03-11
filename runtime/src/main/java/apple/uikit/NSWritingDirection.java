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
 * @since Available in iOS 6.0 and later.
 */

@Library("UIKit")
@Mapping("NSWritingDirection")
public final class NSWritingDirection extends ObjCEnum {
    
    @GlobalConstant("NSWritingDirectionNatural")
    public static final long Natural = -1L;
    @GlobalConstant("NSWritingDirectionLeftToRight")
    public static final long LeftToRight = 0L;
    @GlobalConstant("NSWritingDirectionRightToLeft")
    public static final long RightToLeft = 1L;
    

}
