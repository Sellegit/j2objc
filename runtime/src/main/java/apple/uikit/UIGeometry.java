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

/*<javadoc>*/
/*</javadoc>*/
@Library("UIKit/UIKit.h")
public class UIGeometry 
    extends Object 
     {

    
    
    
    
    
    @GlobalFunction("NSStringFromCGPoint")
    public static native String toString(CGPoint point);
    @GlobalFunction("NSStringFromCGVector")
    public static native String toString(CGVector vector);
    @GlobalFunction("NSStringFromCGSize")
    public static native String toString(CGSize size);
    @GlobalFunction("NSStringFromCGRect")
    public static native String toString(CGRect rect);
    @GlobalFunction("NSStringFromCGAffineTransform")
    public static native String toString(CGAffineTransform transform);
    @GlobalFunction("CGPointFromString")
    public static native CGPoint stringToCGPoint(String string);
    @GlobalFunction("CGVectorFromString")
    public static native CGVector stringToCGVector(String string);
    @GlobalFunction("CGSizeFromString")
    public static native CGSize stringToCGSize(String string);
    @GlobalFunction("CGRectFromString")
    public static native CGRect stringToCGRect(String string);
    @GlobalFunction("CGAffineTransformFromString")
    public static native CGAffineTransform stringToCGAffineTransform(String string);

}
