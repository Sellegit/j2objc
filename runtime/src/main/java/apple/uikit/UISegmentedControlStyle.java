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
 * @since Available in iOS 2.0 and later.
 * @deprecated Deprecated in iOS 7.0.
 */
@Deprecated

@Library("UIKit")
@Mapping("UISegmentedControlStyle")
public final class UISegmentedControlStyle extends ObjCEnum {
    
    @GlobalConstant("UISegmentedControlStylePlain")
    public static final long Plain = 0L;
    @GlobalConstant("UISegmentedControlStyleBordered")
    public static final long Bordered = 1L;
    @GlobalConstant("UISegmentedControlStyleBar")
    public static final long Bar = 2L;
    @GlobalConstant("UISegmentedControlStyleBezeled")
    public static final long Bezeled = 3L;
    

}
