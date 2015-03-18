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
@Library("CoreGraphics/CoreGraphics.h")
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
    public static native CGGradient create(CGColorSpace space, Todo components, Todo locations, @MachineSizedUInt long count);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGGradientCreateWithColors")
    public static native CGGradient create(CGColorSpace space, NSArray<?> colors, Todo locations);
    
}
