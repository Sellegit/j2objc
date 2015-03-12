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





@Mapping("MTLOrigin")
public class MTLOrigin 
    extends Struct 
     {

    
    protected MTLOrigin() {}
    
    
    @DotMapping("x")
    public native @MachineSizedUInt long getX();
    @DotMapping("y")
    public native @MachineSizedUInt long getY();
    @DotMapping("z")
    public native @MachineSizedUInt long getZ();
    
    public static native MTLOrigin create(@MachineSizedUInt long x, @MachineSizedUInt long y, @MachineSizedUInt long z) /*-[
        MTLOrigin __new = { .x = x, .y = y, .z = z };
        return __new;
    ]-*/;
    public static native MTLOrigin copyWithx(MTLOrigin original, @MachineSizedUInt long x) /*-[
        original.x = x;
        return original;
    ]-*/;

    
    public static native MTLOrigin copyWithy(MTLOrigin original, @MachineSizedUInt long y) /*-[
        original.y = y;
        return original;
    ]-*/;

    
    public static native MTLOrigin copyWithz(MTLOrigin original, @MachineSizedUInt long z) /*-[
        original.z = z;
        return original;
    ]-*/;

    
}
