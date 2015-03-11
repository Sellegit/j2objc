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





@Mapping("MTLRegion")
public class MTLRegion 
    extends Struct 
     {

    
    protected MTLRegion() {}
    
    
    @DotMapping("origin")
    public native MTLOrigin getOrigin();
    @DotMapping("size")
    public native MTLSize getSize();
    
    public static native MTLRegion create(MTLOrigin origin, MTLSize size) /*-[
        MTLRegion __new = { .origin = origin, .size = size };
        return __new;
    ]-*/;
    public static native MTLRegion copyWithorigin(MTLRegion original, MTLOrigin origin) /*-[
        original.origin = origin;
        return __new;
    ]-*/;

    
    public static native MTLRegion copyWithsize(MTLRegion original, MTLSize size) /*-[
        original.size = size;
        return __new;
    ]-*/;

    
}
