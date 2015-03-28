package apple.foundation;


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
import apple.uikit.*;
import apple.coreanimation.*;
import apple.coredata.*;
import apple.coremedia.*;
import apple.security.*;
import apple.dispatch.*;


@Library("Foundation/Foundation.h")
@Mapping("NSKeyValueObservingOptions")
public final class NSKeyValueObservingOptions extends ObjCEnum {
    
    @GlobalConstant("NSKeyValueObservingOptionNew")
    public static final long New = 1L;
    @GlobalConstant("NSKeyValueObservingOptionOld")
    public static final long Old = 2L;
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("NSKeyValueObservingOptionInitial")
    public static final long Initial = 4L;
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("NSKeyValueObservingOptionPrior")
    public static final long Prior = 8L;


}
