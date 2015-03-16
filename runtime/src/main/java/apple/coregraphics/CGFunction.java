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
public class CGFunction 
    extends CFType 
     {

    
    
    protected CGFunction() {}
    
    
    
    
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGFunctionGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGFunctionCreate")
    protected static native CGFunction create(Todo info, @MachineSizedUInt long domainDimension, Todo domain, @MachineSizedUInt long rangeDimension, Todo range, CGFunctionCallbacks callbacks);
    
}
