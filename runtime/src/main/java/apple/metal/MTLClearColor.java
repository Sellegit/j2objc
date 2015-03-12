package apple.metal;


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
import apple.dispatch.*;





@Mapping("MTLClearColor")
public class MTLClearColor 
    extends Struct 
     {

    
    protected MTLClearColor() {}
    
    
    @DotMapping("red")
    public native double getRed();
    @DotMapping("green")
    public native double getGreen();
    @DotMapping("blue")
    public native double getBlue();
    @DotMapping("alpha")
    public native double getAlpha();
    
    public static native MTLClearColor create(double red, double green, double blue, double alpha) /*-[
        MTLClearColor __new = { .red = red, .green = green, .blue = blue, .alpha = alpha };
        return __new;
    ]-*/;
    public static native MTLClearColor copyWithred(MTLClearColor original, double red) /*-[
        original.red = red;
        return original;
    ]-*/;

    
    public static native MTLClearColor copyWithgreen(MTLClearColor original, double green) /*-[
        original.green = green;
        return original;
    ]-*/;

    
    public static native MTLClearColor copyWithblue(MTLClearColor original, double blue) /*-[
        original.blue = blue;
        return original;
    ]-*/;

    
    public static native MTLClearColor copyWithalpha(MTLClearColor original, double alpha) /*-[
        original.alpha = alpha;
        return original;
    ]-*/;

    
}
