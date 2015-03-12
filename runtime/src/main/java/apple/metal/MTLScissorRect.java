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





@Mapping("MTLScissorRect")
public class MTLScissorRect 
    extends Struct 
     {

    
    protected MTLScissorRect() {}
    
    
    @DotMapping("x")
    public native @MachineSizedUInt long getX();
    @DotMapping("y")
    public native @MachineSizedUInt long getY();
    @DotMapping("width")
    public native @MachineSizedUInt long getWidth();
    @DotMapping("height")
    public native @MachineSizedUInt long getHeight();
    
    public static native MTLScissorRect create(@MachineSizedUInt long x, @MachineSizedUInt long y, @MachineSizedUInt long width, @MachineSizedUInt long height) /*-[
        MTLScissorRect __new = { .x = x, .y = y, .width = width, .height = height };
        return __new;
    ]-*/;
    public static native MTLScissorRect copyWithx(MTLScissorRect original, @MachineSizedUInt long x) /*-[
        original.x = x;
        return original;
    ]-*/;

    
    public static native MTLScissorRect copyWithy(MTLScissorRect original, @MachineSizedUInt long y) /*-[
        original.y = y;
        return original;
    ]-*/;

    
    public static native MTLScissorRect copyWithwidth(MTLScissorRect original, @MachineSizedUInt long width) /*-[
        original.width = width;
        return original;
    ]-*/;

    
    public static native MTLScissorRect copyWithheight(MTLScissorRect original, @MachineSizedUInt long height) /*-[
        original.height = height;
        return original;
    ]-*/;

    
}
