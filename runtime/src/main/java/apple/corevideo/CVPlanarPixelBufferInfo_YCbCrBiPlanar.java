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





@Mapping("CVPlanarPixelBufferInfo_YCbCrBiPlanar") @Library("CoreVideo/CoreVideo.h")
public class CVPlanarPixelBufferInfo_YCbCrBiPlanar 
    extends Struct 
     {

    
    protected CVPlanarPixelBufferInfo_YCbCrBiPlanar() {}
    
    
    @DotMapping("componentInfoY")
    public native CVPlanarComponentInfo getComponentInfoY();
    @DotMapping("componentInfoCbCr")
    public native CVPlanarComponentInfo getComponentInfoCbCr();
    
    public static native CVPlanarPixelBufferInfo_YCbCrBiPlanar create(CVPlanarComponentInfo componentInfoY, CVPlanarComponentInfo componentInfoCbCr) /*-[
        CVPlanarPixelBufferInfo_YCbCrBiPlanar __new = { .componentInfoY = componentInfoY, .componentInfoCbCr = componentInfoCbCr };
        return __new;
    ]-*/;
    public static native CVPlanarPixelBufferInfo_YCbCrBiPlanar copyWithcomponentInfoY(CVPlanarPixelBufferInfo_YCbCrBiPlanar original, CVPlanarComponentInfo componentInfoY) /*-[
        original.componentInfoY = componentInfoY;
        return original;
    ]-*/;

    
    public static native CVPlanarPixelBufferInfo_YCbCrBiPlanar copyWithcomponentInfoCbCr(CVPlanarPixelBufferInfo_YCbCrBiPlanar original, CVPlanarComponentInfo componentInfoCbCr) /*-[
        original.componentInfoCbCr = componentInfoCbCr;
        return original;
    ]-*/;

    
}
