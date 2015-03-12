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





@Mapping("MTLSize")
public class MTLSize 
    extends Struct 
     {

    
    protected MTLSize() {}
    
    
    @DotMapping("width")
    public native @MachineSizedUInt long getWidth();
    @DotMapping("height")
    public native @MachineSizedUInt long getHeight();
    @DotMapping("depth")
    public native @MachineSizedUInt long getDepth();
    
    public static native MTLSize create(@MachineSizedUInt long width, @MachineSizedUInt long height, @MachineSizedUInt long depth) /*-[
        MTLSize __new = { .width = width, .height = height, .depth = depth };
        return __new;
    ]-*/;
    public static native MTLSize copyWithwidth(MTLSize original, @MachineSizedUInt long width) /*-[
        original.width = width;
        return original;
    ]-*/;

    
    public static native MTLSize copyWithheight(MTLSize original, @MachineSizedUInt long height) /*-[
        original.height = height;
        return original;
    ]-*/;

    
    public static native MTLSize copyWithdepth(MTLSize original, @MachineSizedUInt long depth) /*-[
        original.depth = depth;
        return original;
    ]-*/;

    
}
