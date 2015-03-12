package apple.corevideo;


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
import apple.opengles.*;
import apple.coremedia.*;
import apple.metal.*;





@Mapping("CVPlanarPixelBufferInfo_YCbCrPlanar")
public class CVPlanarPixelBufferInfo_YCbCrPlanar 
    extends Struct 
     {

    
    protected CVPlanarPixelBufferInfo_YCbCrPlanar() {}
    
    
    @DotMapping("componentInfoY")
    public native CVPlanarComponentInfo getComponentInfoY();
    @DotMapping("componentInfoCb")
    public native CVPlanarComponentInfo getComponentInfoCb();
    @DotMapping("componentInfoCr")
    public native CVPlanarComponentInfo getComponentInfoCr();
    
    public static native CVPlanarPixelBufferInfo_YCbCrPlanar create(CVPlanarComponentInfo componentInfoY, CVPlanarComponentInfo componentInfoCb, CVPlanarComponentInfo componentInfoCr) /*-[
        CVPlanarPixelBufferInfo_YCbCrPlanar __new = { .componentInfoY = componentInfoY, .componentInfoCb = componentInfoCb, .componentInfoCr = componentInfoCr };
        return __new;
    ]-*/;
    public static native CVPlanarPixelBufferInfo_YCbCrPlanar copyWithcomponentInfoY(CVPlanarPixelBufferInfo_YCbCrPlanar original, CVPlanarComponentInfo componentInfoY) /*-[
        original.componentInfoY = componentInfoY;
        return original;
    ]-*/;

    
    public static native CVPlanarPixelBufferInfo_YCbCrPlanar copyWithcomponentInfoCb(CVPlanarPixelBufferInfo_YCbCrPlanar original, CVPlanarComponentInfo componentInfoCb) /*-[
        original.componentInfoCb = componentInfoCb;
        return original;
    ]-*/;

    
    public static native CVPlanarPixelBufferInfo_YCbCrPlanar copyWithcomponentInfoCr(CVPlanarPixelBufferInfo_YCbCrPlanar original, CVPlanarComponentInfo componentInfoCr) /*-[
        original.componentInfoCr = componentInfoCr;
        return original;
    ]-*/;

    
}
