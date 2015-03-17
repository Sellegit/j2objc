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





@Mapping("CVPlanarPixelBufferInfo_YCbCrPlanar") @Library("CoreVideo/CoreVideo.h")
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
    
    
}
