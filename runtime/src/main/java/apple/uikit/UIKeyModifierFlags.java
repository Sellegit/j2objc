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


@Mapping("UIKeyModifierFlags")
public final class UIKeyModifierFlags extends ObjCEnum {
    
    @GlobalConstant("UIKeyModifierAlphaShift")
    public static final long AlphaShift = 65536L;
    @GlobalConstant("UIKeyModifierShift")
    public static final long Shift = 131072L;
    @GlobalConstant("UIKeyModifierControl")
    public static final long Control = 262144L;
    @GlobalConstant("UIKeyModifierAlternate")
    public static final long Alternate = 524288L;
    @GlobalConstant("UIKeyModifierCommand")
    public static final long Command = 1048576L;
    @GlobalConstant("UIKeyModifierNumericPad")
    public static final long NumericPad = 2097152L;
    

}
