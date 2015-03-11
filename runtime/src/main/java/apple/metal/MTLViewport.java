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





@Mapping("MTLViewport")
public class MTLViewport 
    extends Struct 
     {

    
    protected MTLViewport() {}
    
    
    @DotMapping("originX")
    public native double getOriginX();
    @DotMapping("originY")
    public native double getOriginY();
    @DotMapping("width")
    public native double getWidth();
    @DotMapping("height")
    public native double getHeight();
    @DotMapping("znear")
    public native double getZnear();
    @DotMapping("zfar")
    public native double getZfar();
    
    public static native MTLViewport create(double originX, double originY, double width, double height, double znear, double zfar) /*-[
        MTLViewport __new = { .originX = originX, .originY = originY, .width = width, .height = height, .znear = znear, .zfar = zfar };
        return __new;
    ]-*/;
    public static native MTLViewport copyWithoriginX(MTLViewport original, double originX) /*-[
        original.originX = originX;
        return __new;
    ]-*/;

    
    public static native MTLViewport copyWithoriginY(MTLViewport original, double originY) /*-[
        original.originY = originY;
        return __new;
    ]-*/;

    
    public static native MTLViewport copyWithwidth(MTLViewport original, double width) /*-[
        original.width = width;
        return __new;
    ]-*/;

    
    public static native MTLViewport copyWithheight(MTLViewport original, double height) /*-[
        original.height = height;
        return __new;
    ]-*/;

    
    public static native MTLViewport copyWithznear(MTLViewport original, double znear) /*-[
        original.znear = znear;
        return __new;
    ]-*/;

    
    public static native MTLViewport copyWithzfar(MTLViewport original, double zfar) /*-[
        original.zfar = zfar;
        return __new;
    ]-*/;

    
}
