package apple.coregraphics;


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
import apple.uikit.*;


/*<javadoc>*/
/*</javadoc>*/
@Library("CoreGraphics")
public class CGGradient 
    extends CFType 
     {

    
    
    protected CGGradient() {}
    
    
    
    
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGGradientGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGGradientCreateWithColorComponents")
    protected static native CGGradient create(CGColorSpace space, @Pointer long components, @Pointer long locations, @MachineSizedUInt long count);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGGradientCreateWithColors")
    protected static native CGGradient create(CGColorSpace space, CFArray colors, @Pointer long locations);
    
}
