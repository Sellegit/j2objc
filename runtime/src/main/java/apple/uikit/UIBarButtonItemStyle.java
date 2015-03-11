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





@Library("UIKit")
@Mapping("UIBarButtonItemStyle")
public final class UIBarButtonItemStyle extends ObjCEnum {
    
    @GlobalConstant("UIBarButtonItemStylePlain")
    public static final long Plain = 0L;
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @GlobalConstant("UIBarButtonItemStyleBordered")
    public static final long Bordered = 1L;
    @GlobalConstant("UIBarButtonItemStyleDone")
    public static final long Done = 2L;
    

}
