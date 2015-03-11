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
@Mapping("NSStringDrawingOptions")
public final class NSStringDrawingOptions extends ObjCEnum {
    
    @GlobalConstant("NSStringDrawingTruncatesLastVisibleLine")
    public static final long TruncatesLastVisibleLine = 32L;
    @GlobalConstant("NSStringDrawingUsesLineFragmentOrigin")
    public static final long UsesLineFragmentOrigin = 1L;
    @GlobalConstant("NSStringDrawingUsesFontLeading")
    public static final long UsesFontLeading = 2L;
    @GlobalConstant("NSStringDrawingUsesDeviceMetrics")
    public static final long UsesDeviceMetrics = 8L;
    

}
